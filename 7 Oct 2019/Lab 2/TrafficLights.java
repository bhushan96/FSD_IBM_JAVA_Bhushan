class TrafficLights{
	public static void main(String[] args) {
		java.util.Scanner scan=new java.util.Scanner(System.in);
		String choice="";
		
		do{
			System.out.println("Enter your choice(red/yellow/green/exit):");
			choice=scan.nextLine();

			switch(choice){
				case "red":
					System.out.println("Stop\n");
					break;

				case "yellow":
					System.out.println("Ready\n");
					break;

				case "green":
					System.out.println("Go\n");
					break;

				case "exit\n":
					break;

				default:
					System.out.println("Wrong choice");
			}


		}while(!choice.equals("exit"));
	}
}