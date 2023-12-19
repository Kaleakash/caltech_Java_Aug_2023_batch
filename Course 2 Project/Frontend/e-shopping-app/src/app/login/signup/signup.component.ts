import { Component } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { LoginService } from '../login.service';



@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  loginRef = new FormGroup({
    email : new FormControl(),
    password : new FormControl(),
    typeofuser:new FormControl()
  });
  result:string="";
  
  constructor(public loginService:LoginService){}   // DI 
  
  signUp(){
    let login = this.loginRef.value;
    console.log(login);
    
    this.loginService.signUp(login).subscribe({
      next:(result=> {
          this.result=result;
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
