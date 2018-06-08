package com.xcz.view;

import java.util.Scanner;

import com.xcz.objectinputstream.ReadObjetInputStream;
import com.xcz.student.StudentDemo;
import com.xcz.studentimpl.StudentImpl;

/**
 * 
 * @author Mr.the little orange
 *
 */
public class StudentView {
	static StudentDemo sdd = new StudentImpl();
	//窗口美化
	public static int view(){
		Scanner sc = new Scanner(System.in);
		System.err.println("\t\t\t\t******************************************");
		System.err.println(" \t\t\t\t\t\t1.添加学生信息");
		System.err.println(" \t\t\t\t\t\t2.删除学生信息");
		System.err.println(" \t\t\t\t\t\t3.修改学生信息");
		System.err.println(" \t\t\t\t\t\t4.查询学生信息");
		System.err.println(" \t\t\t\t\t\t5.查看写入数据");
		System.err.println(" \t\t\t\t\t\t0.退出管理系统");
		System.err.println("\t\t\t\t******************************************");
		System.err.print("请输入要操作的功能：");
		//判断用户输入的是否为整数
		if(!sc.hasNextInt()){
			System.out.println("您输入的不是一个有效数字，请重新输入...");
			StudentView.view();  //主界面
		}else{
			switch (sc.nextInt()) {  //判断用户输入的数值
			case 1:
				sdd.insert();  //插入学生信息
				view();  //递归
				break;
			case 2:
				sdd.delete();  //删除学生信息
				view();  //递归
				break;
			case 3:
				sdd.update();  //修改学生信息
				view();
				break;
			case 4:
				sdd.select();  //查询学生信息
				view();
				break;
			case 5:
				ReadObjetInputStream.ObjInputStream();  //从输出流中读取之前添加的信息
				view();
				break;
			case 0:
				sdd.exit();  //退出学生信息管理系统
				break;
			default:
				System.out.println("版本更新维护中，请输入指定的范围...");
				System.out.println("输入的超出了指定范围，范围在0~4");
				break;
			}
		}
		return 0;
	}
}
