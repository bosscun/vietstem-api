import * as _ from 'lodash';
import * as moment from 'moment';
import { strictEqual } from 'assert';
import { Application, PersistedModel, Role, RoleMapping } from 'loopback';
import {
  Account,
  Ask,
  Company,
  Course,
  Installation,
  Faq,
  Post,
  Product,
  Submissions
} from '../../codegen/api/fetch/api';

module.exports = function (app: any) {
  async function automigrate(model: string): Promise<typeof PersistedModel> {
    return new Promise<typeof PersistedModel>((resolve, reject) => {
      app.dataSources.mysql.automigrate(model, function (err: Error) {
        if (err) {
          return reject(err);
        }
        resolve(app.models[model]);
      });
    });
  }

  async function autoupdate(model: string): Promise<typeof PersistedModel> {
    return new Promise<typeof PersistedModel>((resolve, reject) => {
      app.dataSources.mysql.autoupdate(model, function (err: Error) {
        if (err) {
          return reject(err);
        }
        resolve(app.models[model]);
      });
    });
  }

  (async () => {
    const [
      Application,
      Notification,
      ACL,
      RoleMapping,
      Role,
      Account,
      Ask,
      Company,
      Course,
      Faq,
      Post,
      Product,
      Submissions
    ] = await Promise.all(_.map([
      'Application',
      'Notification',
      'ACL',
      'Account',
      'Ask',
      'Company',
      'Course',
      'Faq',
      'Post',
      'Product',
      'Submissions'
    ], process.env.NODE_ENV === 'production' ? autoupdate : automigrate));

    const [
      Installation,
      AccountAccessToken
    ] = await Promise.all(_.map([
      'Installation',
      'AccountAccessToken'
    ], autoupdate));

    // const installations: Installation[] = [{
    //   appId: 'bfast.link.drfank',
    //   deviceType: 'android',
    //   deviceToken: 'XXX',
    //   userId: '2'
    // }];
    //
    // for (let datum of installations) {
    //   await Installation.create(datum);
    // }

    if (process.env.NODE_ENV === 'production') {
      return;
    }

    console.log('seeding');

    const application = {
      id: 'bfast.link.drfank',
      userId: 'linktohack',
      name: 'DrFrank App',
      description: 'DrFrank Application',
      pushSettings: {
        apns: {
          token: {
            keyId: '93VL5JJY64',
            key: './server/credentials/AuthKey_93VL5JJY64.p8',
            teamId: 'A6HH75QWMS'
          },
          bundle: 'bfast.link.drfank',
          production: true
        },
        gcm: {
          serverApiKey: 'AAAAnsa6iOE:APA91bGUxjhSJUFa0n1r83dcA8nMgMhAI9O0r_bjtlyg-36rtWSSq6EgHd3YEOgBRiyWBFoZRDBuvov3YWo1L1UmRDCfRclEK9RMrqTrqxVO9YBEpl-h1RG0Qz5nGYljTDo8ywXcgCLJ'
        }
      }
    };

    (Application as any).observe('before save', function (context: any, next: Function) {
      if (context.instance && context.instance.name === application.name) {
        context.instance.id = application.id;
      }
      next();
    });

    await (Application as any).register(application.userId, application.name, {
      description: application.description,
      pushSettings: application.pushSettings
    });

    const users: (Account & { password: string })[] = [
      {
        username : 'tantn',
        password : 'test',
        email : 'tantn@hyrule.me'
      }
    ];

    for (let datum of users) {
      await Account.create(datum);
    }


    const principals = [{
      principalType: (RoleMapping as any).USER,
      principalId: 1,
      roleId: 1
    }];

    for (let datum of principals) {
      await RoleMapping.create(datum);
    }


  })()
    .catch(error => {
      console.error('seed', error);
    });
};
