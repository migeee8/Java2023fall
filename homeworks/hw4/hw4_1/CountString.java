/* ��дһ���࣬����Ĺ����ǿ��Ը��ݸ������ַ������Ӵ�������ַ����а������ٸ��Ӵ���
 * �ַ����е�������Ӣ�ĵ��ʡ�Ӣ���ַ��ͱ����ţ��ַ����е���֮���пո�
 * Ҫ�󣺶��ַ����ִ�ʱʹ��String���split������*/
package hw4_1;

import java.util.Scanner;



class CountSubString
{
	void countSubString(String s, String substring)
	{
	     String[] words = s.split("\\b\\s*\\b");
	     
	     int count = 0;
	     for(String word: words) {
	    	 if(word.equals(substring))
	    		 count++;
	     }
	     
	     System.out.println("���ַ����й��� " + count + " ���Ӵ� \"" + substring + "\"��");
	}
}

public class CountString
{
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