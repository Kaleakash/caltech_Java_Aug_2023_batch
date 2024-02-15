import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-productbycustomer',
  templateUrl: './productbycustomer.component.html',
  styleUrls: ['./productbycustomer.component.css']
})
export class ProductbycustomerComponent implements OnInit{

  products:Array<Product>=[];

  constructor(public ps:ProductService){}
  
  ngOnInit(): void {
      this.loadAllProduct();
  }

  loadAllProduct(): void {
    this.ps.findProduct().subscribe({
      next:(data:any)=>this.products=data,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("all product loaded successfully")
    })
  }

  addToCart(product:any): void {
    console.log(product)  
    // we need to add all product in array with pid,pname,qty(1), if we click on same 
    //product then we need to display error message product already present in cart
    // then we need cart link to display all product present in cart then we can 
    // display option to increment or decrement the qty and place the order.   
  }


}
