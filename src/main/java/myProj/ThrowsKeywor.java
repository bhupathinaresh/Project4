package myProj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeywor {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		FileReader f=null;
		f=new FileReader("C:\\Users\\Naresh\\Documents\\Test.txt");
		BufferedReader b=new BufferedReader(f);
		System.out.println(b.readLine());
		System.out.println(b.readLine());
		Thread.sleep(5000);

	}

}
