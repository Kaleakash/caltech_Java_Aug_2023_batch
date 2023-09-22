import { Component } from '@angular/core';

@Component({
  selector: 'app-string-interpolation',
  templateUrl: './string-interpolation.component.html',
  styleUrls: ['./string-interpolation.component.css']
})
export class StringInterpolationComponent {
n1:number=100;
n2:number=50;
name:string ="Akash Kale";

    sayHello(name:string):string {
      return "Welcome to angular "+name
    }
    
}
