package javaApp5.ch18.sec01;

import java.io.*;

public class FileOutputStream {

	public static void main(String[] args) {
		// �⺻Ÿ������ ������ϴ°��� �����ִ� ���� ��Ʈ��
		
		try {
			OutputStream os = new java.io.FileOutputStream("D:/AI/study/java_study/data/p.db");
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF("ȫ�浿"); //�ѱ� ����
			dos.writeDouble(95.5);
			dos.writeInt(1);
			
			dos.writeUTF("���ڹ�"); //�ѱ� ����
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
