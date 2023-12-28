package javaApp5.ch18.sec01;

import java.io.*;

public class FileOutputStream {

	public static void main(String[] args) {
		// 기본타입으로 입출력하는것을 도와주는 보조 스트림
		
		try {
			OutputStream os = new java.io.FileOutputStream("D:/AI/study/java_study/data/p.db");
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF("홍길동"); //한글 저장
			dos.writeDouble(95.5);
			dos.writeInt(1);
			
			dos.writeUTF("김자바"); //한글 저장
			dos.writeDouble(90.3);
			dos.writeInt(2);
			
			dos.flush();
			dos.close();
			
			InputStream is = new java.io.FileInputStream("D:/AI/study/java_study/data/p.db");
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(is);
			
			String name = dis.readUTF();
			double score = dis.readDouble();
			int no = dis.readInt();
			System.out.println(name+ " " + score + " " + no);
			
			name = dis.readUTF();
			score = dis.readDouble();
			no = dis.readInt();
			System.out.println(name+ " " + score + " " + no);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
