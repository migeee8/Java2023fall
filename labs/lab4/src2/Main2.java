package lab4;

import java.io.*;


public class Main2 {
	public static void main(String args[])
	{
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//键盘输入字符缓冲流
			System.out.println("请输入要处理的文件名:");
			String filePath = reader.readLine();
			System.out.println("1.本程序的任务是：" + filePath + " 中的姓名“李善”改为“王山”。");
			System.out.println("2.在 " + filePath + "中原有信息之后继续添加学生信息。");
			
			RandomAccessFile raf = new RandomAccessFile(filePath,"rw");
			long pointer = 0;
			String line = "";
			while((line = raf.readLine()) != null) {
				byte[] stu = line.getBytes("iso-8859-1");
				String stuInfo = new String(stu);
				
				if(stuInfo.startsWith("李善")) {
					raf.seek(pointer);
					raf.write(("王山"+ stuInfo.substring("李善".length(),stuInfo.length())).getBytes());
					break;
				}
				pointer = raf.getFilePointer();
			}
			System.out.println(filePath + "中的姓名“李善”已经改为“王山”，请查阅！");
			
			raf.seek(raf.length());
			System.out.println("请继续向文件" + filePath + "中添加新的学生信息，以finish结束。");
			String stuInfo;
			while(!"finish".equals(stuInfo = reader.readLine()))
			{
				raf.write(stuInfo.getBytes());
				raf.write('\r');
				raf.write('\n');
				raf.seek(raf.length());
			}
			System.out.println("已完成。");
			raf.close();
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}