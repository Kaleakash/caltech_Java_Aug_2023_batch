
import {Injectable} from '@angular/core';

@Injectable()
export class LoginService {

    checkUser(login:any):string {

        if(login.email=="akash@gmail.com" && login.password=="123"){
            return "successfully login"
        }else {
            return "failure try once again";
        }
    }
}