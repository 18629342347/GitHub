package com.xcz.keypad;

import java.util.Scanner;

import com.xcz.view.StudentView;
/**
 * ͳ��ѧ����Ϣ�����ͷ���ϵͳ��ҳ
 * @author Mr.the little orange
 *
 */
public class KeyCount {
	public static void exit(String ct,String tp){
		Scanner sc = new Scanner(System.in);  //��������
		System.out.print("����ͳ��ѧ����Ϣ�����밴<y>��");  //�Ѻ���ʾ
		String Number = sc.nextLine();
		if(Number.equalsIgnoreCase(ct)){  //���Դ�Сд���кʹ��ݹ����Ĳ鿴ѧ�������ַ�������ƥ��
			KeyStuNum.stuNum(); // ���ò鿴ѧ������
		}else {
			System.out.println("��������������������...");
			exit(ct,tp);  //�ݹ�
		}
		String Top = sc.nextLine();
		if (Top.equalsIgnoreCase(tp)) {  //���Դ�Сд���кʹ��ݹ����ķ���ϵͳ�������ַ�������ƥ��
			StudentView.view();  //������
		}else {
			System.out.println("���������������������...");
			exit(ct,tp);  //�ݹ�
		}
	}
}
