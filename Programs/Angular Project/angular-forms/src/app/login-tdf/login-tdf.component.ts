import { Component } from '@angular/core';
import {NgForm} from '@angular/forms';
import { MyLoginService } from '../mylogin.service';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login-tdf',
  templateUrl: './login-tdf.component.html',
  styleUrls: ['./login-tdf.component.css']
})
export class LoginTdfComponent {
msg:string="";

  constructor(public loginService:LoginService) {  }   // DI ie pull object from container. 

  checkUser(loginRef:NgForm) {
    //alert("event generated");
    //console.log(loginRef);
    let login = loginRef.value;
    //console.log(login);   // it display in object format ie JSON 
    
    // let ls = new MyLoginService();
    // this.msg = ls.checkUser(login);
    
    this.msg=this.loginService.checkUser(login);

    // if(login.email=="akash@gmail.com" && login.password=="123"){
    //     this.msg = "successsfully login"
    // }else {
    //   this.msg = "failure try once again";
    // }
    
    loginRef.reset();

  }


}
