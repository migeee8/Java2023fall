package lab4;

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		try 
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//���������ַ�������
			System.out.println("�������һ���ļ���·�����ļ�����");
			String firstPath = reader.readLine();
			System.out.println("������ڶ����ļ���·�����ļ�����");
			String secondPath = reader.readLine();
			
			FileWriter firstFileWriter = new FileWriter(firstPath);//��һ���ļ�д����ַ������
			System.out.println("��һ���ļ����ѧ������������ѧ�ɼ��ͼ�����ɼ�������֮���ÿո����");
			String stuInfo1;
			while(!(stuInfo1 = reader.readLine()).equalsIgnoreCase("finish")) {
				firstFileWriter.write(stuInfo1);
				firstFileWriter.write('\r');
				firstFileWriter.write('\n');//����
			}
			firstFileWriter.close();
			
			BufferedReader firstFileReader = new BufferedReader(new FileReader(firstPath));//��һ���ļ��Ķ����ַ�������
			FileWriter secondFileWriter = new FileWriter(secondPath);//�ڶ����ļ�д����ַ������
			String line;
			while((line = firstFileReader.readLine())!= null)//���ж�ȡ
			{
				String[] stuInfo2 = line.split(" ");//�м�ָ�
				if(stuInfo2.length > 0 && stuInfo2[0].startsWith("��"))
				{
					secondFileWriter.write(line);
					secondFileWriter.write('\r');
					secondFileWriter.write('\n');
				}
			}
			System.out.println("��һ���ļ������ŵ�ѧ����Ϣ�Ѿ�����ڵڶ����ļ���");
			secondFileWriter.close();
			firstFileReader.close();
			
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
