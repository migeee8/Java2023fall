package utils;

public class Postgraduate extends Student
{
	private String tutor;
	private String researchArea;
	
	public Postgraduate(int id,String name,double mathScore,double computerScore,String tutor,String area)
	{
		super(id, name, mathScore, computerScore);
		this.tutor = tutor;
		this.researchArea = area;
	}
	
	public void print()
	{
		System.out.println("学号：" + getId() + "\t" +
		           "姓名：" + getName() + "\t" +
		           "数学成绩：" + getMathScore() + "\t" +
		           "计算机成绩：" + getComputerScore() + "\t" +
		           "导师姓名：" + tutor + "\t" +
		           "研究方向：" + researchArea);
	}

	public String getTutor()
	{
		return tutor;
	}

	public void setTutor(String tutor)
	{
		this.tutor = tutor;
	}

	public String getResearchArea()
	{
		return researchArea;
	}

	public void setResearchArea(String researchArea)
	{
		this.researchArea = researchArea;
	}

}
