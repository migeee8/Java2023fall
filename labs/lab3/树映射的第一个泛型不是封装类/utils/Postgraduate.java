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
		System.out.println("ѧ�ţ�" + getId() + "\t" +
		           "������" + getName() + "\t" +
		           "��ѧ�ɼ���" + getMathScore() + "\t" +
		           "������ɼ���" + getComputerScore() + "\t" +
		           "��ʦ������" + tutor + "\t" +
		           "�о�����" + researchArea);
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
