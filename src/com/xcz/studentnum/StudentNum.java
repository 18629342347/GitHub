package com.xcz.studentnum;

import java.util.Scanner;

import com.xcz.studentimpl.StudentImpl;

public class StudentNum extends StudentImpl { // �̳�StudentImpl
	/**
	 * ��ѯ����������
	 * 
	 * @author Mr.the little orange
	 * @param s
	 */
	public static void studentNum(String s) {
		try {
			Scanner sc = new Scanner(System.in); // ��������
			for (;;) {
				if (!sc.hasNextInt()) { // �ж�������Ƿ�Ϊ���֣����������ִ��else
					String select = sc.nextLine();
					if (select.equalsIgnoreCase(s)) { // ���Դ�Сд����ָ���Ĳ�ѯ�ַ���
						// �ж��Ƿ�Ϊ�գ����Ϊ�գ�û�в���ѧ����Ϣ����֮���ѧ����Ϣ����
						if (linkedList.isEmpty()) {
							System.out.println("û��ѧ����Ϣ...");
							break;
						} else {
							int size = linkedList.size(); // ����
							System.out.println("����ͳ����...");
							//Thread.sleep(3000);
							System.out.print("ͳ�Ƴ�" + "<" + size + ">" + "��ѧ����Ϣ����"); // ��ӡ�����е�ѧ������
							System.out.println();
							System.out.print("����ϵͳ��ҳ�밴<top>��"); // �Ѻ���ʾ
							break;
						}
					}
				} else {
					System.out.println("�������������������...");
					System.out.print("ͳ��ѧ�������밴<count>��"); // �Ѻ���ʾ
					StudentNum.studentNum(s);
					break;
				}
			}
		} catch (Exception e) {
			
		}
	}
}
