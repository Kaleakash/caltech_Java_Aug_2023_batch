import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'  // this code is equal to provider in app.module.ts file
})
export class ProductService {

  constructor(public http:HttpClient) { }  // DI for HttpClient 

  loadFakeProduct() {
    this.http.get("https://fakestoreapi.com/products").subscribe({
      next:(data:any)=> {
          console.log(data);
      },
      error:(error:any)=>{
            console.log(error)
      },
      complete:()=> {
          console.log("completed!")
      }
    });

  }
// we return object of product array to compoent after type casting. 
loadFakeJsonData():Observable<Product[]> {
  return this.http.get<Product[]>("https://fakestoreapi.com/products");
}







}
