package lab6;


import java.util.*;

public class RWthread{
	public static void main(String args[])
	{
		ReadWrite rw = new ReadWrite();
		rw.read.start();
	}
}

class ReadWrite implements Runnable{
	Thread read;//���߳� ���߳�
	Thread write;//д�߳� �����߳�
	String ID,name;
	
	public ReadWrite() {
		read = new Thread(this);//�̵߳��вι���
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		//�жϵ�ǰ���ĸ��߳�
		if(Thread.currentThread()== read) {
			while(true) {
				System.out.println("������ѧ�ţ�");
				ID = scanner.nextLine();
				if(ID.equals("finish")) {
					System.out.println("\n���̺߳�д�̵߳Ĺ���������");
					return;
				}
				System.out.println("������������");
				name = scanner.nextLine();
				write = new Thread(this);//ÿ��Ҫ����һ���µ�д�̣߳���Ϊ�����߳�Ҫִ��������������˳������˳���ʱ����̱߳�����
				write.start();
				try {
					write.join();//�����߳�
				}catch(InterruptedException e) {}
			}
		}
		
		else if(Thread.currentThread()== write) {
			System.out.println("\n���ѧ�ţ�"+ID + "�����������"+name);
			System.out.println();
		}
	}
}