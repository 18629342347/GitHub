package com.xcz.keypad;

import java.util.Scanner;

import com.xcz.view.StudentView;
/**
 * 统计学生信息人数和返回系统首页
 * @author Mr.the little orange
 *
 */
public class KeyCount {
	public static void exit(String ct,String tp){
		Scanner sc = new Scanner(System.in);  //键盘输入
		System.out.print("进入统计学生信息人数请按<y>：");  //友好提示
		String Number = sc.nextLine();
		if(Number.equalsIgnoreCase(ct)){  //忽略大小写进行和传递过来的查看学生人数字符串常量匹配
			KeyStuNum.stuNum(); // 调用查看学生人数
		}else {
			System.out.println("你输入有误，请重新输入...");
			exit(ct,tp);  //递归
		}
		String Top = sc.nextLine();
		if (Top.equalsIgnoreCase(tp)) {  //忽略大小写进行和传递过来的返回系统主界面字符串常量匹配
			StudentView.view();  //主界面
		}else {
			System.out.println("您输入的有误，请重新输入...");
			exit(ct,tp);  //递归
		}
	}
}
