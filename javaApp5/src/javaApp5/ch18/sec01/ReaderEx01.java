package javaApp5.ch18.sec01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReaderEx01 {

	public static void main(String[] args) {
		// �Է½�Ʈ��

		try {
			InputStream is = new FileInputStream("D:\\AI\\study\\java_study\\data\\img.jpg");
			OutputStream os = new FileOutputStream("D:\\AI\\study\\java_study\\data\\img_copy.jpg");
			byte[] bArr = new byte [100]; //100����Ʈ�� �迭�� �������.
			byte[] wArr = new byte [100];
			while(true) {
				int data = is.read();
				if (data == -1) break; //-1�� �������� ���̶�� ��, �� ����
				os.write(data);
			}
			os.flush();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

	}


