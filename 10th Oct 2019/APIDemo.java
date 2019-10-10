import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
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

	public String getFirstName(){
		String name2[]=this.getName().split(" ");
		return name2[0];
		
	}

	public String getLastName(){

		String name2[]=this.getName().split(" ");
		int len=name2.length;
		if(len>1){
		return name2[len-1];
		}
		else{
			return "";
		}
		
	}

}


class SortById implements Comparator{
	@Override
	public int compare(Object ob1,Object ob2){

		return ((Person)ob1).getId().compareTo(((Person)ob2).getId());
	}

}

class SortByAddress implements Comparator{
	@Override
	public int compare(Object ob1,Object ob2){

		return ((Person)ob1).getAddress().compareTo(((Person)ob2).getAddress());
	}

}

class SortByFirstName implements Comparator{



	@Override
	public int compare(Object ob1,Object ob2){

		return ((Person)ob1).getFirstName().compareTo(((Person)ob2).getFirstName());
	}

}

class SortByLastName implements Comparator{
	@Override
	public int compare(Object ob1,Object ob2){

		return ((Person)ob1).getLastName().compareTo(((Person)ob2).getLastName());
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
		System.out.println("5. Sort the data");
		System.out.println("6. Exit");

		System.out.println("Enter your choice (1/2/3/4/5/6):");
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

		case 5:

			System.out.print("\n");
			System.out.println("Sort based on-");
			System.out.println("1. Id");
			System.out.println("2. Address");
			System.out.println("3. First Name");
			System.out.println("4. Last Name");
			System.out.println("Enter your choice(1/2/3/4)");
			int choice3=scan.nextInt();
			scan.nextLine();

			switch(choice3){
				case 1:

					Collections.sort(list,new SortById());

					break;

				case 2:

					Collections.sort(list,new SortByAddress());

					break;

				case 3:

					Collections.sort(list,new SortByFirstName());

					break;

				case 4:

					Collections.sort(list,new SortByLastName());

					break;



			}






	}

	}while(choice<6 && choice>0);










	}
}