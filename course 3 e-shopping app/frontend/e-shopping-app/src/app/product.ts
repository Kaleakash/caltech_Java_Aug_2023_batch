export class Product {      // this class map to product entity class in spring boot 
    constructor(public pid:number,
        public pname:string,
        public prie:string,
        public url:string,
        public qty:number){}
}
