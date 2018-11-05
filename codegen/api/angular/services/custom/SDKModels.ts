/* tslint:disable */
import { Injectable } from '@angular/core';
import { Application } from '../../models/Application';
import { Installation } from '../../models/Installation';
import { Notification } from '../../models/Notification';
import { RoleMapping } from '../../models/RoleMapping';
import { Role } from '../../models/Role';
import { Container } from '../../models/Container';
import { Email } from '../../models/Email';
import { Push } from '../../models/Push';
import { Account } from '../../models/Account';
import { Course } from '../../models/Course';
import { Product } from '../../models/Product';
import { Faq } from '../../models/Faq';
import { Ask } from '../../models/Ask';
import { Submissions } from '../../models/Submissions';
import { Post } from '../../models/Post';
import { Company } from '../../models/Company';
import { AccountAccessToken } from '../../models/AccountAccessToken';

export interface Models { [name: string]: any }

@Injectable()
export class SDKModels {

  private models: Models = {
    Application: Application,
    Installation: Installation,
    Notification: Notification,
    RoleMapping: RoleMapping,
    Role: Role,
    Container: Container,
    Email: Email,
    Push: Push,
    Account: Account,
    Course: Course,
    Product: Product,
    Faq: Faq,
    Ask: Ask,
    Submissions: Submissions,
    Post: Post,
    Company: Company,
    AccountAccessToken: AccountAccessToken,
    
  };

  public get(modelName: string): any {
    return this.models[modelName];
  }

  public getAll(): Models {
    return this.models;
  }

  public getModelNames(): string[] {
    return Object.keys(this.models);
  }
}
