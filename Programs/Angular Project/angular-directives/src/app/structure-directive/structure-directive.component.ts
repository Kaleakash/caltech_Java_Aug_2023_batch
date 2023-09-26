import { Component } from '@angular/core';

@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent {
f1:boolean = true;
f2:boolean = false;
flag:boolean = false;
b1:string = "show";
flag1:boolean = false;

names:Array<string>=["Ravi","Rajesh","Lokesh","Mahesh"];

fun():void {
this.flag=true;
}

addName(nameRef:any){
  let name = nameRef.value;
  nameRef.value="";     // clear the value from text field 
  this.names.push(name);    // added in in array using push function 
}



toggle(){
  if(this.b1=="show"){
    this.flag1=true;
    this.b1 = "hide"
  }else {
    this.flag1=false;
    this.b1 = "show";
  }

}

}
