import { Component,OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit{
  numberOfProducts:number=0;
  products:Array<Product>=[];

  constructor(public productService:ProductService,public cartService:CartService){}  // DI for Product Service 

  ngOnInit(): void {
      this.productService.loadAllProduct().subscribe({
        next:(result:any)=> {
              this.products=result;
        },
        error:(error:any)=> {
            console.log(error)
        },
        complete:()=> {
            console.log("Product loaded successfully!");
        }
      })   

  }

  addToCart(product:any){
      product.qty=1;
      this.cartService.addDataToCart(product);
      this.cartService.getCart.subscribe({
        next:(result:any)=> {
              this.numberOfProducts=result.length;
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
