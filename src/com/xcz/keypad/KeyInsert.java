package com.xcz.keypad;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.xcz.student.Student;

public class KeyInsert {
	/**
	 * 手动输入要添加学生信息的ID、姓名、年龄
	 * 
	 * @author My.the little orange
	 * @return
	 * @throws IOException 
	 * @throws Exception
	 */
	public static Student keyAdd(){
		// try {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要添加的ID：");
		int ID = sc.nextInt();
		System.out.print("请输入要添加的姓名：");
		String Name = sc.next();
		System.out.print("请输入要添加的年龄：");
		int Age = sc.nextInt();
		Student stu = new Student(ID, Name, Age); // 将录入的学生信息存储到Student中
		//使用输入流进行对数据的写入
		/*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f:/student.txt",true));
		oos.writeObject(stu);  //写入数据
		oos.close();  //关闭资源
*/		return stu;
	}
}
