import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Login } from './login';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  // select * from login where emailid = akash@gmail.com and password = 123;
  baseUrl:string ="http://localhost:3000/users";
  constructor(public http:HttpClient) { }

  checkLoginDetails():Observable<Login[]> {
    return this.http.get<Login[]>(this.baseUrl);
  }
}
