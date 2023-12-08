import { Component } from '@angular/core';
import {FormGroup,FormControl} from '@angular/forms';
import { LoginService } from '../login.service';
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
constructor(public loginService:LoginService){}   // DI 
checkLoginDetails(){
  let login = this.loginRef.value;
  console.log(login);
  
  this.loginService.signIn(login);

  this.loginRef.reset();
}
}
