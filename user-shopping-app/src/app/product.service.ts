import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs'
import { Product } from './product';
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  baseUrl:string ="http://localhost:3000/products";

  constructor(public http:HttpClient) { }  // DI for HttpClient 


  loadAllProduct():Observable<Product[]> {
      return this.http.get<Product[]>(this.baseUrl);
  } 
}
