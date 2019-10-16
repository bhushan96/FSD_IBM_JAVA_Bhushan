import java.io.*;
class FileExercise1{
	public static void main(String[] args) {
		try{
		FileReader fr=new FileReader("filedemo.txt");
		BufferedReader br=new BufferedReader(fr);
		//StringBuilder s=new StringBuilder("");
		String str="";
		int i=1;
		while((str=br.readLine())!=null){
			System.out.println("Line "+ (i++) +"-"+str);
		}
	
		br.close();
	}
	catch(IOException e){
		System.out.println("Exception raised!");
	}
	}
}