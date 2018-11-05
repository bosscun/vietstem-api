/* tslint:disable */

declare var Object: any;
export interface CourseInterface {
  "name"?: string;
  "description"?: string;
  "image"?: string;
  "url"?: string;
  "price"?: string;
  "discount"?: string;
  "kind"?: string;
  "teacher"?: string;
  "time"?: string;
  "id"?: number;
  "createdAt"?: Date;
  "updatedAt"?: Date;
}

export class Course implements CourseInterface {
  "name": string;
  "description": string;
  "image": string;
  "url": string;
  "price": string;
  "discount": string;
  "kind": string;
  "teacher": string;
  "time": string;
  "id": number;
  "createdAt": Date;
  "updatedAt": Date;
  constructor(data?: CourseInterface) {
    Object.assign(this, data);
  }
  /**
   * The name of the model represented by this $resource,
   * i.e. `Course`.
   */
  public static getModelName() {
    return "Course";
  }
  /**
  * @method factory
  * @author Jonathan Casarrubias
  * @license MIT
  * This method creates an instance of Course for dynamic purposes.
  **/
  public static factory(data: CourseInterface): Course{
    return new Course(data);
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
      name: 'Course',
      plural: 'Courses',
      path: 'Courses',
      idName: 'id',
      properties: {
        "name": {
          name: 'name',
          type: 'string'
        },
        "description": {
          name: 'description',
          type: 'string'
        },
        "image": {
          name: 'image',
          type: 'string'
        },
        "url": {
          name: 'url',
          type: 'string'
        },
        "price": {
          name: 'price',
          type: 'string'
        },
        "discount": {
          name: 'discount',
          type: 'string'
        },
        "kind": {
          name: 'kind',
          type: 'string'
        },
        "teacher": {
          name: 'teacher',
          type: 'string'
        },
        "time": {
          name: 'time',
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
