/* tslint:disable */

declare var Object: any;
export interface FaqInterface {
  "question"?: string;
  "answers"?: string;
  "kind"?: string;
  "id"?: number;
  "createdAt"?: Date;
  "updatedAt"?: Date;
}

export class Faq implements FaqInterface {
  "question": string;
  "answers": string;
  "kind": string;
  "id": number;
  "createdAt": Date;
  "updatedAt": Date;
  constructor(data?: FaqInterface) {
    Object.assign(this, data);
  }
  /**
   * The name of the model represented by this $resource,
   * i.e. `Faq`.
   */
  public static getModelName() {
    return "Faq";
  }
  /**
  * @method factory
  * @author Jonathan Casarrubias
  * @license MIT
  * This method creates an instance of Faq for dynamic purposes.
  **/
  public static factory(data: FaqInterface): Faq{
    return new Faq(data);
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
      name: 'Faq',
      plural: 'Faqs',
      path: 'Faqs',
      idName: 'id',
      properties: {
        "question": {
          name: 'question',
          type: 'string'
        },
        "answers": {
          name: 'answers',
          type: 'string'
        },
        "kind": {
          name: 'kind',
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
