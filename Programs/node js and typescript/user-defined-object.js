// // literal style 
// // let emp1 = {id:100,name:"Steven",salary:12000};
// // console.log("object creation in literal style");
// // console.log("id is "+emp1.id)
// // console.log("name is "+emp1.name)
// // console.log("salary is "+emp1.salary)
// // // function style object creation
// // function Employee(){
// //     this.id=100;        // property or variable of employee object 
// //     this.name = "Steven";
// //     this.salary = 12000;
// //     this.display = function(){      // behaviour or function to do some task. 
// //             console.log("id is "+this.id);
// //             console.log("name is "+this.name)
// //             console.log("salary is "+this.salary);
// //     }
// // }
// // //Employee();   //it consider as normal function 
// // let emp1 = new Employee();// memory created...
// // let emp2 = new Employee();
// // emp1.display();
// // emp2.display();
// // employee object creation in function style with parameter 
// // function Employee(id:number,name:string,salary:number){
// //     //id is local and this.id is object property or instance variable. 
// //     this.id=id;        // property or variable of employee object 
// //     this.name = name;
// //     this.salary = salary;
// //     this.display = function(){      // behaviour or functio to do some task. 
// //             console.log("id is "+this.id);
// //             console.log("name is "+this.name)
// //             console.log("salary is "+this.salary);
// //     }
// // }
// // //Employee();   //it consider as normal function 
// // let emp1 = new Employee(100,"Steven",12000);// memory created...
// // let emp2 = new Employee(101,"Lex",15000);
// // console.log(emp1.id)
// // emp1.display();
// // emp2.display();
// // object creation in class style 
// class Employee {
//         id:number=100;
//         name:string ="Steven";
//         salary:number = 12000;
//         display():void {
//             console.log("id is "+this.id)
//             console.log("name is "+this.name);
//             console.log("salary "+this.salary);    
//         }
// }
// let emp1 = new Employee();
// emp1.display();
// let emp2 = new Employee();
// emp2.display();
// Constructor example 
var Employee = /** @class */ (function () {
    function Employee() {
        console.log("object created..");
    }
    Employee.prototype.sayHello = function () {
        console.log("This is normal function part of Employee class");
    };
    return Employee;
}());
//sayHello();
var emp1 = new Employee();
emp1.sayHello();
emp1.sayHello();
