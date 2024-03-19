import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  loginRef = new FormGroup({
    emailid:new FormControl(),
    password:new FormControl(),
    typeofuser:new FormControl(),
  })
  msg:string ="";
    constructor(public ls:LoginService,public router:Router){
  
    }
  
    ngOnInit(): void {
        
    }
  
    signUp(): void {
      let login = this.loginRef.value;
      this.ls.signUp(login).subscribe({
        next:(result:any)=> {
              this.msg=result;  
        },
        error:(error:any)=> {
          console.log(error)
        },
        complete:()=> {
          console.log("signin done!")
        }
  
      })
      console.log(login)
      this.loginRef.reset();
    }
}
