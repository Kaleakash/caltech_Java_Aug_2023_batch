function doTask() {
    //alert("Hello");
   // document.write("1st Statement<br/>")
    //document.write("2nd Statement<br/>")
//    setTimeout(function(){
//     document.write("2nd Statement<br/>")
//    },5000);
//setTimeout(perform,5000);
setInterval(perform,1000);
//document.write("3rd Statement<br/>")
}
var n=0;
function perform() {
  //  document.write("2nd Statement<br/>")
  document.getElementById("out").innerHTML=n
  if(n%2==0){
    document.getElementsByTagName("h2")[0].style.color="RED";
    document.getElementById("out").style.backgroundColor="GREEN"
    document.getElementsByTagName("body")[0].style.backgroundColor="Yellow";
  }else {
    document.getElementsByTagName("h2")[0].style.color="GREEN";
    document.getElementById("out").style.backgroundColor="RED"
    document.getElementsByTagName("body")[0].style.backgroundColor="Orange";
  }
  n++;
}