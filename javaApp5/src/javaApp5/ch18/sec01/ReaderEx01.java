package javaApp5.ch18.sec01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReaderEx01 {

	public static void main(String[] args) {
		// 입력스트림

		try {
			InputStream is = new FileInputStream("D:\\AI\\study\\java_study\\data\\img.jpg");
			OutputStream os = new FileOutputStream("D:\\AI\\study\\java_study\\data\\img_copy.jpg");
			byte[] bArr = new byte [100]; //100바이트의 배열이 만들어짐.
			byte[] wArr = new byte [100];
			while(true) {
				int data = is.read();
				if (data == -1) break; //-1은 데이터의 끝이라는 뜻, 더 없음
				os.write(data);
			}
			os.flush();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		}

	}


