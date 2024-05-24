package hw3_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//��main�����У��Ӽ�����������ӡ���������ֻ������۸���
		Scanner scanner = new Scanner(System.in);
		
		UnitPrice tv = new Television(1000.0); // ���ӵ���
        UnitPrice computer = new Computer(800.0); // ���������
        UnitPrice phone = new Phone(500.0); // �ֻ�����
        
		// �������۸���
        System.out.print("��������ӡ���������ֻ����۸���,�ÿո����: ");
        int tvQuantity = scanner.nextInt();
        int computerQuantity = scanner.nextInt();
        int phoneQuantity = scanner.nextInt();
        
      //����get�������Էֱ�õ��̵������Ʒ�ĵ��ۣ��ٵõ���Ʒ�������۶�
        double total = get(tv, tvQuantity) + get(computer, computerQuantity) + get(phone, phoneQuantity);
		
        System.out.println("��Ʒ�������۶�Ϊ: " + total + " Ԫ");
        scanner.close();
	}
	
	public static double get(UnitPrice u, int quantity) {
        double unitPrice = u.unitprice();
        return unitPrice * quantity;
    }
}
