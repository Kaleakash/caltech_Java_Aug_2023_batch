import { Component } from "@angular/core";


@Component({
    selector:"my-child-tag",
    templateUrl:"./child.component.html",
    styleUrls:["./child.component.css"]
})

export class MyChildComponent {
    msg:string ="This is child component";
}


