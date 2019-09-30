class Fibonacci{
	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		int c=0;
		System.out.println(a);
		System.out.println(b);
		while(b<89){
			//System.out.println(a);
			c=b;
			b=a+b;
			a=c;
			System.out.println(b);
			


		}
		
	}
}