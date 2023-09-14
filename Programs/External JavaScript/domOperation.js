function readAndWriteData() {
   // alert("Event fired");
   // read the value of text field using id selector 
//    var fname = document.getElementById("n1").value;
//    var lname = document.getElementById("n2").value;
//    var fullname = fname+" "+lname;
//    document.getElementById("n3").value=fullname;
//    document.getElementById("n1").value=""
//    document.getElementById("n2").value=""
//    //alert("Welcome user "+fullname);

// read the value of text field using name selector 
var h1TagValue = document.getElementsByTagName("h1")[0].innerHTML; // read value from tag
               // using tag name
//alert(h1TagValue);
document.getElementsByTagName("h1")[0].innerHTML=h1TagValue+" added contents";   // append the cotents 
var fname = document.getElementsByName("fname")[0].value;
var lname = document.getElementsByName("lname")[0].value;
var fullname = fname+" "+lname;
document.getElementsByName("fullname")[0].value=fullname; //text field 
document.getElementsByName("fname")[0].value=""
document.getElementsByName("lname")[0].value="";
document.getElementsByTagName("div")[0].innerHTML="Your name is "+fullname // set value in tag
}