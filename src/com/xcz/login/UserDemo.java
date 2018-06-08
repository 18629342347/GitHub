package com.xcz.login;

import java.util.Scanner;

import com.xcz.view.StudentView;

public class UserDemo {
	/**
	 * 主界面
	 * @author Mr.the little orange
	 */
	public static void user() {
		System.err.println("\t\t\t\t******************************************");
		System.err.println("\t\t\t\t\t\t学生信息管理系统");
		System.err.println("\t\t\t\t******************************************");
		Scanner sc = new Scanner(System.in);  //键盘输入
		String username = "admin";  //用户名
		String password = "123";  //密码
		int count = 3;  //计数器
		for (int i = 1; i <= count; i++) {
			System.err.print("请输入用户名：");  //友好提示
			String user = sc.nextLine();
			System.err.print("请输入密码：");  //友好提示
			String upwd = sc.nextLine();
			//忽略大小写判断用户名和密码是否匹配
			if (user.equalsIgnoreCase(username) && upwd.equalsIgnoreCase(password)) {
				StudentView.view();  //增删改查界面
				break;
			} else {
				//判断用户输入错误次数，如果3次输入错误账号冻结
				if (count - i > 0) {
					System.out.println("用户名或密码错误，还有" + (count - i) + "次输入机会");
				} else {
					System.out.println("账号已经冻结...");
					break;
				}
			}
		}
	}
}
