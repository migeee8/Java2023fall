package lab4;

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		try 
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//键盘输入字符缓冲流
			System.out.println("请输入第一个文件的路径和文件名：");
			String firstPath = reader.readLine();
			System.out.println("请输入第二个文件的路径和文件名：");
			String secondPath = reader.readLine();
			
			FileWriter firstFileWriter = new FileWriter(firstPath);//第一个文件写入的字符输出流
			System.out.println("第一个文件存放学生的姓名、数学成绩和计算机成绩，各项之间用空格隔开");
			String stuInfo1;
			while(!(stuInfo1 = reader.readLine()).equalsIgnoreCase("finish")) {
				firstFileWriter.write(stuInfo1);
				firstFileWriter.write('\r');
				firstFileWriter.write('\n');//换行
			}
			firstFileWriter.close();
			
			BufferedReader firstFileReader = new BufferedReader(new FileReader(firstPath));//第一个文件的读入字符缓冲流
			FileWriter secondFileWriter = new FileWriter(secondPath);//第二个文件写入的字符输出流
			String line;
			while((line = firstFileReader.readLine())!= null)//按行读取
			{
				String[] stuInfo2 = line.split(" ");//行间分割
				if(stuInfo2.length > 0 && stuInfo2[0].startsWith("张"))
				{
					secondFileWriter.write(line);
					secondFileWriter.write('\r');
					secondFileWriter.write('\n');
				}
			}
			System.out.println("第一个文件中姓张的学生信息已经存放在第二个文件。");
			secondFileWriter.close();
			firstFileReader.close();
			
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
