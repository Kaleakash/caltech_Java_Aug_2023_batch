import { Component } from '@angular/core';

import {FormGroup,FormControl} from '@angular/forms';

@Component({
  selector: 'app-login-mdf',
  templateUrl: './login-mdf.component.html',
  styleUrls: ['./login-mdf.component.css']
})
export class LoginMdfComponent {

  loginRef = new FormGroup({
    email:new FormControl(),
    password:new FormControl()
  });
  msg:string ="";
  
  checkUser() : void {
    let login = this.loginRef.value;
    
    if(login.email=="akash@gmail.com" && login.password=="123"){
      this.msg = "successfully login"
    }else {
      this.msg = "failure try once again";
    }
    
    this.loginRef.reset();
  }



}
