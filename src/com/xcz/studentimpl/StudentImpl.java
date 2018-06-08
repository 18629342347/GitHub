package com.xcz.studentimpl;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
import com.xcz.keypad.KeyAlter;
import com.xcz.keypad.KeyCount;
import com.xcz.keypad.KeyInsert;
import com.xcz.keypad.KeyQuetStu;
import com.xcz.list.ListDemo;
import com.xcz.student.Student;
import com.xcz.student.StudentDemo;
import com.xcz.view.StudentView;

/**
 * @author Mr.the little orange
 *
 */
public class StudentImpl implements StudentDemo { // 实现studentDemo接口并且重写接口中的所有方法
	/**
	 * public private protected friendly之间的作用域
	 * ---------------------------------------------------------------------------------------------
	 * public:对所有成员变量公开，可以直接访问
	 * ---------------------------------------------------------------------------------------------
	 * private:私有化成员变量，除了class之外，其他都不可以访问
	 * ---------------------------------------------------------------------------------------------
	 * friendly:不写默认为friendly，在当前包中可见，在本包中子类和非子类都可以访问，不同的包中子类等不可以访问
	 * ---------------------------------------------------------------------------------------------
	 * protected:在本包中子类和非子类可以访问，其他包中子类可以访问，非子类不可以访问，在其他包中的非子类可以说成是私有化
	 */
	protected static List<Student> linkedList = ListDemo.getLinkedList(); // 调用getLinkedList()方法
	private int sid=0;
    
	/**
	 * 添加学生信息
	 * 
	 * @throws Exception
	 */
	public void insert() {
		// linkedList.add(KeyPadInsert.keyAdd()); //
		// 使用LinkedList的add方法调用KeyPadDemo.key()方法添加学生信息
		/*
		 * 使用循环遍历集合中的学生信息
		 */
		try {
			boolean flag = true; // 声明一个boolean为真
			System.out.print("请输入要添加的次数："); // 友好提示
			System.err.println();  //换行
			Scanner sc = new Scanner(System.in); // 键盘输入
			int num = sc.nextInt(); // 输入的个数
			/**
			 * 使用for循环对输入的个数进行控制
			 */
			for (int j = 1; j <= num; j++) {
				linkedList.add(KeyInsert.keyAdd()); // 使用LinkedList的add方法调用KeyPadDemo.key()方法添加学生信息
				for (int i = 0; i < linkedList.size(); i++) {
					//使用睡眠时间提示用户需要3ms中时间添加成功
					System.out.println(linkedList.get(i));
					/*for(int x = 3;x >= 1;x--){
						System.out.println("正在添加中，还有" + x + "ms");  //所需要的时间差
						Thread.sleep(1000);  //睡眠1ms
					}*/
					System.out.println("正在玩命的添加，请稍后..."); // 友好提示
					System.out.println("添加成功..."); // 友好提示
					//使用输出流进行对学生信息的写入
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f:/student.txt"));
					oos.writeObject(linkedList.get(i));
					oos.close();  //关闭资源
					System.out.println("写入成功..");  //友好提示
					System.out.println("************************");
				}
			}
			/**
			 * 如果flag为真执行对参数的传递
			 */
			if (flag) {
				String Count = "y";
				String Top = "top";
				KeyCount.exit(Count, Top); // 传递查询人数和返回系统首界面的参数
			}
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("程序跑偏了...");
		}
	}

	/*
	 * public void insert() { linkedList.add(KeyPadInsert.keyAdd()); //
	 * 使用LinkedList的add方法调用KeyPadDemo.key()方法添加学生信息 Scanner sc = new
	 * Scanner(System.in); int count = 3; System.out.println("请输入你要添加的次数："); for
	 * (int i = 1; i <= count; i++) { int next = sc.nextInt(); if (next - i > 0)
	 * { for (int j = 0; j < linkedList.size(); j++) {
	 * System.out.println("正在玩命的添加中..."); // 友好提示
	 * System.out.println(linkedList.get(j)); System.out.println("添加成功..."); //
	 * 友好提示 break; // linkedList.add(KeyPadInsert.keyAdd()); // //
	 * 使用LinkedList的add方法调用KeyPadDemo.key()方法添加学生信息 //
	 * System.out.println("你已经添加了" + (next - i) + "次"); } break; } else {
	 * StuNum.stuNum(); // 调用查看学生人数 break; }
	 * 
	 * } }
	 */
	/**
	 * 修改学生信息
	 */
	@Override
	public void update() {
		Scanner sc = new Scanner(System.in); // 键盘输入
		System.out.print("请输入ID修改学生信息："); // 友好提示
		int ID = sc.nextInt();
		System.out.println("初始化的学生信息是："); // 友好提示
		// 获取该集合中的size
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i)); // 输入该集合中的元素
			// 使用增强for循环修改学生的姓名和年龄，student是数据类型，linkedList是名称
			for (Student student : linkedList) {
				// 如果输入的ID和获取的ID相同执行if里代码，否则执行else
				if (ID == linkedList.get(i).getId()) {
					student.setName((KeyAlter.keyAlter())); // 通过student对象调用set方法修改学生姓名和年龄，里面传递的修改的方法
					student.setAge(KeyAlter.keyAlterName());
					System.out.println("修改后的学生信息是："); // 友好提示
					System.out.println(linkedList.iterator().next()); // 使用迭代器获取最后一个元素
				} else {
					System.out.println("修改失败，输入的ID无效，请重新输入...");
					update(); // 递归
				}
			}
		}
	}
	/**
	 * 查询学生信息
	 */
	public Student select() {
		Scanner sc = new Scanner(System.in); // 键盘输入
		System.out.print("请输入ID查询所有学生信息："); // 友好提示
		sid= sc.nextInt();
		boolean flag=false;
		//int index=0;
		for (Student stu : linkedList) {
			if(sid == stu.getId()){
				System.out.println("学生的信息是：" + stu);
				return stu;
			}else {
				System.out.println("查询失败...");
			}
			show();  //执行继续通过ID查询学生信息
		}
		//如果查询失败返回null
		System.out.println("查询失败...");  
		return null;
	}
		// 判断该集合中的size
		/*while(sid==linkedList.get(index).getId()){
			System.out.println(linkedList.get(index).getName());
			flag=true;
			show();	
			index++;
		}*/
		/*if(index>linkedList.size()){
			if(flag){
				 System.out.println("查询失败，您输入的ID无效，请重新输入...");	
				 show();
			 }*/
		//}
		 
		
			// 如果输入的ID和获取的ID相同执行if里代码，否则执行else
			/*if (ID == linkedList.get(index).getId()) {
				boolean contains = linkedList.contains(linkedList.get(i)); // 判断该集合中包含的成员是否和集合中获取的相同，返回值boolean
				System.out.print("返回值为:" + "{" + contains + "}" + ",说明该学生系统中包含元素...");
				System.out.println("********************");
				Iterator<Student> iterator = linkedList.iterator(); // 迭代器
				System.out.println("该学生信息系统中的所有成员："); // 友好提示
				System.out.println("********************");
				// 使用while循环遍历，如果有下一个元素，进行获取所有的元素
				while (iterator.hasNext()) {
					System.out.print(iterator.next() + "\t\r");
					
				}
				
			} else {
				System.out.println("查询失败，您输入的ID无效，请重新输入...");
				 // 递归
			}*/
			
		

	/**
	 * 删除学生信息
	 */
	@Override
	public void delete() {
		Scanner sc = new Scanner(System.in); // 键盘输入
		System.out.print("请输入ID删除学生信息："); // 友好提示
		int ID = sc.nextInt();
		/**
		 * 使用循环遍历该集合的size
		 */
		for (int i = 0; i < linkedList.size(); i++) {
			// 如果输入的ID和获取的ID相同执行通过ID删除学生信息
			if (ID == linkedList.get(i).getId()) {
				linkedList.remove(i); // 删除
				System.out.println("删除成功...");
			} else if (linkedList.isEmpty()) { // 判断该集合中是否为空
				System.out.println("该系统中已经没有信息了...");
			} else {
				System.out.println("删除失败，您输入的ID无效，请重新输入...");
				delete(); // 递归
			}
		}
	}

	/**
	 * 退出学生信息系统
	 */
	@Override
	public void exit() {
		System.out.println("您确定要退出学生信息系统?"); // 友好提示
		String bottom = "exit"; // 定义一个字符串常量
		KeyQuetStu.quetStu(bottom); // 调用退出系统并传递参数
	}
	/**
	 * 继续查询和返回主页
	 */
	public void show(){
		Scanner sc=new Scanner(System.in);  //键盘输入
		System.out.print("继续查询请按<y>,返回主页请按<top>");  //友好提示
		String str=sc.nextLine();
		String Top = sc.nextLine();
		if(str.equalsIgnoreCase("y")){  //忽略大小写进行比较输入的和里面的值是否相同
			select();  //执行查询学生信息
		}else if("top".equalsIgnoreCase(Top)){  //忽略大小写进行比较输入的和里面的值是否相同
			StudentView.view();  //返回主页
		}else {  
			System.out.println("输入有误");  //
			show();  //递归
		}
	}
	
}
