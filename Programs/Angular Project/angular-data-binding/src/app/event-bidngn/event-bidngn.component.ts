import { Component } from '@angular/core';

@Component({
  selector: 'app-event-bidngn',
  templateUrl: './event-bidngn.component.html',
  styleUrls: ['./event-bidngn.component.css']
})
export class EventBidngnComponent {
  msg:string ="";   // instance variable 
  fun():void {
    alert("Event fired");
  }

  passValue(nameRef:any){
    //console.log(nameRef)
    let name = nameRef.value;
    alert("Welcome user "+name);
  }

  add(n1:any,n2:any){
    let sum = eval(n1.value)+eval(n2.value);
    n1.value="";
    n2.value="";
    this.msg="Sum of two number is "+sum; 
  }
}
