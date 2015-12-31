package Wintersemester1415;

import java.io.*;

public class OutputStreamDoubler extends OutputStream{

	OutputStream o1 = null;
	OutputStream o2 = null;
	
	OutputStreamDoubler (OutputStream o1, OutputStream o2){
		this.o1 = o1;
		this.o2 = o2;
	}
	public void close() throws IOException{
		o1.close();
		o2.close();
	}
	public void write(int b) throws IOException{
		boolean exception = false;
		try{
			o1.write(b);
		}catch(IOException e){
			exception = true;
		}
		try{
			o2.write(b);
		}catch(IOException e){
			exception = true;
		}
		if(exception)
			throw new IOException();
	}
	public static void main(String[] args){
		FileOutputStream fos1 = null;
		FileOutputStream fos2 = null;
		OutputStreamDoubler osd = null;
		BufferedWriter bw = null;
		
		try{
			fos1 = new FileOutputStream("file1");
			fos2 = new FileOutputStream("file2");
			osd = new OutputStreamDoubler(fos1,fos2);
			bw = new BufferedWriter(new OutputStreamWriter(osd));
			bw.write("Hello World");
			bw.close();		
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
}
