package hw4_2;

import java.util.Scanner;
import java.util.StringTokenizer;


class CountSubString
{
	void countSubString(String s, String substring)
	{
		s = s.replaceAll("\\p{Punct}", " ");//�Ƚ��������滻Ϊ�ո�
	     StringTokenizer tokenizer = new StringTokenizer(s);
	     
	     int count = 0;
	     while(tokenizer.hasMoreTokens()) {
	    	 String word = tokenizer.nextToken();
	    	 System.out.println(word);
	    	 if(word.equals(substring))
	    	 {
	    		 count++;
	    	 }
	     }
	     
	     System.out.println("���ַ����й��� " + count + " ���Ӵ� \"" + substring + "\"��");
	}
}

public class CountString2 {
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
