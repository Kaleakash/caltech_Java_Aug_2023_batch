import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
@Component({
  selector: 'app-viewproduct',
  templateUrl: './viewproduct.component.html',
  styleUrls: ['./viewproduct.component.css']
})
export class ViewproductComponent {
  flag:boolean = false;
  products:Array<Product>=[];
  constructor(public productService:ProductService){}     // DI for Service class 
  loadProductInfo() : void {
    this.flag=true;
      this.productService.loadProductDetails().subscribe({
        next:(result:any)=> {
          this.products=result;
        },
        error:(error:any)=> {
          console.log(error)
        },
        complete:()=> {
          console.log("done!")
        }
      })
  }
}
