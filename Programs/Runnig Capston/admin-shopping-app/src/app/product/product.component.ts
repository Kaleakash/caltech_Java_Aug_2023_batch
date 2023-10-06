import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
import { FormArray, FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { CategoryService } from '../category.service';
import { Category } from '../category';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit{

  products:Array<Product>=[];
  categories:Array<Category>=[];
  constructor(public productService:ProductService,public categoryService:CategoryService){} // DI
  productRef = new FormGroup({
    title:new FormControl(),
    description:new FormControl(),
    discountPercentage:new FormControl(),
    rating:new FormControl(),
    stock:new FormControl(),
    brand:new FormControl(),
    category:new FormControl(),
    thumbnail:new FormControl(),
    images:new FormControl(),
  });

  ngOnInit(): void {
      this.loadAllProductDetails();
      this.loadAllCategories();
  }

  loadAllCategories() {
    this.categoryService.loadAllCategoriesInformation().subscribe({
      next:(result:any)=> {
            this.categories=result;
            console.log(this.categories)
      },
      error:(error:any)=> {
          console.log(error);
      },
      complete:()=> {
          console.log("done!")
      }
    })
  }

  loadAllProductDetails() {
    this.productService.loadAllProduct().subscribe({
        next:(result:any)=> {
            this.products=result;
        },
        error:(error:any)=> {
            console.log(error);
        },
        complete:()=> {
            console.log("done!")
        }
    })
  }

  storeProductDetails(){
    let product  = this.productRef.value;

    console.log(product);
  }
}
