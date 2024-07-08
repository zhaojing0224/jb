package jb.ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ch0504 {

	public static void main(String[] args) {

		// 文件路径
		String filePath = "C:\\Users\\ztomi\\OneDrive\\桌面\\test.log";

		// 文件路径
		String outputFilePath = "C:\\Users\\ztomi\\OneDrive\\桌面\\output.log";

		// 创建 FileReader 对象
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		// 创建 FileWriter 对象
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try {
			fileReader = new FileReader(filePath);
			// 创建 BufferedReader 对象
			bufferedReader = new BufferedReader(fileReader);

			fileWriter = new FileWriter(outputFilePath);
			// 创建 BufferedWriter 对象
			bufferedWriter = new BufferedWriter(fileWriter);

			String line;
			// 逐行读取文件内容
			while ((line = bufferedReader.readLine()) != null) {
				// 打印每行内容
				if (line.contains("loginId")) {
					System.out.println(line);
					 // 写入内容
		            bufferedWriter.write(line);
		            bufferedWriter.newLine(); // 写入一个新行
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭 BufferedReader 和 FileReader
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			 // 关闭 BufferedWriter 和 FileWriter
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
		}

	}

}
