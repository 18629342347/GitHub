package com.xcz.objectinputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadObjetInputStream {
	/**
	 * 使用输出流读取写入到指定位置上的数据
	 * @author Mr.the little orange
	 */
	public static void ObjInputStream(){
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("f:/student.txt"));
			System.out.println("正在读取成功...");  //友好提示
			for(int x = 3;x >= 1;x--){
				System.out.println("还有" + x + "ms" + "读取成功...");  //所需要的时间差
				Thread.sleep(1000);  //睡眠1ms
			}
			System.out.println("读取到的信息：" + ois.readObject());  //读取到的信息
			ois.close(); //关闭资源
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
