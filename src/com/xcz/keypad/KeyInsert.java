package com.xcz.keypad;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.xcz.student.Student;

public class KeyInsert {
	/**
	 * �ֶ�����Ҫ���ѧ����Ϣ��ID������������
	 * 
	 * @author My.the little orange
	 * @return
	 * @throws IOException 
	 * @throws Exception
	 */
	public static Student keyAdd(){
		// try {
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫ��ӵ�ID��");
		int ID = sc.nextInt();
		System.out.print("������Ҫ��ӵ�������");
		String Name = sc.next();
		System.out.print("������Ҫ��ӵ����䣺");
		int Age = sc.nextInt();
		Student stu = new Student(ID, Name, Age); // ��¼���ѧ����Ϣ�洢��Student��
		//ʹ�����������ж����ݵ�д��
		/*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f:/student.txt",true));
		oos.writeObject(stu);  //д������
		oos.close();  //�ر���Դ
*/		return stu;
	}
}
