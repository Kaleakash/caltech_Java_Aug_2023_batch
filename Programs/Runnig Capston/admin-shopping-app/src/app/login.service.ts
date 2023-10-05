import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

  checkLoginDetails(login:any):boolean {
    if(login.emailid=="admin@gmail.com" && login.password=="admin@123"){
      return true;
    }else {
      return false;
    }
  }
  
}
