// let num1:number[]=[100,200,300,400,500,600,700,800,900,1000];
// // console.log("Size of array "+num1.length);
// // console.log("1st position element is "+num1[0]);
// // // retreive value using for loop 
// // console.log("Retrieve value one by one using for loop")
// // for(let i=0;i<num1.length;i++){
// //     console.log("Value is "+num1[i]+" Index position "+i)
// // }
// // console.log("Retreive value one by one using for in loop");
// // for(let index in num1){
// //     console.log("Value is "+num1[index]+" Index position "+index)
// // }
// // console.log("Retreive value one by one using for of loop")
// // for(let value of num1){
// //     console.log("Value is "+value);
// // }
// console.log("Retrieve value one by one using forEach with callback")
// num1.forEach(display)
// function display(n,i){
//     console.log("Value of n "+n+" Index is "+i)
// }
// console.log("Retrieve value one by one using expression style function")
// num1.forEach(function(n,i){
//     console.log("Value of n "+n+" Index is "+i)
// })
// console.log("Retrieve value one by one using expression arrow function")
// //num1.forEach(n=>console.log("Value is "+n));
// num1.forEach((v,i)=>console.log("Value is "+v+" index "+i));
let num1 = [100, 200, 300, 400, 500, 600, 700, 800, 900, 1000];
let searchElement = 7000;
// let flag=0;
// for(let i=0;i<num1.length;i++){
//     if(searchElement==num1[i]){
//         flag++;
//         break;
//     }
// }
// if(flag>0){
// console.log("present")
// }else {
// console.log("not present")
// }
let flag = num1.find(v => v == searchElement);
console.log(flag);
