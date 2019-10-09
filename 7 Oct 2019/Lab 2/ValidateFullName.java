class NameValidationException extends RuntimeException{

	NameValidationException(){
		System.out.println("First Name or Last Name is Blank");
	}

}
class ValidateFullName{
	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter your First Name:");
		String first_name=scan.nextLine();

		System.out.println("Enter your Last Name:");
		String last_name=scan.nextLine();

		if(first_name.isEmpty() || last_name.isEmpty()){
			throw new NameValidationException();
		}
		else{
			System.out.println("Name is properly validated!");
		}

	}
}