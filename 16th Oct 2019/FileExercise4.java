import java.util.Scanner;
import java.io.*;
class FileExercise4{
	public static void main(String[] args) {

StringBuilder sb = new StringBuilder("");

Scanner scan=new Scanner(System.in);
System.out.println("Enter the word that you want to replace:");
String repStr=scan.nextLine();
System.out.println("Enter the new word that you want :");
String newStr=scan.nextLine();
String str="";
try{
BufferedReader br = new BufferedReader(new FileReader("filedemo.txt"));
int a=0;
while((a=br.read()) != -1)
{
	sb.append((char)a);
}
br.close();
// fr.close();
str=new String(sb);
str=str.replaceAll(repStr,newStr);
//System.out.println("Contents from file are : " + str);
	}
catch(IOException e){
	System.out.println(e);
}


try {
 

FileWriter fw = new FileWriter(new File("filedemo.txt")); // create an actual file

fw.write(str); 

fw.flush(); 
fw.close(); 
} catch(IOException e) {
	System.out.println("Can't write to the file currently...");
 }
}
}