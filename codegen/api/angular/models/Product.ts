/* tslint:disable */

declare var Object: any;
export interface ProductInterface {
  "name"?: string;
  "feature"?: string;
  "kind"?: string;
  "price"?: string;
  "discount"?: number;
  "id"?: number;
  "createdAt"?: Date;
  "updatedAt"?: Date;
}

export class Product implements ProductInterface {
  "name": string;
  "feature": string;
  "kind": string;
  "price": string;
  "discount": number;
  "id": number;
  "createdAt": Date;
  "updatedAt": Date;
  constructor(data?: ProductInterface) {
    Object.assign(this, data);
  }
  /**
   * The name of the model represented by this $resource,
   * i.e. `Product`.
   */
  public static getModelName() {
    return "Product";
  }
  /**
  * @method factory
  * @author Jonathan Casarrubias
  * @license MIT
  * This method creates an instance of Product for dynamic purposes.
  **/
  public static factory(data: ProductInterface): Product{
    return new Product(data);
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
      name: 'Product',
      plural: 'Products',
      path: 'Products',
      idName: 'id',
      properties: {
        "name": {
          name: 'name',
          type: 'string'
        },
        "feature": {
          name: 'feature',
          type: 'string'
        },
        "kind": {
          name: 'kind',
          type: 'string'
        },
        "price": {
          name: 'price',
          type: 'string'
        },
        "discount": {
          name: 'discount',
          type: 'number'
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
