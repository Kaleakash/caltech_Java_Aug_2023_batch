import { Component,OnInit } from '@angular/core';
import { CategoryService } from '../category.service';
import { Category } from '../category';
import {FormGroup,FormControl} from '@angular/forms';
@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit{
  msg:string ="";
  categoryRef = new FormGroup({
    id:new FormControl(),
    categoryName:new FormControl(),
    categoryDescription:new FormControl(),
    categoryImageUrl:new FormControl(),
  });
  buttonVariable:string ="Store Category";
  categories:Array<Category>=[];
  constructor(public categoryService:CategoryService){} // DI for CategoryService

  // this code execute only once when component get created...
ngOnInit(): void {
    this.loadAllCategory();
}

loadAllCategory() {
  this.categoryService.loadAllCategoriesInformation().subscribe({
    next:(result:any)=> {
        this.categories=result;
    },
    error:(error:any)=> {
        console.log(error)
    },
    complete:()=> {
        console.log("done!")
    }
  })
}
storeCategoryDetails(): void {
  let category = this.categoryRef.value;
  
  if(this.buttonVariable=="Store Category"){
    this.categoryService.storeCategoryDetails(category).subscribe({
      next:(result:any)=> {
        console.log(result)
      },
      error:(error:any)=> {
        console.log(error);
      },
      complete:()=> {
        this.loadAllCategory();
      }
    });
  }else {
    this.categoryService.updateCategoryDetails(category).subscribe({
      next:(result:any)=> {
        console.log(result)
      },
      error:(error:any)=> {
        console.log(error);
      },
      complete:()=> {
        this.loadAllCategory();
      }
    });

      this.buttonVariable="Store Category";
  }
  


  this.categoryRef.reset();
}


deleteCategory(cid:any): void {
  //console.log(cid);
  this.categoryService.deleteCategory(cid).subscribe({
    next:(result:any)=> {
      console.log(result)
    },
    error:(error:any)=> {
      console.log(error);
    },
    complete:()=> {
      this.loadAllCategory();
    }
  })
}

updateCategory(category:any):void {
  console.log(category);
  //this.categoryRef.get("categoryName")?.setValue("Hello");
  this.categoryRef.get("id")?.setValue(category.id);
  this.categoryRef.get("categoryName")?.setValue(category.categoryName);
  this.categoryRef.get("categoryDescription")?.setValue(category.categoryDescription);
  this.categoryRef.get("categoryImageUrl")?.setValue(category.categoryImageUrl);
  this.buttonVariable="Update Category";
}


}
