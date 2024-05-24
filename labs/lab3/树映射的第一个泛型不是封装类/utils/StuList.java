package utils;

import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Iterator;

class Key implements Comparable
{
	double num = 0;
	Key(double num)
	{
		this.num = num;
	}
	@Override
	public int compareTo(Object b) {
		Key t = (Key)b;
		if(this.num == t.num)
			return 1;
		else
			return (int)((this.num - t.num)*10);
	}
	
}
public class StuList implements MyList
{
	//使用双链表泛型类对象存储学生信息
	private LinkedList<Student> stu;
	
	public StuList()
	{
		stu = new LinkedList<Student>();
	}
	
	//获取列表中的学生数量
	public int size()
    {
        return stu.size();
    }
	
	//向列表中添加学生信息
	public boolean addStu(Student x)  
	{
	    return stu.add(x);
	}
	
	//删除指定位置的学生信息
	public Student removeStu(int index)  
	{
	    return stu.remove(index);
	}

	//清空列表
    public void clear() 
    {      
         stu.clear();
    }
	
    //使用树映射泛型类对象将学生信息按照成绩排序并且输出
	public void sort(int x)   
	{
		TreeMap<Key,Student> map = new TreeMap<Key,Student>();
		if(x==1)//参数1按数学排序
		{
			//链表信息按照Key类存入TreeMap
			for(int i = 0; i < stu.size(); i++)
			{
				Student temp = stu.get(i);
				map.put(new Key(temp.getMathScore()), temp);
			}
		}
		else if(x==2)//参数2按计算机排序
		{
			for(int i = 0; i < stu.size(); i++)
			{
				Student temp = stu.get(i);
				map.put(new Key(temp.getComputerScore()), temp);
			}
		}
		//遍历按顺序输出学生信息
		Collection<Student> collection = map.values();
		Iterator<Student> it = collection.iterator();
		while(it.hasNext())
		{
			Student cur = it.next();
			cur.print();
		}
	}
	
	//打印学生列表
	public void print()
	{
		Iterator<Student> it = stu.iterator();
		while(it.hasNext())
		{
			Student cur = it.next();
			cur.print();
		}
	}
		
}
