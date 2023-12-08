import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  baseUrl:string ="";

  constructor(public httpClient:HttpClient) { }

  signIn(login:any){
    
    //this.httpClient.post(this.baseUrl,login);
    
    console.log(login);     // in json format. 
  }

}
