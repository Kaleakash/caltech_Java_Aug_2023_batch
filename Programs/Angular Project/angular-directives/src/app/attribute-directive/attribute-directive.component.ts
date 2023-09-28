import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-directive',
  templateUrl: './attribute-directive.component.html',
  styleUrls: ['./attribute-directive.component.css']
})
export class AttributeDirectiveComponent {
styleVarialbe ={"color":"red"};
f1:boolean = false;
f2:boolean = true;

abcClass() {
  this.f1=true;
  this.f2=false;
}
xyzClass() {
  this.f1=false;
  this.f2=true;
}
}
