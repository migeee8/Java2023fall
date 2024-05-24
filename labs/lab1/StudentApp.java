import java.util.*;

public class StudentApp{
	public static void main(String args[]){
	 	Scanner reader = new Scanner(System.in);
	 	ArrayList<Student> studentsArray = new ArrayList<>();

	 	//����ѧ����Ϣ����������
	 	while (true) {
            try {
                System.out.print("������ѧ��ѧ�ţ�");
                String id = reader.next();
                System.out.print("ѧ��������");
                String name = reader.next();
                System.out.print("��ѧ�ɼ���");
                double mathScore = reader.nextDouble();
                System.out.print("������ɼ���");
                double computerScore = reader.nextDouble();
                System.out.print("ѧ�����ͣ����������о�������");
                String studentType = reader.next();

                if ("������".equalsIgnoreCase(studentType)) {
                    Student student = new Student(id, name, mathScore, computerScore);
                    studentsArray.add(student);
                } else if ("�о���".equalsIgnoreCase(studentType)) {
                    System.out.print("��ʦ������");
                    String tutor = reader.next();
                    System.out.print("�о�����");
                    String direction = reader.next();
                    PostGraduate postGraduate = new PostGraduate(id, name, mathScore, computerScore, tutor, direction);
                    studentsArray.add(postGraduate);
                }

                System.out.print("���������ַ��������������ѧ�� ������������done��");
                String input = reader.next();
                if ("done".equalsIgnoreCase(input)) {
                    break;
                }
            } catch (InputMismatchException e) {
                // �������벻ƥ���쳣�����磬�û�δ����doubleֵ��
                System.out.println("���벻ƥ���쳣��" + e.getMessage());
                reader.nextLine(); // ������뻺����
                System.out.println("������������ȷ����ֵ��");
            }
        }
	 	
	 	//��ʾ
	 	while(true){
	 		System.out.println("ѡ����ʾ��ʽ:");
		 	System.out.println("1.��ѧ�ɼ���������");
		 	System.out.println("2.������ɼ���������");
			int choice = reader.nextInt();
			displayInOrder(studentsArray,choice);
			System.out.print("���������ַ������������鿴 �˳�������exit��");
				String input = reader.next();
	            if ("exit".equalsIgnoreCase(input)) {
	                break;
	            }	
	        System.out.println();
	 	}

	 	reader.close();
	}

	private static void displayInOrder(ArrayList<Student> studentsArray, int choice) {
		if(choice == 1)// ������ѧ�ɼ���������
	        Collections.sort(studentsArray, new Comparator<Student>() {
	            public int compare(Student student1, Student student2) {
	                return Double.compare(student1.getMathScore(), student2.getMathScore());
	            }
	        });
		else // ���ռ�����ɼ���������
			Collections.sort(studentsArray, new Comparator<Student>() {
	            public int compare(Student student1, Student student2) {
	                return Double.compare(student1.getComputerScore(), student2.getComputerScore());
	            }
	        });
			
        // ��ӡѧ����Ϣ
        System.out.println("���ճɼ�����������ѧ����Ϣ��");
        for (Student student : studentsArray) {
            student.print();
        }
		
	}

}