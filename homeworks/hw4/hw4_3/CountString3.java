package hw4_3;

import java.util.Scanner;

class CountSubString
{
	void countSubString(String s, String substring) {
        int count = 0;
        int index = 0;

        while ((index = s.indexOf(substring, index)) != -1) //查找子串出现的位置
        {
            count++;
            //  index 向后移动
            index += substring.length();
        }

        System.out.println("在字符串中共有 " + count + " 个子串 \"" + substring + "\"。");
    }
}

public class CountString3 {
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
