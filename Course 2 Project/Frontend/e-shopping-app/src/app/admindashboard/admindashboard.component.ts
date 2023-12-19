import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admindashboard',
  templateUrl: './admindashboard.component.html',
  styleUrls: ['./admindashboard.component.css']
})
export class AdmindashboardComponent {


    constructor(public router:Router){}// DI for router 



    logout() {
      this.router.navigate(["/"])
    }
}
