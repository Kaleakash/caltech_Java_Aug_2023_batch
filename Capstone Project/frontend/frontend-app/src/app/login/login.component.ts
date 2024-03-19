import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
loginRef = new FormGroup({
  emailid:new FormControl(),
  password:new FormControl(),
  typeofuser:new FormControl(),
})

  constructor(public ls:LoginService,public router:Router){

  }
msg:string ="";
  ngOnInit(): void {
      
  }

  signIn(): void {
    let login = this.loginRef.value;
    this.ls.signIn(login).subscribe({
      next:(result:any)=> {
            if(result=="admin success"){
              this.router.navigate(["admin"],{skipLocationChange:true})
            }else if(result="customer success"){
              sessionStorage.setItem("user",login.emailid)
              this.router.navigate(["customer"],{skipLocationChange:true})
            }else {
                this.msg = result
            }

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
