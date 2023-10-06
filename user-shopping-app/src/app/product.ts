export class Product {
    constructor(
        public id:number,
        public title:string,
        public price:number,
        public description:string,
        public discountPercentage:number,
        public rating:number,
        public stock:number,
        public brand:string,
        public category:string,
        public thumbnail:string,
        public images:string[]
        ){

    }
}
