import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customerdashboard',
  templateUrl: './customerdashboard.component.html',
  styleUrls: ['./customerdashboard.component.css']
})
export class CustomerdashboardComponent implements OnInit{

    login:any;
    constructor(public router:Router){}

    ngOnInit(): void {
        let obj = sessionStorage.getItem("user");
        if(obj!=null){
            this.login = JSON.parse(obj);   // converting string to json format 
        }
    }
    logout() {
      sessionStorage.removeItem("obj");
      this.router.navigate(["/"])
    }
}
