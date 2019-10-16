import java.io.*;
import java.util.Scanner;
class FileExercise3{

	private static String getFileExtension(File file) {
        String name = file.getName();
        if(name.lastIndexOf(".") != -1 && name.lastIndexOf(".") != 0){
        return name.substring(name.lastIndexOf(".")+1);
   	 }
        else return "";
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a file name:");
		String filename=scan.nextLine();
		try{
			File file=new File(filename);

			System.out.println("File exists or not? "+file.exists());
			System.out.println("Can we read file? "+file.canRead());
			System.out.println("Can we write in file? "+file.canWrite());
			System.out.println("Type of file is : "+ FileExercise3.getFileExtension(file));
			System.out.println("Length of file : "+file.length());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}