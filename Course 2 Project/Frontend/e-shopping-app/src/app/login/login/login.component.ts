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

loginRef = new FormGroup({
  email : new FormControl(),
  password : new FormControl(),
  typeofuser:new FormControl()
});
result:string="";
constructor(public loginService:LoginService,public router:Router){}   // DI 
checkLoginDetails(){
  let login = this.loginRef.value;
  console.log(login);
  
  this.loginService.signIn(login).subscribe({
    next:(result=> {
      if(result=="Admin login successfully"){
          this.router.navigate(["admin"],{skipLocationChange:true});
      }else if(result=="Customer login successfully"){
         sessionStorage.setItem("user",JSON.stringify(login));  // store the information in session 
        this.router.navigate(["customer"],{skipLocationChange:true});
      }else {
        this.result=result;
      }
      
    }),
    error:(error:any)=> {
      console.log(error)
    },
    complete:()=> {
      console.log("SigIn done!")
    }

  })

  this.loginRef.reset();
}
}
