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
		System.out.println("学号：" + getId() + "\t" +
		           "姓名：" + getName() + "\t" +
		           "数学成绩：" + getMathScore() + "\t" +
		           "计算机成绩：" + getComputerScore() + "\t" +
		           "导师姓名：" + tutor + "\t" +
		           "研究方向：" + direction);
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