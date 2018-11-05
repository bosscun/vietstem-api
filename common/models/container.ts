import { PersistedModel } from 'loopback';
import { Request, Response } from 'express';
import { uid } from '../../server/uid';

const nextUid = uid();

module.exports = function (ContainerModel: typeof PersistedModel) {
  ContainerModel.getApp(function (err, app: any) {
    if (err) {
      return err;
    }
    app.dataSources.storage.connector.getFilename = (uploadingFile: any, req: Request, res: Response) => {
      const splited = uploadingFile.name.split('.');
      return [nextUid(), splited.length > 1 ? splited[splited.length - 1] : 'dat'].join('.');
    };
  });
};
