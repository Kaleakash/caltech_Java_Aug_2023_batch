import { Component } from '@angular/core';
import { FormGroup ,FormControl} from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

loginRef = new FormGroup({
  emailid:new FormControl(),
  password:new FormControl()
});

constructor(public router:Router){}   // DI for Router API which help to navigate to another component 
                                    // with conditions 
checkUser(): void {
  let login = this.loginRef.value;

  if(login.emailid=="akash@gmail.com" && login.password=="123"){
      alert("successfully login")
      this.router.navigate(["home"]);       // home is path of dashboard. 
  }else {
    alert("failure try once again");
  }

  this.loginRef.reset();
}

}
