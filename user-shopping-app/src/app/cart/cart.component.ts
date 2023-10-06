import { Component,OnInit } from '@angular/core';
import { Cart } from '../cart';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit{
  totalAmount:number=0;
  carts:Array<Cart>=[];
  constructor(public cartService:CartService){}

  ngOnInit(): void {
      this.cartService.getCart.subscribe({
        next:(result:any)=> {
            this.carts=result;
            this.calculateTotalAmount();
        },
        error:(error:any)=> {
            console.log(error)
        },
        complete:()=> {
            console.log("cart details loaded....")
        }
      })
  }

  calculateTotalAmount() {
     this.totalAmount= this.carts.reduce((previousValue:any,curentValue:any)=> {
          console.log(previousValue+" "+curentValue.price+" "+curentValue.qty); 
          return previousValue+curentValue.qty*curentValue.price; 
      },0)    
  }
}
