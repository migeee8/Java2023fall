package hw4_3;

import java.util.Scanner;

class CountSubString
{
	void countSubString(String s, String substring) {
        int count = 0;
        int index = 0;

        while ((index = s.indexOf(substring, index)) != -1) //�����Ӵ����ֵ�λ��
        {
            count++;
            //  index ����ƶ�
            index += substring.length();
        }

        System.out.println("���ַ����й��� " + count + " ���Ӵ� \"" + substring + "\"��");
    }
}

public class CountString3 {
	public static void main(String args[])
	   {
	          Scanner reader=new Scanner(System.in);
	          System.out.println("�������ַ�����");
	          String s=reader.nextLine();
	          System.out.println("��������Ҫ�������Ӵ���");
	          String substring=reader.nextLine();
	          CountSubString a=new CountSubString();
	          a.countSubString(s, substring);
	   }
}
