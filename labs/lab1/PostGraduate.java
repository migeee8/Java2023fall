public class PostGraduate extends Student{
	private String tutor;
	private String dire;

	public PostGraduate(String id, String name, double mathScore, double computerScore, String tutor, String dire){
		super(id, name, mathScore, computerScore);
		this.tutor = tutor;
		this.dire = dire;
	}
	
	public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getDirection() {
        return dire;
    }

    public void setDirection(String dire) {
        this.dire = dire;
    }

    public void print() {
        super.print();
        System.out.println("导师姓名：" + tutor);
        System.out.println("研究方向：" + dire);
    }
    
}