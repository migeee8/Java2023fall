package lab4;

import java.io.*;


public class Main2 {
	public static void main(String args[])
	{
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//���������ַ�������
			System.out.println("������Ҫ������ļ���:");
			String filePath = reader.readLine();
			System.out.println("1.������������ǣ�" + filePath + " �е����������ơ���Ϊ����ɽ����");
			System.out.println("2.�� " + filePath + "��ԭ����Ϣ֮��������ѧ����Ϣ��");
			
			RandomAccessFile raf = new RandomAccessFile(filePath,"rw");
			long pointer = 0;
			String line = "";
			while((line = raf.readLine()) != null) {
				byte[] stu = line.getBytes("iso-8859-1");
				String stuInfo = new String(stu);
				
				if(stuInfo.startsWith("����")) {
					raf.seek(pointer);
					raf.write(("��ɽ"+ stuInfo.substring("����".length(),stuInfo.length())).getBytes());
					break;
				}
				pointer = raf.getFilePointer();
			}
			System.out.println(filePath + "�е����������ơ��Ѿ���Ϊ����ɽ��������ģ�");
			
			raf.seek(raf.length());
			System.out.println("��������ļ�" + filePath + "������µ�ѧ����Ϣ����finish������");
			String stuInfo;
			while(!"finish".equals(stuInfo = reader.readLine()))
			{
				raf.write(stuInfo.getBytes());
				raf.write('\r');
				raf.write('\n');
				raf.seek(raf.length());
			}
			System.out.println("����ɡ�");
			raf.close();
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}