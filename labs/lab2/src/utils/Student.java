package utils;

public abstract class Student 
{
    //����ѧ�����������ѧ�ţ�int��,������String��,��ѧ�ɼ���double����������ɼ���double��
    //����Ա������������ 
	private int id;
	private String name;
	private double mathScore;
	private double computerScore;
	
    //�����췽���� 
	public Student(int id, String name, double mathScore, double computerScore){
		this.id = id;
		this.name = name;
		this.mathScore = mathScore;
		this.computerScore = computerScore;
	}
	
    //����ȡѧ�š�
    public int getId(){
		return id;
	}
    //������ѧ�š�
	public void setId(int id){
		this.id = id;
	}
	
    //����ȡ������
	public String getName(){
		return name;
	}
    //������������
	public void setName(String name){
		this.name = name;
	}
     
    //����ȡ��ѧ�ɼ���
	public double getMathScore(){
		return mathScore;
	}
    //��������ѧ�ɼ���
	public void setMathScore(double mathScore){
		this.mathScore = mathScore;
	}

    //����ȡ������ɼ���
	public double getComputerScore(){
		return computerScore;
	}
    //�����ü�����ɼ���
	public void setComputerScore(double computerScore){
		this.computerScore = computerScore;
	}
	
	//����ʱ��̬
      public abstract void print(); //���󷽷�������Ҫʵ�����������Ҳ�������ѧ������Ϣ
	
}
