package com.xcz.keypad;

import java.util.Scanner;

public class KeyQuetStu {
	/**
	 * �˳�ѧ����Ϣ����ϵͳ
	 * @author Mr.the little orange
	 * @param quet
	 */
	public static void quetStu(String quet){
		try {
			System.out.print("�˳�ϵͳ�밴<exit>��");  //�Ѻ���ʾ
			Scanner sc = new Scanner(System.in);  //��������
			String line = sc.nextLine();
			if(line.equalsIgnoreCase(quet)){  //���Դ�Сд���кʹ��ݹ����Ĳ����Ƚ�
				System.out.println("�˳�ϵͳ�ɹ�...");
				System.out.println("��ӭ�����´�����...");
				System.exit(0);  //�˳�JVM
			}else {
				System.out.println("�ף����˳�ϵͳʧ��...");
				System.out.println("����������...");
				quetStu(quet);  //�ݹ�
			}
		} catch (Exception e) {
			System.out.println("�밴����ʾ����...");
		}
	}
}
