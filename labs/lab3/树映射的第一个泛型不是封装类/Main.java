import utils.Postgraduate;
import utils.StuList;
import utils.Student;
import utils.Undergraduate;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		StuList list=new StuList();  //����ѧ��������ʵ��1��ͬ�ˣ����췽����û�в�����
		int num;  //ʵ�������ѧ����Ϣ
		System.out.println("version2.0/Ҫ������������Ϣ�����о�����Ϣ��\nA.������\tB.�о���");
		switch(in.next().charAt(0))
		{
		case 'A':
		case 'a':
			System.out.println("����Ҫ������ٸ�����������Ϣ��");
			num=in.nextInt();
			for(int i=0;i<num;i++)
			{
				System.out.println("�������"+(i+1)+"λѧ����ѧ�ţ���������ѧ��������ɼ�");
				Student t=new Undergraduate(in.nextInt(),in.next(),in.nextDouble(),in.nextDouble());
				list.addStu(t);
			}
			System.out.println("print1��");
			list.print();
			list.addStu(new Undergraduate(1312,"shgd",99,98.5));
			list.addStu(new Undergraduate(1316,"ddsa",89,88.5));
			System.out.println("print2��");
			list.print();
			break;
		case 'B':
		case 'b':
			System.out.println("����Ҫ������ٸ��о�������Ϣ��");
			num=in.nextInt();
			for(int i=0;i<num;i++)
			{
				System.out.println("�������"+(i+1)+"λѧ����ѧ�ţ���������ѧ��������ɼ�����ʦ���о������Կո����");
				Student t=new Postgraduate(in.nextInt(),in.next(),in.nextDouble(),in.nextDouble(),in.next(),in.next());
				list.addStu(t);
			}
			System.out.println("print1��");
			list.print();
			list.addStu(new Postgraduate(1312,"shgd",99,98.5,"xyy","os"));
			list.addStu(new Postgraduate(1316,"ddsa",89,88.5,"wcl","rgzn"));
			System.out.println("print2��");
			list.print();
			break;
		default:
			System.out.println("������󣡣���");
			break;
		}
		
		in.close();
		
		list.removeStu(2);
		System.out.println("print3��");
		list.print();
                                //��ʵ��1��ͬ�ˣ�ɾ��������sort���������print������
		System.out.println("print4��");
		list.sort(1);
		System.out.println("print5��");
		list.sort(2);
	}
}
