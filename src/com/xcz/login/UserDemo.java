package com.xcz.login;

import java.util.Scanner;

import com.xcz.view.StudentView;

public class UserDemo {
	/**
	 * ������
	 * @author Mr.the little orange
	 */
	public static void user() {
		System.err.println("\t\t\t\t******************************************");
		System.err.println("\t\t\t\t\t\tѧ����Ϣ����ϵͳ");
		System.err.println("\t\t\t\t******************************************");
		Scanner sc = new Scanner(System.in);  //��������
		String username = "admin";  //�û���
		String password = "123";  //����
		int count = 3;  //������
		for (int i = 1; i <= count; i++) {
			System.err.print("�������û�����");  //�Ѻ���ʾ
			String user = sc.nextLine();
			System.err.print("���������룺");  //�Ѻ���ʾ
			String upwd = sc.nextLine();
			//���Դ�Сд�ж��û����������Ƿ�ƥ��
			if (user.equalsIgnoreCase(username) && upwd.equalsIgnoreCase(password)) {
				StudentView.view();  //��ɾ�Ĳ����
				break;
			} else {
				//�ж��û����������������3����������˺Ŷ���
				if (count - i > 0) {
					System.out.println("�û�����������󣬻���" + (count - i) + "���������");
				} else {
					System.out.println("�˺��Ѿ�����...");
					break;
				}
			}
		}
	}
}
