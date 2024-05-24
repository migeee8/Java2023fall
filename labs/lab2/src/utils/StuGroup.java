package utils;

import java.util.Arrays;

public class StuGroup implements MyGroup //StuGroupʵ����MyGroup�ӿ�
{
	 private Student[] stu;
	 private int length;   //ʵ������
	
	public StuGroup(int len)
	{
		this.stu = new Student[len];
		this.length = 0;
	}
	
	public boolean isOverflow()    //�����������ж������Ƿ����
	{
		if(this.length<stu.length)
			return false;
		else
			return true;
	}
	
	public boolean isEmpty()    //�ж������Ƿ�Ϊ��
	{
		return this.length==0;
	}
	
	public boolean addStu(Student x)  //���ѧ����Ϣ
	{
		if(isOverflow())
			return false;
		stu[length++]=x;
		return true;
	}
	
	public Student removeStu(int index)  //ɾ��ָ��λ�õ�ѧ����Ϣ
	{
		if(isEmpty())
		{
			System.out.println("ѧ����յ�~~~ɾ��ʧ��~~~~");
			return null;
		}
		Student temp=stu[index-1];
		for(int i=index-1;i<this.length-1;i++)
		{
			stu[i]=stu[i+1];
		}
		this.length--;
		return temp;
	}
	
	public void sort(int x)   //���򣬲���1����ѧ�ɼ����򣬲���2��������ɼ�����
	{
		if(x==1)
		{
			Arrays.sort(stu, 0, this.length, (a, b) -> Double.compare(a.getMathScore(), b.getMathScore()));
		}
		else if(x==2)
		{
			Arrays.sort(stu, 0, this.length, (a, b) -> Double.compare(a.getComputerScore(), b.getComputerScore()));
		}
     }
	
	public void print()
	{
		for (int i = 0; i < this.length; i++) {
	        stu[i].print();
	    }
	}
		
}
