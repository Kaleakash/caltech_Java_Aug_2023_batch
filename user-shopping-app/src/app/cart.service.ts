import { Injectable } from '@angular/core';
import { Cart } from './cart';
import {BehaviorSubject} from 'rxjs'
@Injectable({
  providedIn: 'root'
})
export class CartService {  
  cartData = new BehaviorSubject<Cart[]>([])
  constructor() { }

  get getCart() {
    return this.cartData.asObservable();    // creating custom observable. 
  }

  addDataToCart(product:any){

    this.getCart.subscribe({
      
      next:(data:any)=> {
            let flag = data.find((p:any)=>p.title==product.title);
            if(flag==undefined){
              data.push(product)
              alert("Product added in cart")
            }else {
              alert("Product already present in cart");
            }
      },

      error:(error:any)=> {

      },

      complete:()=> {

      }
    })

  }
}
