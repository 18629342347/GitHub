package com.xcz.keypad;

import java.util.Scanner;

public class KeyQuetStu {
	/**
	 * 退出学生信息管理系统
	 * @author Mr.the little orange
	 * @param quet
	 */
	public static void quetStu(String quet){
		try {
			System.out.print("退出系统请按<exit>：");  //友好提示
			Scanner sc = new Scanner(System.in);  //键盘输入
			String line = sc.nextLine();
			if(line.equalsIgnoreCase(quet)){  //忽略大小写进行和传递过来的参数比较
				System.out.println("退出系统成功...");
				System.out.println("欢迎您的下次来访...");
				System.exit(0);  //退出JVM
			}else {
				System.out.println("亲！您退出系统失败...");
				System.out.println("请重新输入...");
				quetStu(quet);  //递归
			}
		} catch (Exception e) {
			System.out.println("请按照提示输入...");
		}
	}
}
