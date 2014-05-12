package com.test4;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOTest {
	public static void main(String[] args) throws Exception{
		//��ʽ��ȡ�ļ�
		DataInputStream din = null;
		try {
			din = new DataInputStream(new BufferedInputStream(new 
					FileInputStream("IOTest.txt")));
			//Ȼ��Ϳ��Ի�ȡ�ļ�����
			byte bs[] = new byte[din.available()];
			din.read(bs);
			String content = new String(bs);
			System.out.println("�ļ�����===="+content);
		}finally{
			din.close();
		}
	}

}