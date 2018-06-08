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
public class StudentImpl implements StudentDemo { // ʵ��studentDemo�ӿڲ�����д�ӿ��е����з���
	/**
	 * public private protected friendly֮���������
	 * ---------------------------------------------------------------------------------------------
	 * public:�����г�Ա��������������ֱ�ӷ���
	 * ---------------------------------------------------------------------------------------------
	 * private:˽�л���Ա����������class֮�⣬�����������Է���
	 * ---------------------------------------------------------------------------------------------
	 * friendly:��дĬ��Ϊfriendly���ڵ�ǰ���пɼ����ڱ���������ͷ����඼���Է��ʣ���ͬ�İ�������Ȳ����Է���
	 * ---------------------------------------------------------------------------------------------
	 * protected:�ڱ���������ͷ�������Է��ʣ���������������Է��ʣ������಻���Է��ʣ����������еķ��������˵����˽�л�
	 */
	protected static List<Student> linkedList = ListDemo.getLinkedList(); // ����getLinkedList()����
	private int sid=0;
    
	/**
	 * ���ѧ����Ϣ
	 * 
	 * @throws Exception
	 */
	public void insert() {
		// linkedList.add(KeyPadInsert.keyAdd()); //
		// ʹ��LinkedList��add��������KeyPadDemo.key()�������ѧ����Ϣ
		/*
		 * ʹ��ѭ�����������е�ѧ����Ϣ
		 */
		try {
			boolean flag = true; // ����һ��booleanΪ��
			System.out.print("������Ҫ��ӵĴ�����"); // �Ѻ���ʾ
			System.err.println();  //����
			Scanner sc = new Scanner(System.in); // ��������
			int num = sc.nextInt(); // ����ĸ���
			/**
			 * ʹ��forѭ��������ĸ������п���
			 */
			for (int j = 1; j <= num; j++) {
				linkedList.add(KeyInsert.keyAdd()); // ʹ��LinkedList��add��������KeyPadDemo.key()�������ѧ����Ϣ
				for (int i = 0; i < linkedList.size(); i++) {
					//ʹ��˯��ʱ����ʾ�û���Ҫ3ms��ʱ����ӳɹ�
					System.out.println(linkedList.get(i));
					/*for(int x = 3;x >= 1;x--){
						System.out.println("��������У�����" + x + "ms");  //����Ҫ��ʱ���
						Thread.sleep(1000);  //˯��1ms
					}*/
					System.out.println("������������ӣ����Ժ�..."); // �Ѻ���ʾ
					System.out.println("��ӳɹ�..."); // �Ѻ���ʾ
					//ʹ����������ж�ѧ����Ϣ��д��
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("f:/student.txt"));
					oos.writeObject(linkedList.get(i));
					oos.close();  //�ر���Դ
					System.out.println("д��ɹ�..");  //�Ѻ���ʾ
					System.out.println("************************");
				}
			}
			/**
			 * ���flagΪ��ִ�жԲ����Ĵ���
			 */
			if (flag) {
				String Count = "y";
				String Top = "top";
				KeyCount.exit(Count, Top); // ���ݲ�ѯ�����ͷ���ϵͳ�׽���Ĳ���
			}
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("������ƫ��...");
		}
	}

	/*
	 * public void insert() { linkedList.add(KeyPadInsert.keyAdd()); //
	 * ʹ��LinkedList��add��������KeyPadDemo.key()�������ѧ����Ϣ Scanner sc = new
	 * Scanner(System.in); int count = 3; System.out.println("��������Ҫ��ӵĴ�����"); for
	 * (int i = 1; i <= count; i++) { int next = sc.nextInt(); if (next - i > 0)
	 * { for (int j = 0; j < linkedList.size(); j++) {
	 * System.out.println("���������������..."); // �Ѻ���ʾ
	 * System.out.println(linkedList.get(j)); System.out.println("��ӳɹ�..."); //
	 * �Ѻ���ʾ break; // linkedList.add(KeyPadInsert.keyAdd()); // //
	 * ʹ��LinkedList��add��������KeyPadDemo.key()�������ѧ����Ϣ //
	 * System.out.println("���Ѿ������" + (next - i) + "��"); } break; } else {
	 * StuNum.stuNum(); // ���ò鿴ѧ������ break; }
	 * 
	 * } }
	 */
	/**
	 * �޸�ѧ����Ϣ
	 */
	@Override
	public void update() {
		Scanner sc = new Scanner(System.in); // ��������
		System.out.print("������ID�޸�ѧ����Ϣ��"); // �Ѻ���ʾ
		int ID = sc.nextInt();
		System.out.println("��ʼ����ѧ����Ϣ�ǣ�"); // �Ѻ���ʾ
		// ��ȡ�ü����е�size
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i)); // ����ü����е�Ԫ��
			// ʹ����ǿforѭ���޸�ѧ�������������䣬student���������ͣ�linkedList������
			for (Student student : linkedList) {
				// ��������ID�ͻ�ȡ��ID��ִͬ��if����룬����ִ��else
				if (ID == linkedList.get(i).getId()) {
					student.setName((KeyAlter.keyAlter())); // ͨ��student�������set�����޸�ѧ�����������䣬���洫�ݵ��޸ĵķ���
					student.setAge(KeyAlter.keyAlterName());
					System.out.println("�޸ĺ��ѧ����Ϣ�ǣ�"); // �Ѻ���ʾ
					System.out.println(linkedList.iterator().next()); // ʹ�õ�������ȡ���һ��Ԫ��
				} else {
					System.out.println("�޸�ʧ�ܣ������ID��Ч������������...");
					update(); // �ݹ�
				}
			}
		}
	}
	/**
	 * ��ѯѧ����Ϣ
	 */
	public Student select() {
		Scanner sc = new Scanner(System.in); // ��������
		System.out.print("������ID��ѯ����ѧ����Ϣ��"); // �Ѻ���ʾ
		sid= sc.nextInt();
		boolean flag=false;
		//int index=0;
		for (Student stu : linkedList) {
			if(sid == stu.getId()){
				System.out.println("ѧ������Ϣ�ǣ�" + stu);
				return stu;
			}else {
				System.out.println("��ѯʧ��...");
			}
			show();  //ִ�м���ͨ��ID��ѯѧ����Ϣ
		}
		//�����ѯʧ�ܷ���null
		System.out.println("��ѯʧ��...");  
		return null;
	}
		// �жϸü����е�size
		/*while(sid==linkedList.get(index).getId()){
			System.out.println(linkedList.get(index).getName());
			flag=true;
			show();	
			index++;
		}*/
		/*if(index>linkedList.size()){
			if(flag){
				 System.out.println("��ѯʧ�ܣ��������ID��Ч������������...");	
				 show();
			 }*/
		//}
		 
		
			// ��������ID�ͻ�ȡ��ID��ִͬ��if����룬����ִ��else
			/*if (ID == linkedList.get(index).getId()) {
				boolean contains = linkedList.contains(linkedList.get(i)); // �жϸü����а����ĳ�Ա�Ƿ�ͼ����л�ȡ����ͬ������ֵboolean
				System.out.print("����ֵΪ:" + "{" + contains + "}" + ",˵����ѧ��ϵͳ�а���Ԫ��...");
				System.out.println("********************");
				Iterator<Student> iterator = linkedList.iterator(); // ������
				System.out.println("��ѧ����Ϣϵͳ�е����г�Ա��"); // �Ѻ���ʾ
				System.out.println("********************");
				// ʹ��whileѭ���������������һ��Ԫ�أ����л�ȡ���е�Ԫ��
				while (iterator.hasNext()) {
					System.out.print(iterator.next() + "\t\r");
					
				}
				
			} else {
				System.out.println("��ѯʧ�ܣ��������ID��Ч������������...");
				 // �ݹ�
			}*/
			
		

	/**
	 * ɾ��ѧ����Ϣ
	 */
	@Override
	public void delete() {
		Scanner sc = new Scanner(System.in); // ��������
		System.out.print("������IDɾ��ѧ����Ϣ��"); // �Ѻ���ʾ
		int ID = sc.nextInt();
		/**
		 * ʹ��ѭ�������ü��ϵ�size
		 */
		for (int i = 0; i < linkedList.size(); i++) {
			// ��������ID�ͻ�ȡ��ID��ִͬ��ͨ��IDɾ��ѧ����Ϣ
			if (ID == linkedList.get(i).getId()) {
				linkedList.remove(i); // ɾ��
				System.out.println("ɾ���ɹ�...");
			} else if (linkedList.isEmpty()) { // �жϸü������Ƿ�Ϊ��
				System.out.println("��ϵͳ���Ѿ�û����Ϣ��...");
			} else {
				System.out.println("ɾ��ʧ�ܣ��������ID��Ч������������...");
				delete(); // �ݹ�
			}
		}
	}

	/**
	 * �˳�ѧ����Ϣϵͳ
	 */
	@Override
	public void exit() {
		System.out.println("��ȷ��Ҫ�˳�ѧ����Ϣϵͳ?"); // �Ѻ���ʾ
		String bottom = "exit"; // ����һ���ַ�������
		KeyQuetStu.quetStu(bottom); // �����˳�ϵͳ�����ݲ���
	}
	/**
	 * ������ѯ�ͷ�����ҳ
	 */
	public void show(){
		Scanner sc=new Scanner(System.in);  //��������
		System.out.print("������ѯ�밴<y>,������ҳ�밴<top>");  //�Ѻ���ʾ
		String str=sc.nextLine();
		String Top = sc.nextLine();
		if(str.equalsIgnoreCase("y")){  //���Դ�Сд���бȽ�����ĺ������ֵ�Ƿ���ͬ
			select();  //ִ�в�ѯѧ����Ϣ
		}else if("top".equalsIgnoreCase(Top)){  //���Դ�Сд���бȽ�����ĺ������ֵ�Ƿ���ͬ
			StudentView.view();  //������ҳ
		}else {  
			System.out.println("��������");  //
			show();  //�ݹ�
		}
	}
	
}
