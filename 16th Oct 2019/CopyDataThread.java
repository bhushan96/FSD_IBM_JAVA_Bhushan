import java.io.*;
class CopyDataThread implements Runnable{
	private BufferedReader br;
	private FileWriter fr;
	CopyDataThread(BufferedReader br,FileWriter fr){
		this.br=br;
		this.fr=fr;
	}

	@Override
	public void run(){
		
		try{
		int a=0;
		int i=0;
	while((a=br.read()) != -1)
		{
	fr.write((char)a);
	i=i+1;
	if(i%10==0){
		System.out.println("10 characters copied....");
		try{
			Thread.sleep(5000);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	}
	br.close();
	fr.close();

	}
	catch(IOException e){
	System.out.println(e);
	}

	}
	}