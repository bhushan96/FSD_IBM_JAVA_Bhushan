class SalaryValidationException extends RuntimeException{

	SalaryValidationException(){
		System.out.println("Salary is below 3000!!");
	}

}
class ValidateEmployeeSalary{
	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter your Salary:");
		int salary=scan.nextInt();


		if(salary<3000){
			throw new SalaryValidationException();
		}
		else{
			System.out.println("Salary is properly validated!");
		}

	}
}