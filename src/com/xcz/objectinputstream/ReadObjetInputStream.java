package com.xcz.objectinputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadObjetInputStream {
	/**
	 * ʹ���������ȡд�뵽ָ��λ���ϵ�����
	 * @author Mr.the little orange
	 */
	public static void ObjInputStream(){
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f:/student.txt"));
			System.out.println("���ڶ�ȡ�ɹ�...");  //�Ѻ���ʾ
			for(int x = 3;x >= 1;x--){
				System.out.println("����" + x + "ms" + "��ȡ�ɹ�...");  //����Ҫ��ʱ���
				Thread.sleep(1000);  //˯��1ms
			}
			System.out.println("��ȡ������Ϣ��" + ois.readObject());  //��ȡ������Ϣ
			ois.close(); //�ر���Դ
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
