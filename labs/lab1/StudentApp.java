import java.util.*;

public class StudentApp{
	public static void main(String args[]){
	 	Scanner reader = new Scanner(System.in);
	 	ArrayList<Student> studentsArray = new ArrayList<>();

	 	//输入学生信息并存入数组
	 	while (true) {
            try {
                System.out.print("请输入学生学号：");
                String id = reader.next();
                System.out.print("学生姓名：");
                String name = reader.next();
                System.out.print("数学成绩：");
                double mathScore = reader.nextDouble();
                System.out.print("计算机成绩：");
                double computerScore = reader.nextDouble();
                System.out.print("学生类型（本科生或研究生）：");
                String studentType = reader.next();

                if ("本科生".equalsIgnoreCase(studentType)) {
                    Student student = new Student(id, name, mathScore, computerScore);
                    studentsArray.add(student);
                } else if ("研究生".equalsIgnoreCase(studentType)) {
                    System.out.print("导师姓名：");
                    String tutor = reader.next();
                    System.out.print("研究方向：");
                    String direction = reader.next();
                    PostGraduate postGraduate = new PostGraduate(id, name, mathScore, computerScore, tutor, direction);
                    studentsArray.add(postGraduate);
                }

                System.out.print("输入任意字符（串）继续添加学生 添加完毕请输入done：");
                String input = reader.next();
                if ("done".equalsIgnoreCase(input)) {
                    break;
                }
            } catch (InputMismatchException e) {
                // 捕获输入不匹配异常（例如，用户未输入double值）
                System.out.println("输入不匹配异常：" + e.getMessage());
                reader.nextLine(); // 清除输入缓冲区
                System.out.println("请重新输入正确的数值。");
            }
        }
	 	
	 	//显示
	 	while(true){
	 		System.out.println("选择显示方式:");
		 	System.out.println("1.数学成绩升序排序");
		 	System.out.println("2.计算机成绩升序排序");
			int choice = reader.nextInt();
			displayInOrder(studentsArray,choice);
			System.out.print("输入任意字符（串）继续查看 退出请输入exit：");
				String input = reader.next();
	            if ("exit".equalsIgnoreCase(input)) {
	                break;
	            }	
	        System.out.println();
	 	}

	 	reader.close();
	}

	private static void displayInOrder(ArrayList<Student> studentsArray, int choice) {
		if(choice == 1)// 按照数学成绩升序排序
	        Collections.sort(studentsArray, new Comparator<Student>() {
	            public int compare(Student student1, Student student2) {
	                return Double.compare(student1.getMathScore(), student2.getMathScore());
	            }
	        });
		else // 按照计算机成绩升序排序
			Collections.sort(studentsArray, new Comparator<Student>() {
	            public int compare(Student student1, Student student2) {
	                return Double.compare(student1.getComputerScore(), student2.getComputerScore());
	            }
	        });
			
        // 打印学生信息
        System.out.println("按照成绩升序排序后的学生信息：");
        for (Student student : studentsArray) {
            student.print();
        }
		
	}

}