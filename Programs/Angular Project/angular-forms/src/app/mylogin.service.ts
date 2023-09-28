

export class MyLoginService {

    checkUser(login:any):string {

        if(login.email=="akash@gmail.com" && login.password=="123"){
            return "successfully login"
        }else {
            return "failure try once again";
        }
    }
}