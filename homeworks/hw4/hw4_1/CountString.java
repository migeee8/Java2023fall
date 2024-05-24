/* 编写一个类，该类的功能是可以根据给定的字符串和子串计算出字符串中包含多少个子串。
 * 字符串中的内容是英文单词、英文字符和标点符号，字符串中单词之间有空格
 * 要求：对字符串分词时使用String类的split方法。*/
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
	     
	     System.out.println("在字符串中共有 " + count + " 个子串 \"" + substring + "\"。");
	}
}

public class CountString
{
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