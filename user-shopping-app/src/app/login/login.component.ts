import { Component } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
msg:string="";

loginRef = new FormGroup({
  emailid:new FormControl(),
  password:new FormControl()
});
constructor(public loginService:LoginService,public router:Router){}   // DI for LoginService

checkLoginDetails(): void {
  let login = this.loginRef.value;
  
this.loginService.checkLoginDetails().subscribe({
  next:(result:any)=> {
     let flag  = result.find((u:any)=>u.emailid==login.emailid && u.password==login.password);
     if(flag!= undefined){
        //this.msg="successfully login";
        //sessionStorage.setItem("user",login.emailid); 
        sessionStorage.setItem("user",flag.fullName);
        this.router.navigate(["home"],{skipLocationChange:true});
     }else {
        this.msg="Failure try once again"
     }
  },
  error:(error:any)=> {

  },
  complete:()=> {

  }
})

  // if(this.loginService.checkLoginDetails(login)){
  //       this.router.navigate(["home"],{skipLocationChange:true});
  // } else {
  //     this.msg="failure try once again";
  // } 

  this.loginRef.reset();
}
}
