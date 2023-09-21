import { display1,display } from "./abc";
import {display2,display as dis} from "./xyz";

console.log("main file")
display1();
display();  // abc display 
display2();
dis();      // xyz display as alias dis