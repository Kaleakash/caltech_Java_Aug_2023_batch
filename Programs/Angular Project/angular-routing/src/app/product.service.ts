import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import { Product } from './product';
@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(public http:HttpClient) { }    // DI for HttpClient 

  loadProductDetails():Observable<Product[]> {
    return this.http.get<Product[]>("http://localhost:3000/products")
  }
}
