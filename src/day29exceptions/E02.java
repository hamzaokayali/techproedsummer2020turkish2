package day29exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class E02 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;

		
		try {
		fis = new FileInputStream("src/day29exceptions/TextFil");
		int k=0;
		
		while ((k=fis.read())!=-1) {
			System.out.print((char) k);
			
			
		
		}
		
		}catch(IOException e) {
			System.out.println("Hatal� i�lem yapt�n");
		}finally {
			System.out.println("Finally blok cal��t�");
			fis.close();
		}

	}

}
