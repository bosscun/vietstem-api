/* tslint:disable */

declare var Object: any;
export interface SubmissionsInterface {
  "groupName"?: string;
  "teacher"?: string;
  "class"?: string;
  "phone"?: number;
  "city"?: string;
  "district"?: string;
  "school"?: string;
  "id"?: number;
  "createdAt"?: Date;
  "updatedAt"?: Date;
}

export class Submissions implements SubmissionsInterface {
  "groupName": string;
  "teacher": string;
  "class": string;
  "phone": number;
  "city": string;
  "district": string;
  "school": string;
  "id": number;
  "createdAt": Date;
  "updatedAt": Date;
  constructor(data?: SubmissionsInterface) {
    Object.assign(this, data);
  }
  /**
   * The name of the model represented by this $resource,
   * i.e. `Submissions`.
   */
  public static getModelName() {
    return "Submissions";
  }
  /**
  * @method factory
  * @author Jonathan Casarrubias
  * @license MIT
  * This method creates an instance of Submissions for dynamic purposes.
  **/
  public static factory(data: SubmissionsInterface): Submissions{
    return new Submissions(data);
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
      name: 'Submissions',
      plural: 'Submissions',
      path: 'Submissions',
      idName: 'id',
      properties: {
        "groupName": {
          name: 'groupName',
          type: 'string'
        },
        "teacher": {
          name: 'teacher',
          type: 'string'
        },
        "class": {
          name: 'class',
          type: 'string'
        },
        "phone": {
          name: 'phone',
          type: 'number'
        },
        "city": {
          name: 'city',
          type: 'string'
        },
        "district": {
          name: 'district',
          type: 'string'
        },
        "school": {
          name: 'school',
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
