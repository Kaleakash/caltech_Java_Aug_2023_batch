import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customerhome',
  templateUrl: './customerhome.component.html',
  styleUrls: ['./customerhome.component.css']
})
export class CustomerhomeComponent implements OnInit{
  name:string="";
  constructor(public router:Router){

  }
  ngOnInit(): void {
      let obj = sessionStorage.getItem("user");
      if(obj!=null){
        // index of method with character it will index position  
        // akash@gmail.com  akash12455@gmail.com  
        this.name=obj.substring(0,obj.indexOf('@'));

      }
  }

  logout(): void {
    this.router.navigate(["signIn"],{skipLocationChange:true});
  }
}
