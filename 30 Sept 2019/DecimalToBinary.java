class DecimalToBinary{
	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);

		String digit=" ";
		StringBuffer buf=new StringBuffer();
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		System.out.println("Binary Equivalent of "+num+" is=");
		while(num>0){
				int temp=num%2;
				digit=digit+String.valueOf(temp);
			
				num=num/2;
		}
		buf.append(digit);
		System.out.print(buf.reverse());
	}
}