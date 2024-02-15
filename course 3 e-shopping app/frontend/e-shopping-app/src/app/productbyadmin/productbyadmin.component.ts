import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-productbyadmin',
  templateUrl: './productbyadmin.component.html',
  styleUrls: ['./productbyadmin.component.css']
})
export class ProductbyadminComponent implements OnInit{
msg:string ="";
  productRef = new FormGroup({
    pid:new FormControl(),
    pname:new FormControl(),
    price:new FormControl(),
    url:new FormControl(),
    qty:new FormControl(),
  })

  products:Array<Product>=[];
  constructor(public ps:ProductService){}     // DI 

  ngOnInit(): void {
      this.loadAllProduct();
  }

  loadAllProduct(): void {
      this.ps.findProduct().subscribe({
        next:(data:any)=>this.products=data,
        error:(error:any)=>console.log(error),
        complete:()=>console.log("loaded all product")
      })
  }

  storeProduct(): void {
    let product = this.productRef.value;
    
    this.ps.storeProduct(product).subscribe({
      next:(result:any)=>this.msg=result,
      error:(error:any)=>console.log(error),
      complete:()=>{
            this.loadAllProduct();        // after successfully store we are calling loadAllProduct()
            console.log("Product stored successfully...")
      }
    });

    this.productRef.reset();
  }

  deleteProduct(pid:any): void {
    //console.log(pid);   
    
    this.ps.deleteProduct(pid).subscribe({
      next:(result:any)=>this.msg=result,
      error:(error:any)=>console.log(error),
      complete:()=>{
            this.loadAllProduct();        // after successfully delete we are calling loadAllProduct()
            console.log("Product stored successfully...")
      }
    });

  }
}


