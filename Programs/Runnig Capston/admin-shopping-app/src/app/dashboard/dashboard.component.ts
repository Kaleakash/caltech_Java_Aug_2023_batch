import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {


  constructor(public router:Router){}

  logout(): void {
    this.router.navigate(["logout"],{skipLocationChange:true});
  }
}
