public class Student{
	private String id;
	private String name;
	private double mathScore;
	private double computerScore;

	public Student(String id, String name, double mathScore, double computerScore){
		this.id = id;
		this.name = name;
		this.mathScore = mathScore;
		this.computerScore = computerScore;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getMathScore(){
		return mathScore;
	}

	public void setMathScore(double mathScore){
		this.mathScore = mathScore;
	}

	public double getComputerScore(){
		return computerScore;
	}

	public void setComputerScore(double computerScore){
		this.computerScore = computerScore;
	}

	public void print(){
		System.out.println("学号：" + id + " " + "姓名：" + name + " " + "数学成绩：" + mathScore + " " + "计算机成绩：" + computerScore);
	}

}
