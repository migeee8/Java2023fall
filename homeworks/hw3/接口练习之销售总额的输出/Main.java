package hw3_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//在main方法中，从键盘上输入电视、计算机和手机的销售个数
		Scanner scanner = new Scanner(System.in);
		
		UnitPrice tv = new Television(1000.0); // 电视单价
        UnitPrice computer = new Computer(800.0); // 计算机单价
        UnitPrice phone = new Phone(500.0); // 手机单价
        
		// 输入销售个数
        System.out.print("请输入电视、计算机、手机销售个数,用空格隔开: ");
        int tvQuantity = scanner.nextInt();
        int computerQuantity = scanner.nextInt();
        int phoneQuantity = scanner.nextInt();
        
      //调用get方法可以分别得到商店各个商品的单价，再得到商品的总销售额
        double total = get(tv, tvQuantity) + get(computer, computerQuantity) + get(phone, phoneQuantity);
		
        System.out.println("商品的总销售额为: " + total + " 元");
        scanner.close();
	}
	
	public static double get(UnitPrice u, int quantity) {
        double unitPrice = u.unitprice();
        return unitPrice * quantity;
    }
}
