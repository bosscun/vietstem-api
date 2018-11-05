/* tslint:disable */

declare var Object: any;
export interface AskInterface {
  "fullname"?: string;
  "email"?: string;
  "description"?: string;
  "id"?: number;
  "createdAt"?: Date;
  "updatedAt"?: Date;
}

export class Ask implements AskInterface {
  "fullname": string;
  "email": string;
  "description": string;
  "id": number;
  "createdAt": Date;
  "updatedAt": Date;
  constructor(data?: AskInterface) {
    Object.assign(this, data);
  }
  /**
   * The name of the model represented by this $resource,
   * i.e. `Ask`.
   */
  public static getModelName() {
    return "Ask";
  }
  /**
  * @method factory
  * @author Jonathan Casarrubias
  * @license MIT
  * This method creates an instance of Ask for dynamic purposes.
  **/
  public static factory(data: AskInterface): Ask{
    return new Ask(data);
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
      name: 'Ask',
      plural: 'Asks',
      path: 'Asks',
      idName: 'id',
      properties: {
        "fullname": {
          name: 'fullname',
          type: 'string'
        },
        "email": {
          name: 'email',
          type: 'string'
        },
        "description": {
          name: 'description',
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
