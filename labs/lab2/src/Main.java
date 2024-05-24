import java.util.Scanner;
import utils.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		StuGroup group=new StuGroup(20);  //group可以容纳20个学生
		int num;  //实际输入的学生信息
		System.out.println("要创建本科生信息表还是研究生信息表？\nA.本科生\tB.研究生");
		switch(in.next().charAt(0))
		{
		case 'A':
		case 'a':
			System.out.println("请问要输入多少个本科生的信息？");
			num = in.nextInt();
			for(int i=0;i<num;i++)
			{
				System.out.println("请输入第"+(i+1)+"位学生的学号，姓名，数学、计算机成绩");
			 	int id = in.nextInt();
			 	String name = in.next();
			 	double mathScore = in.nextDouble();
			 	double computerScore = in.nextDouble();
				group.addStu(new Undergraduate(id, name, mathScore, computerScore));//上转型
			}
			
			group.addStu(new Undergraduate(1312,"shgd",99,98.5));
			group.addStu(new Undergraduate(1316,"ddsa",89,88.5));
			group.print();
			break;
		case 'B':
		case 'b':
			System.out.println("请问要输入多少个研究生的信息？");
			num = in.nextInt();
			for(int i=0;i<num;i++)
			{
				System.out.println("请输入第"+(i+1)+"位学生的学号，姓名，数学、计算机成绩，导师和研究方向，以空格隔开");
				int id = in.nextInt();
			 	String name = in.next();
			 	double mathScore = in.nextDouble();
			 	double computerScore = in.nextDouble();
			 	String tutor = in.next();
			 	String direction = in.next();
			 	group.addStu(new Postgraduate(id, name, mathScore, computerScore, tutor, direction));//上转型
			}
			group.print();
			group.addStu(new Postgraduate(1312,"shgd",99,98.5,"xyy","os"));
			group.addStu(new Postgraduate(1316,"ddsa",89,88.5,"wcl","rgzn"));
			group.print();
			break;
		default:
			System.out.println("输入错误！！！");
			break;
		}
		
		in.close();
		
		group.removeStu(2);
		group.print();
		group.sort(1);
		group.print();
		group.sort(2);
		group.print();
	}
}
