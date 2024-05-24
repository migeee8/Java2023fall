package utils;

import java.util.Arrays;

public class StuGroup implements MyGroup //StuGroup实现了MyGroup接口
{
	 private Student[] stu;
	 private int length;   //实际容量
	
	public StuGroup(int len)
	{
		this.stu = new Student[len];
		this.length = 0;
	}
	
	public boolean isOverflow()    //辅助方法，判断数组是否溢出
	{
		if(this.length<stu.length)
			return false;
		else
			return true;
	}
	
	public boolean isEmpty()    //判断数组是否为空
	{
		return this.length==0;
	}
	
	public boolean addStu(Student x)  //添加学生信息
	{
		if(isOverflow())
			return false;
		stu[length++]=x;
		return true;
	}
	
	public Student removeStu(int index)  //删除指定位置的学生信息
	{
		if(isEmpty())
		{
			System.out.println("学生表空的~~~删除失败~~~~");
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
	
	public void sort(int x)   //排序，参数1按数学成绩排序，参数2按计算机成绩排序
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
