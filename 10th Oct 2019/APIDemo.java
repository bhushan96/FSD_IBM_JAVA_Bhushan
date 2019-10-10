import java.util.ArrayList;
import java.util.Scanner;
class Person{
	private String name;
	private Integer id;
	private String address;

	Person(String name, Integer id, String address){
		this.name = name;
		this.id = id;
		this.address=address;
	}

	public String getName(){
		return this.name;
	}

	public Integer getId(){
		return this.id;
	}

	public String getAddress(){
		return this.address;
	}

	@Override
	public String toString(){
		return "Id : "+this.getId()+" Name : "+this.getName()+" ,Address : "+this.getAddress();
	}
}

class APIDemo{
	public static void main(String[] args) {
		String name="",address="";
		int id=0;
		int choice=0;

		ArrayList list = new ArrayList();

		Scanner scan = new Scanner(System.in);

		do{
			
		System.out.println("Employee API");
		System.out.println("1. Save Employee Details");
		System.out.println("2. Display all details");
		System.out.println("3. Search the data");
		System.out.println("4. Delete data based on id");
		System.out.println("5. Exit");

		System.out.println("Enter your choice (1/2/3/4/5):");
		choice=scan.nextInt();
		scan.nextLine();

		switch(choice){

		case 1:
		

			System.out.println("Enter name");
			name = scan.nextLine();

			System.out.println("Enter id");
			id = scan.nextInt();
			scan.nextLine();

			System.out.println("Enter Address:");
			address = scan.nextLine();

			list.add(new Person(name, id,address));

			break;

		case 2:

		//Print all names
			System.out.println("Details of all Employees:");

			for(Object ob : list){
				System.out.println(((Person)ob));
			}

		break;

		case 3:
			System.out.print("\n");
			System.out.println("Search based on-");
			System.out.println("1. Id");
			System.out.println("2. Name");
			System.out.println("3. Address");
			System.out.println("Enter your choice(1/2/3)");
			int choice2=scan.nextInt();
			scan.nextLine();

			switch(choice2){

				case 1:
					System.out.println("Enter the id of the employee to search:");
					Integer id_search=scan.nextInt();

				for(Object ob:list){
				//Person p=new Person();
				

				if(((Person)ob).getId().equals(id_search)){
					System.out.println(((Person)ob));
					
				}

			}

					break;

				case 2:
					System.out.println("Enter the name of the employee to search:");
					String name_search=scan.nextLine();

				for(Object ob:list){
				//Person p=new Person();

				if(((Person)ob).getName().equals(name_search)){
					System.out.println(((Person)ob));
					
				}

			}

					break;

				case 3:
					System.out.println("Enter the address of the employee to search:");
					String address_search=scan.nextLine();

				for(Object ob:list){
				//Person p=new Person();

				if(((Person)ob).getAddress().equals(address_search)){
					System.out.println(((Person)ob));
					
				}

			}

					break;


			}
			break;

		case 4:
			System.out.println("Enter the id of the employee to delete:");
			Integer id2=scan.nextInt();

			for(Object ob:list){
				//Person p=new Person();

				if(((Person)ob).getId().equals(id2)){
					list.remove(ob);
					System.out.println("Employee deleted successfully");
				}

			}
			break;





	}

	}while(choice<5 && choice>0);










	}
}