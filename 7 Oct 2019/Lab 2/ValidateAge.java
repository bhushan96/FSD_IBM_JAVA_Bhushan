class AgeValidationException extends RuntimeException{

	AgeValidationException(){
		System.out.println("Age should be above 15!!");
	}

}
class ValidateAge{
	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter your Age:");
		int age=scan.nextInt();


		if(age<=15){
			throw new AgeValidationException();
		}
		else{
			System.out.println("Age is properly validated!");
		}

	}
}