import java.io.*;
class FileProgram{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("filedemo.txt"));
		FileWriter fw = new FileWriter(new File("filedemo2.txt"));
		CopyDataThread cp=new CopyDataThread(br,fw);
		Thread t1=new Thread(cp);
		t1.start();	}

}