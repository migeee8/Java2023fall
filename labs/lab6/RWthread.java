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
	Thread read;//读线程 主线程
	Thread write;//写线程 联合线程
	String ID,name;
	
	public ReadWrite() {
		read = new Thread(this);//线程的有参构造
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		//判断当前是哪个线程
		if(Thread.currentThread()== read) {
			while(true) {
				System.out.println("请输入学号：");
				ID = scanner.nextLine();
				if(ID.equals("finish")) {
					System.out.println("\n读线程和写线程的工作结束！");
					return;
				}
				System.out.println("请输入姓名：");
				name = scanner.nextLine();
				write = new Thread(this);//每次要构造一个新的写线程，因为联合线程要执行完所有任务后退出，当退出的时候该线程被消灭
				write.start();
				try {
					write.join();//联合线程
				}catch(InterruptedException e) {}
			}
		}
		
		else if(Thread.currentThread()== write) {
			System.out.println("\n输出学号："+ID + "，输出姓名："+name);
			System.out.println();
		}
	}
}