// // function add(a:number,b:number){
// //     let sum:number;
// //     sum =a+b;
// //     console.log("sum is "+sum);
// // }
// // add(10,20);
// //add("a","b");
// //add(10);
// //add();
// // function sayHello(name:string):string{
// //     return "Welcome "+name;
// // }
// //     console.log(sayHello("Akash"))
// // function getResult():boolean {
// //     return true;
// // }
// //     console.log(getResult())
// // function info():void {
// //     console.log("This function no return");   
// // }
// // info();
// // Expression style function with name  
// let information = function info():void {
//     console.log("This is expression style function")
// }
// information();
// Expression style function 
// let hello = function():void {
//     console.log("This is expression style function")
// }
// hello();
// simple arrow function 
// let simple = ()=>console.log("This is arrow function");
// simple();
// addition of two number using expression style 
// let addNumber1 = function(a:number,b:number):number{
//     let add = a+b;
//     return add;
// }
// console.log("Addition of number in expression style is "+addNumber1(10,20));
// addition of two number using arrow style 
//let addNumber2 = (a,b)=>a+b;
// let addNumber2 = (a:number,b:number):number =>a+b;
// console.log("Addition of two number using arrow style is "+addNumber2(100,200));
// // find largest of two number using expression style 
// let findLargest1 = function(a:number,b:number):string {
//     if(a>b){
//         return "a is largest"
//     }else {
//         return "b is largest"
//     }
// }
// console.log("Find largest of two number is "+findLargest1(10,5));
// // find largest of two number using arrow style 
// let findLargest2 = (a:number,b:number):string =>{
//     if(a>b){
//         return "a is largest"
//     }else {
//         return "b is largest"
//     }
// }
// console.log("Find largest of two number is "+findLargest2(10,5));
function greeting(fname, callback) {
    return "Welcome " + callback(fname);
}
var maleInfo = function (fname) {
    return "Mr " + fname;
};
var femaleInfo = function (fname) { return "Miss " + fname; };
console.log(greeting("John", maleInfo));
console.log(greeting("Leena", femaleInfo));
console.log(greeting("Steven", function (fname) {
    return "Mr " + fname;
}));
console.log(greeting("Reeta", function (fname) { return "Miss " + fname; }));
