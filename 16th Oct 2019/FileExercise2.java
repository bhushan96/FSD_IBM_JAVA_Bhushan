import java.io.*;
class FileExercise2{
	public static void main(String[] args) {
			try{
		FileReader fr=new FileReader("filedemo.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str="";
		int countWord=0;
		int countLine=0;
		int countChar=0;
		int i=0;
		while((str=br.readLine())!=null){
			countLine++;

			String arr[]=str.split(" ");
			countWord+=arr.length;

			countChar+=str.length();
			i=i+1;
			

		}
		System.out.println("Number of Lines="+ countLine);
		System.out.println("Number of Words="+ countWord);
		System.out.println("Number of Characters="+ countChar);
		br.close();
	}
	catch(IOException e){
		System.out.println("Exception raised!");
	}
	}
}