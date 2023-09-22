import { Component } from '@angular/core';
// import {display} from './abc';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  
  title = 'demo-app';
  name:string ="Akash Kale";
  id:number = 123;
  designation:string ="Trainer";
  result:boolean = true; 

}
