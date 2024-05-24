package hw3;

import java.util.Scanner;

public class VolumeCal{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������ѡ��������ͣ�1 - ���壬2 - �����壬3 - Բ����:");
		int choice = scanner.nextInt();
		
		ObjectVolume obj = null;
		
		switch(choice) {
		case 1:
			System.out.println("����������İ뾶:");
			double radius = scanner.nextDouble();
			obj = new Sphere(radius);
			break;
		case 2:
			System.out.println("������������ı߳� :");
			double length = scanner.nextDouble();
			obj = new Cube(length);
			break;
		case 3:
			System.out.println("������Բ����İ뾶�͸߶ȣ��м��ÿո����:");
			double cy_radius = scanner.nextDouble();
			double cy_height = scanner.nextDouble();
			obj = new Cylinder(cy_radius, cy_height);
			break;
		default:
			System.out.println("�������!");
			break;
		}
		
		if(obj != null) {
			double volume = get(obj);
	        System.out.println("���������ǣ�" + volume);
		}
		scanner.close();
	}
	
	public static double get(ObjectVolume obj) {
        return obj.getVolume();
    }
}
