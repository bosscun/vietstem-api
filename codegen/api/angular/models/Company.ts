/* tslint:disable */

declare var Object: any;
export interface CompanyInterface {
  "name"?: string;
  "email"?: string;
  "phone"?: string;
  "address"?: string;
  "level"?: string;
  "director"?: string;
  "status"?: string;
  "id"?: number;
  "createdAt"?: Date;
  "updatedAt"?: Date;
}

export class Company implements CompanyInterface {
  "name": string;
  "email": string;
  "phone": string;
  "address": string;
  "level": string;
  "director": string;
  "status": string;
  "id": number;
  "createdAt": Date;
  "updatedAt": Date;
  constructor(data?: CompanyInterface) {
    Object.assign(this, data);
  }
  /**
   * The name of the model represented by this $resource,
   * i.e. `Company`.
   */
  public static getModelName() {
    return "Company";
  }
  /**
  * @method factory
  * @author Jonathan Casarrubias
  * @license MIT
  * This method creates an instance of Company for dynamic purposes.
  **/
  public static factory(data: CompanyInterface): Company{
    return new Company(data);
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
      name: 'Company',
      plural: 'Companies',
      path: 'Companies',
      idName: 'id',
      properties: {
        "name": {
          name: 'name',
          type: 'string'
        },
        "email": {
          name: 'email',
          type: 'string'
        },
        "phone": {
          name: 'phone',
          type: 'string'
        },
        "address": {
          name: 'address',
          type: 'string'
        },
        "level": {
          name: 'level',
          type: 'string'
        },
        "director": {
          name: 'director',
          type: 'string'
        },
        "status": {
          name: 'status',
          type: 'string'
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
      },
      relations: {
      }
    }
  }
}
