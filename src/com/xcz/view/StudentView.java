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
	//��������
	public static int view(){
		Scanner sc = new Scanner(System.in);
		System.err.println("\t\t\t\t******************************************");
		System.err.println(" \t\t\t\t\t\t1.���ѧ����Ϣ");
		System.err.println(" \t\t\t\t\t\t2.ɾ��ѧ����Ϣ");
		System.err.println(" \t\t\t\t\t\t3.�޸�ѧ����Ϣ");
		System.err.println(" \t\t\t\t\t\t4.��ѯѧ����Ϣ");
		System.err.println(" \t\t\t\t\t\t5.�鿴д������");
		System.err.println(" \t\t\t\t\t\t0.�˳�����ϵͳ");
		System.err.println("\t\t\t\t******************************************");
		System.err.print("������Ҫ�����Ĺ��ܣ�");
		//�ж��û�������Ƿ�Ϊ����
		if(!sc.hasNextInt()){
			System.out.println("������Ĳ���һ����Ч���֣�����������...");
			StudentView.view();  //������
		}else{
			switch (sc.nextInt()) {  //�ж��û��������ֵ
			case 1:
				sdd.insert();  //����ѧ����Ϣ
				view();  //�ݹ�
				break;
			case 2:
				sdd.delete();  //ɾ��ѧ����Ϣ
				view();  //�ݹ�
				break;
			case 3:
				sdd.update();  //�޸�ѧ����Ϣ
				view();
				break;
			case 4:
				sdd.select();  //��ѯѧ����Ϣ
				view();
				break;
			case 5:
				ReadObjetInputStream.ObjInputStream();  //��������ж�ȡ֮ǰ��ӵ���Ϣ
				view();
				break;
			case 0:
				sdd.exit();  //�˳�ѧ����Ϣ����ϵͳ
				break;
			default:
				System.out.println("�汾����ά���У�������ָ���ķ�Χ...");
				System.out.println("����ĳ�����ָ����Χ����Χ��0~4");
				break;
			}
		}
		return 0;
	}
}
