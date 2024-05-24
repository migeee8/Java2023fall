package hw3;

import java.util.Scanner;

public class VolumeCal{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数字选择对象类型：1 - 球体，2 - 立方体，3 - 圆柱体:");
		int choice = scanner.nextInt();
		
		ObjectVolume obj = null;
		
		switch(choice) {
		case 1:
			System.out.println("请输入球体的半径:");
			double radius = scanner.nextDouble();
			obj = new Sphere(radius);
			break;
		case 2:
			System.out.println("请输入立方体的边长 :");
			double length = scanner.nextDouble();
			obj = new Cube(length);
			break;
		case 3:
			System.out.println("请输入圆柱体的半径和高度，中间用空格隔开:");
			double cy_radius = scanner.nextDouble();
			double cy_height = scanner.nextDouble();
			obj = new Cylinder(cy_radius, cy_height);
			break;
		default:
			System.out.println("输入错误!");
			break;
		}
		
		if(obj != null) {
			double volume = get(obj);
	        System.out.println("物体的体积是：" + volume);
		}
		scanner.close();
	}
	
	public static double get(ObjectVolume obj) {
        return obj.getVolume();
    }
}
