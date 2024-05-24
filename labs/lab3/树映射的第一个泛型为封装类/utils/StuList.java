package utils;

import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Iterator;

public class StuList implements MyList
{
	//ʹ��˫�����������洢ѧ����Ϣ
	private LinkedList<Student> stu;
	
	public StuList()
	{
		stu = new LinkedList<Student>();
	}
	
	//��ȡ�б��е�ѧ������
	public int size()
    {
        return stu.size();
    }
	
	//���б������ѧ����Ϣ
	public boolean addStu(Student x)  
	{
	    return stu.add(x);
	}
	
	//ɾ��ָ��λ�õ�ѧ����Ϣ
	public Student removeStu(int index)  
	{
	    return stu.remove(index);
	}

	//����б�
    public void clear() 
    {      
         stu.clear();
    }
	
    //ʹ����ӳ�䷺�������ѧ����Ϣ���ճɼ����������
	public void sort(int x)   
	{
		TreeMap<Double,Student> map = new TreeMap<Double,Student>();
		if(x==1)//����1����ѧ����
		{
			//������Ϣ����Double��װ�����TreeMap
			for(int i = 0; i < stu.size(); i++)
			{
				Student temp = stu.get(i);
				map.put(temp.getMathScore(), temp);
			}
		}
		else if(x==2)//����2�����������
		{
			for(int i = 0; i < stu.size(); i++)
			{
				Student temp = stu.get(i);
				map.put(temp.getComputerScore(), temp);
			}
		}
		//������˳�����ѧ����Ϣ
		Collection<Student> collection = map.values();
		Iterator<Student> it = collection.iterator();
		while(it.hasNext())
		{
			Student cur = it.next();
			cur.print();
		}
	}
	
	//��ӡѧ���б�
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
