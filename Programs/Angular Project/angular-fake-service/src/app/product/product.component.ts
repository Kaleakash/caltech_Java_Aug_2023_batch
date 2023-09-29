import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

  constructor(public ps:ProductService){}   // DI for ProductService Dependency injection 

  products:Array<Product>=[];   // products array variable created..

  loadProduct() {
    this.ps.loadFakeProduct();
  }

  loadJsonFake() {
    
    this.ps.loadFakeJsonData().subscribe({
      next:(data:any)=> {
          this.products=data;
          console.log(this.products.length);
    },
    error:(error:any)=>{
          console.log(error)
    },
    complete:()=> {
        console.log("completed!")
    }

    });

  }


}
