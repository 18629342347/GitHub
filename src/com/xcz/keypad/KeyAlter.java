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
		 * 首先进入try里，如果输入错误，执行catch里面的信息
		 */
		try {
			Scanner sc = new Scanner(System.in);  //键盘输入
			System.out.print("请输入您要修改的姓名：");  //友好提示
			String name = sc.nextLine();
			return name;
		} catch (Exception e) {
			System.out.println("输入的信息有误，请重新输入...");
			return keyAlter();
		}
	}
	
	
	public static int keyAlterName(){
		/**
		 * 首先进入try里，如果输入错误，执行catch里面的信息
		 */
		try {
			Scanner sc = new Scanner(System.in);  //键盘输入
			System.out.print("请输入您要修改的年龄：");  //友好提示
			int age = sc.nextInt();
			return age;
		} catch (Exception e) {
			System.out.println("输入的信息有误，请重新输入...");
			return keyAlterName();
		}
	}
}
