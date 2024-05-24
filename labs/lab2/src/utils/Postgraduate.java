package utils;

public class Postgraduate extends Student
{
	private String tutor;
	private String direction;
	
	public Postgraduate(int id, String name, double mathScore, double computerScore, String tutor, String direction) {
		super(id, name, mathScore, computerScore);
		this.tutor = tutor;
		this.direction = direction;
	}
	
	public void print()
	{
		System.out.println("ѧ�ţ�" + getId() + "\t" +
		           "������" + getName() + "\t" +
		           "��ѧ�ɼ���" + getMathScore() + "\t" +
		           "������ɼ���" + getComputerScore() + "\t" +
		           "��ʦ������" + tutor + "\t" +
		           "�о�����" + direction);
	}
	
	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
}