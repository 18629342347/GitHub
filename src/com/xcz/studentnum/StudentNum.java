package com.xcz.studentnum;

import java.util.Scanner;

import com.xcz.studentimpl.StudentImpl;

public class StudentNum extends StudentImpl { // 继承StudentImpl
	/**
	 * 查询集合中人数
	 * 
	 * @author Mr.the little orange
	 * @param s
	 */
	public static void studentNum(String s) {
		try {
			Scanner sc = new Scanner(System.in); // 键盘输入
			for (;;) {
				if (!sc.hasNextInt()) { // 判断输入的是否为数字，如果是数字执行else
					String select = sc.nextLine();
					if (select.equalsIgnoreCase(s)) { // 忽略大小写输入指定的查询字符串
						// 判断是否为空，如果为空，没有插入学生信息，反之查出学生信息个数
						if (linkedList.isEmpty()) {
							System.out.println("没有学生信息...");
							break;
						} else {
							int size = linkedList.size(); // 个数
							System.out.println("正在统计中...");
							//Thread.sleep(3000);
							System.out.print("统计出" + "<" + size + ">" + "个学生信息人数"); // 打印集合中的学生人数
							System.out.println();
							System.out.print("返回系统首页请按<top>："); // 友好提示
							break;
						}
					}
				} else {
					System.out.println("输入的有误，请重新输入...");
					System.out.print("统计学生人数请按<count>："); // 友好提示
					StudentNum.studentNum(s);
					break;
				}
			}
		} catch (Exception e) {
			
		}
	}
}
