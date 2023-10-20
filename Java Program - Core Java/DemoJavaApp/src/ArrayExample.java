
public class ArrayExample {

	public static void main(String[] args) {
//		int abc[];
//		int xyz[]= {10,20,30,40,50,60};
//		int mno[]=new int[10];			
//		//System.out.println(abc);
//		//System.out.println(xyz);
//		//System.out.println(mno);
//		System.out.println(xyz[0]);
//		System.out.println(xyz[1]);
//		System.out.println(xyz[5]);
//		System.out.println(mno[0]);
//		System.out.println(mno[9]);
//		mno[0]=100;
//		mno[1]=200;
//		System.out.println(mno[0]);
//		System.out.println(mno[1]);
		int num[]= {100,200,300,400,500,60,80,54,32,67};
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println("Size of array "+num.length);
		System.out.println("Retrieve element one by one using loop");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("Retrieve element one by one");
		for(int n:num) {
			System.out.println(n);
		}
	}

}
