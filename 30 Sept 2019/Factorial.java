class Factorial{
	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter a number:");
		int num=scan.nextInt();

		int fact=1;

		for(int i=num;i>=1;i--){
			fact=fact*i;
		}
		System.out.println("The factorial="+fact);


	}
}