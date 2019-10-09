class FibonacciSequence{
	static void fibonacciSequence(int n){
		int a=0;
		int b=1;
		int count=3;
		int c=0;
		
		if(count==0){
			System.out.println(a);
		}

		if(count==1){
			System.out.println(b);
		}
		while(count<=n){
			//System.out.println(a);
			c=b;
			b=a+b;
			a=c;
			if(count==n){
			System.out.println("nth fibonacci value:"+b);
		}
		count++;
			
	}
}


static int fibonacciSequenceRecursive(int n){
	if (n == 1)
    {
      return 0;
    }
  else if (n == 2)
    {
      return 1;
    }
  else
    {
      return (fibonacciSequenceRecursive(n - 1) + fibonacciSequenceRecursive(n - 2));
    }
}

	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("Enter the the nth fibonacci value that you want:");
		int n=scan.nextInt();
		FibonacciSequence.fibonacciSequence(n);

		int fibonacci=FibonacciSequence.fibonacciSequenceRecursive(n);
		System.out.println("nth fibonacci value using recursion:"+fibonacci);
	}
}