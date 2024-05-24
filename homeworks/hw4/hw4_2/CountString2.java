package hw4_2;

import java.util.Scanner;
import java.util.StringTokenizer;


class CountSubString
{
	void countSubString(String s, String substring)
	{
		s = s.replaceAll("\\p{Punct}", " ");//先将标点符号替换为空格
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
	     
	     System.out.println("在字符串中共有 " + count + " 个子串 \"" + substring + "\"。");
	}
}

public class CountString2 {
	public static void main(String args[])
	   {
	          Scanner reader=new Scanner(System.in);
	          System.out.println("请输入字符串：");
	          String s=reader.nextLine();
	          System.out.println("请输入你要检索的子串：");
	          String substring=reader.nextLine();
	          CountSubString a=new CountSubString();
	          a.countSubString(s, substring);
	   }
}
