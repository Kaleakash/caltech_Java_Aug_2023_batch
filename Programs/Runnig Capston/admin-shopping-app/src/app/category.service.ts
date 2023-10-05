import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import { Category } from './category';
@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  baseUrl:string ="http://localhost:3000/categories"
  constructor(public http:HttpClient) { } // DI for HttpClient

  loadAllCategoriesInformation():Observable<Category[]>{
    return this.http.get<Category[]>(this.baseUrl);
  }

  // store data in json file using post method 
  // 1st parameter url 
  //2nd parameter is object in json format. 
  storeCategoryDetails(category:any):any{
    return this.http.post(this.baseUrl,category);
  }

  // delete category 
  // http://localhost:3000/category/3 
  deleteCategory(cid:any):any {
    return this.http.delete(this.baseUrl+"/"+cid);
  }

  // update data in json file using post method 
  // 1st parameter url 
  //2nd parameter is object in json format. 
  updateCategoryDetails(category:any):any{
    return this.http.put(this.baseUrl+"/"+category.id,category);
  }
}
