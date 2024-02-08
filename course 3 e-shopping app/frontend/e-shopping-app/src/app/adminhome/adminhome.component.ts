import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminhome',
  templateUrl: './adminhome.component.html',
  styleUrls: ['./adminhome.component.css']
})
export class AdminhomeComponent {


constructor(public router:Router){}


logout(): void {
  this.router.navigate(["signIn"],{skipLocationChange:true});
}

}
