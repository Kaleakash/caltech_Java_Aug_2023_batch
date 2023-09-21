// let num1:number[]=[];       // literal style 
// let num2:Array<number>=[];  // generic style 
// let num3:number[]=[100,200,300,400];   // created array as well as assign the value.
// console.log(num1.length);   // it is use to check the size of the array 
// console.log(num2.length)
// console.log(num3.length)
// console.log("first number in num3="+num3[0]);   //100
// console.log("second number in num3="+num3[1]);   //200
// console.log("third number is num3 = "+num3[2])  //300
// console.log("third number is num3 = "+num3[3])  //400
// console.log("All number from num3 is= "+num3);  // display all numbers 
// num3.push(5);
// num3.push(6);       // add element at last 
// num3.unshift(7);
// num3.unshift(8);    // add element at begining 
// console.log("All number from num3 is= "+num3); 
// num3.pop();         // remove the element from last 
// num3.shift();       // remove the element from begining 
// console.log("All number from num3 is= "+num3); 
var num4 = [100, 200, 300, 400];
console.log("All elements " + num4);
//num4.splice(2,1);            //1st parameter index position, 2nd parameter number of elment to delete
//num4.splice(1,2);       // from index 1 remove 2 elements. 
//num4.splice(2,0,1000);  // 1st parameter index, 2nd parameter number of element delete, 
// 3rd parameter value add it. ie 3rd, 4th, 5th till nth
num4.splice(2, 1, 3000);
console.log("All elements " + num4);
