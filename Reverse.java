import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args) 
	{
		String f1,f2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter File 1: ");
		f1=sc.next();
		System.out.println("Enter file 2: ");
		f2=sc.next();
		
		try
		{
			FileInputStream fis=new FileInputStream("src//"+f1);
			FileWriter fw=new FileWriter("src//"+f2);
			
			int n=0;
			char ch=' ';
			String data=" ";
			
			while(n!=-1)
			{
				n=fis.read();
				ch=(char)n;
				data=data+ch;
			}
			fis.close();
			
			StringBuffer sb=new StringBuffer(data);
			//data=""+sb.reverse(); other method to convert string buffer to string
			data=sb.reverse().toString();// to convert string buffer to string
			
			fw.write(data);
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("Error Message"+e.getMessage());
		}
		
	}

}
