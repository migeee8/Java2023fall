package utils;

public class Undergraduate extends Student
{
	public Undergraduate(int id,String name,double mathScore,double computerScore)
	{
		super(id, name, mathScore, computerScore);
	}

	public void print()
	{	
		System.out.println("ѧ�ţ�" + getId() + "\t" +
		           "������" + getName() + "\t" +
		           "��ѧ�ɼ���" + getMathScore() + "\t" +
		           "������ɼ���" + getComputerScore());
	}

}
