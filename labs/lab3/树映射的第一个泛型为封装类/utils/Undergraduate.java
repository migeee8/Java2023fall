package utils;

public class Undergraduate extends Student
{
	public Undergraduate(int id,String name,double mathScore,double computerScore)
	{
		super(id, name, mathScore, computerScore);
	}

	public void print()
	{	
		System.out.println("学号：" + getId() + "\t" +
		           "姓名：" + getName() + "\t" +
		           "数学成绩：" + getMathScore() + "\t" +
		           "计算机成绩：" + getComputerScore());
	}

}
