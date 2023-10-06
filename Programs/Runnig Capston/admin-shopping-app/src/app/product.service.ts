import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
baseUrl:string ="http://localhost:3000/products";
  constructor(public http:HttpClient) { }

  loadAllProduct():Observable<Product[]> {
    return this.http.get<Product[]>(this.baseUrl);
  }

  storeProduct(product:any):any {
    return this.http.post(this.baseUrl,product);
  }

  deleteProduct(pid:number):any {
    return this.http.delete(this.baseUrl+"/"+pid);
  }

  updateProduct(product:any):any{
    return this.http.put(this.baseUrl+"/"+product.id,product);
  }
  
}
