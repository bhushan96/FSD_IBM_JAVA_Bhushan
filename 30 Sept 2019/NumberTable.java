class NumberTable{
	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter a number:");
		int num=scan.nextInt();
		System.out.println("Enter a limit:");
		int limit=scan.nextInt();

		for(int i=1;i<=limit;i++){
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
}