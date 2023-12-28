package javaApp5.ch18.sec01;

import java.io.*;
//*은 모든걸 의미

public class ReaderEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			char[]cArr = new char[100];
			Reader r = new FileReader("D:/AI/study/java_study/data/test3.txt");
			while(true) {
			int data = r.read(cArr);
			if(data ==-1) break;
			for(int i =0; i<data ; i++) {
				System.out.print((char)cArr[i]);
			}
			Writer w = new FileWriter ("D:\\AI\\study\\java_study\\data\\test5.txt");
			
			w.write("abcdef");

			w.write(800);
			
			w.flush();
			w.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
