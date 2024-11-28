package Javapkg;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring array multiple types
		
		int a[]= {1,2,3,4,5,6};  //declaring integer array
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		char b[]= {'s','b','c','e','f','h'}; //declaring character array
		System.out.println(b[0]);
		System.out.println(b[2]);
		System.out.println(b[4]);
		System.out.println(b[5]);
		System.out.println(b[1]);
		
		double c[]= {1.2,3,4.2,5.6,7}; //Declaring double array
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[1]);
		
		boolean d[]= {2<5,1<1,3<1,4>3,1!=0};
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[0]);
		System.out.println(d[3]);
		
		miMethod();
		
		String z="siddhi nikam";
		System.out.println(z);
		
	}
		public static void miMethod()
		{
			Object f[] = {1,'s',"Hello siddhi", 4.0f, 3.5d, 4!=5};//Mixedd datatype list calling
			
			System.out.println(f[0]);
			System.out.println(f[4]);
			System.out.println(f[1]);
			System.out.println(f[2]);
			System.out.println(f[5]);
			
		}
		
		
		
	

}
