class PassOrFail{
	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter three numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();

		int sum=num1+num2+num3;
		int flag=0;

		if(num1>=40){
			flag++;
		}
		if(num2>=40){
			flag++;
		}
		if(num3>=40){
			flag++;
		}
		if(sum>=125){
			flag++;
		}

		if(flag==4){
			System.out.println("Passing");
		}
		else{
			System.out.println("Failing");
		}
	}
}