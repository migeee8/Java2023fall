import java.util.Scanner;
import utils.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		StuGroup group=new StuGroup(20);  //group��������20��ѧ��
		int num;  //ʵ�������ѧ����Ϣ
		System.out.println("Ҫ������������Ϣ�����о�����Ϣ��\nA.������\tB.�о���");
		switch(in.next().charAt(0))
		{
		case 'A':
		case 'a':
			System.out.println("����Ҫ������ٸ�����������Ϣ��");
			num = in.nextInt();
			for(int i=0;i<num;i++)
			{
				System.out.println("�������"+(i+1)+"λѧ����ѧ�ţ���������ѧ��������ɼ�");
			 	int id = in.nextInt();
			 	String name = in.next();
			 	double mathScore = in.nextDouble();
			 	double computerScore = in.nextDouble();
				group.addStu(new Undergraduate(id, name, mathScore, computerScore));//��ת��
			}
			
			group.addStu(new Undergraduate(1312,"shgd",99,98.5));
			group.addStu(new Undergraduate(1316,"ddsa",89,88.5));
			group.print();
			break;
		case 'B':
		case 'b':
			System.out.println("����Ҫ������ٸ��о�������Ϣ��");
			num = in.nextInt();
			for(int i=0;i<num;i++)
			{
				System.out.println("�������"+(i+1)+"λѧ����ѧ�ţ���������ѧ��������ɼ�����ʦ���о������Կո����");
				int id = in.nextInt();
			 	String name = in.next();
			 	double mathScore = in.nextDouble();
			 	double computerScore = in.nextDouble();
			 	String tutor = in.next();
			 	String direction = in.next();
			 	group.addStu(new Postgraduate(id, name, mathScore, computerScore, tutor, direction));//��ת��
			}
			group.print();
			group.addStu(new Postgraduate(1312,"shgd",99,98.5,"xyy","os"));
			group.addStu(new Postgraduate(1316,"ddsa",89,88.5,"wcl","rgzn"));
			group.print();
			break;
		default:
			System.out.println("������󣡣���");
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
