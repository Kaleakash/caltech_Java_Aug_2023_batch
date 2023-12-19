import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  baseUrl:string ="http://localhost:8080/e-shopping-app-backend/rest/login";

  constructor(public httpClient:HttpClient) { }

  signIn(login:any):Observable<string>{
    return this.httpClient.post(this.baseUrl+"/signin",login,{responseType:'text'})
  }

  signUp(login:any): Observable<string>{
    
    return this.httpClient.post(this.baseUrl+"/signup",login,{responseType:"text"});
    

  }

}
