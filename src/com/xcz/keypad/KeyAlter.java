package com.xcz.keypad;

import java.util.Scanner;

import com.xcz.student.Student;
public class KeyAlter {
	/**
	 * 
	 * @return Name
	 * @author Mr.the little orange
	 * 
	 */
	public static String keyAlter(){
		/**
		 * ���Ƚ���try�����������ִ��catch�������Ϣ
		 */
		try {
			Scanner sc = new Scanner(System.in);  //��������
			System.out.print("��������Ҫ�޸ĵ�������");  //�Ѻ���ʾ
			String name = sc.nextLine();
			return name;
		} catch (Exception e) {
			System.out.println("�������Ϣ��������������...");
			return keyAlter();
		}
	}
	
	
	public static int keyAlterName(){
		/**
		 * ���Ƚ���try�����������ִ��catch�������Ϣ
		 */
		try {
			Scanner sc = new Scanner(System.in);  //��������
			System.out.print("��������Ҫ�޸ĵ����䣺");  //�Ѻ���ʾ
			int age = sc.nextInt();
			return age;
		} catch (Exception e) {
			System.out.println("�������Ϣ��������������...");
			return keyAlterName();
		}
	}
}
