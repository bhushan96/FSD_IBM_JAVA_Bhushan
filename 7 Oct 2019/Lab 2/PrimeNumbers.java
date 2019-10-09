class PrimeNumbers{
	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);

		System.out.println("Enter a number upto where you need to print prime nos:");
		int n=scan.nextInt();
		int flag=1;
		System.out.println("Prime numbers are:");
		for(int i=2;i<=n;i++){
			for(int j=2;j<=(i/2);j++){
				if(i%j==0){
					flag=0;
					break;
				}
				else{
					flag=1;
				}
			}

			if(flag==1){
			System.out.println(i);
			}

		}
	}
}