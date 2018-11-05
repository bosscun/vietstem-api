/* tslint:disable */
import {
  Role,
  AccountAccessToken
} from '../index';

declare var Object: any;
export interface AccountInterface {
  "address"?: string;
  "phone"?: string;
  "kind"?: string;
  "role"?: string;
  "status"?: string;
  "realm"?: string;
  "username"?: string;
  "email": string;
  "emailVerified"?: boolean;
  "id"?: number;
  "createdAt"?: Date;
  "updatedAt"?: Date;
  "password"?: string;
  roles?: Role[];
  accessTokens?: AccountAccessToken[];
}

export class Account implements AccountInterface {
  "address": string;
  "phone": string;
  "kind": string;
  "role": string;
  "status": string;
  "realm": string;
  "username": string;
  "email": string;
  "emailVerified": boolean;
  "id": number;
  "createdAt": Date;
  "updatedAt": Date;
  "password": string;
  roles: Role[];
  accessTokens: AccountAccessToken[];
  constructor(data?: AccountInterface) {
    Object.assign(this, data);
  }
  /**
   * The name of the model represented by this $resource,
   * i.e. `Account`.
   */
  public static getModelName() {
    return "Account";
  }
  /**
  * @method factory
  * @author Jonathan Casarrubias
  * @license MIT
  * This method creates an instance of Account for dynamic purposes.
  **/
  public static factory(data: AccountInterface): Account{
    return new Account(data);
  }
  /**
  * @method getModelDefinition
  * @author Julien Ledun
  * @license MIT
  * This method returns an object that represents some of the model
  * definitions.
  **/
  public static getModelDefinition() {
    return {
      name: 'Account',
      plural: 'Accounts',
      path: 'Accounts',
      idName: 'id',
      properties: {
        "address": {
          name: 'address',
          type: 'string'
        },
        "phone": {
          name: 'phone',
          type: 'string'
        },
        "kind": {
          name: 'kind',
          type: 'string'
        },
        "role": {
          name: 'role',
          type: 'string'
        },
        "status": {
          name: 'status',
          type: 'string'
        },
        "realm": {
          name: 'realm',
          type: 'string'
        },
        "username": {
          name: 'username',
          type: 'string'
        },
        "email": {
          name: 'email',
          type: 'string'
        },
        "emailVerified": {
          name: 'emailVerified',
          type: 'boolean'
        },
        "id": {
          name: 'id',
          type: 'number'
        },
        "createdAt": {
          name: 'createdAt',
          type: 'Date'
        },
        "updatedAt": {
          name: 'updatedAt',
          type: 'Date'
        },
        "password": {
          name: 'password',
          type: 'string'
        },
      },
      relations: {
        roles: {
          name: 'roles',
          type: 'Role[]',
          model: 'Role',
          relationType: 'hasMany',
          modelThrough: 'RoleMapping',
          keyThrough: 'roleId',
          keyFrom: 'id',
          keyTo: 'principalId'
        },
        accessTokens: {
          name: 'accessTokens',
          type: 'AccountAccessToken[]',
          model: 'AccountAccessToken',
          relationType: 'hasMany',
                  keyFrom: 'id',
          keyTo: 'userId'
        },
      }
    }
  }
}
