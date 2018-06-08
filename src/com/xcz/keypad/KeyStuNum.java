package com.xcz.keypad;

import com.xcz.studentnum.StudentNum;

public class KeyStuNum {
	/**
	 * 查看学生的人数
	 * @author Mr.the little orange
	 */
	public static void stuNum(){
		System.out.print("统计学生人数请按<count>：");  //友好提示
		String str = "count";  //定义一个字符串常量
		StudentNum.studentNum(str);  //将该参数传递给调用查询集合中人数的方法
	}
}
