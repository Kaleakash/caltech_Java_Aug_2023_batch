// this class help us to map json data retrieve from backend technology
export class Product {
    
    // id:number;
    
    // constructor(id:number){
    //     this.id=id;
    // }
    // short cut intance variable initialization
constructor(
    public id:number,
    public title:string,
    public price:number,
    public image:string)   {  }
}
