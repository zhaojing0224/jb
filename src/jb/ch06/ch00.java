package jb.ch06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ch00 {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\ztomi\\OneDrive\\桌面\\java io 基本概念.log");
		List<String> list = new ArrayList<>();
		
		try {
			FileInputStream input = new FileInputStream(file);
            InputStreamReader stream = new InputStreamReader(input, StandardCharsets.UTF_8);
            BufferedReader buffer = new BufferedReader(stream);
            
            String line;
            while((line = buffer.readLine()) != null) {
            	if(line.contains("CAB001")) {
            		String[] parts = line.split("\\s+");
            		if (parts.length >= 5) {
            			String firstValue = parts[0];
            			String secondValue = parts[1];
            			String fifthValue = parts[4].substring(parts[4].indexOf("。") + 1);
            			
            			list.add(firstValue + " " + secondValue + " " + fifthValue);
            		}
            	}
            }
            buffer.close();
		}
            catch (IOException e) {
                e.printStackTrace();
            }
            writeFile(list);

}

	private static void writeFile(List<String> list) {
		
		Path outputPath = Paths.get("C:\\Users\\ztomi\\OneDrive\\桌面\\不正ログイン情報.log");
		
		try {
			
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath.toFile()), StandardCharsets.UTF_8));
			
			for (String line : list) {
				writer.write(line + "\n");
			}
			writer.close();
			System.out.println("処理が完了しました。保存場所: " + outputPath);
		} catch (IOException e) {
            e.printStackTrace();
		
	}
		
	}
		
	}
