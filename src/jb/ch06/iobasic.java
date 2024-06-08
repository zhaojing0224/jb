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


public class iobasic {
	
	public static void main(String[] args) {
		
        File file = new File("C:\\Users\\ztomi\\OneDrive\\桌面\\java io 基本概念.log");
        List<String> list = new ArrayList<>();

        try {
            FileInputStream input = new FileInputStream(file);
            InputStreamReader stream = new InputStreamReader(input, StandardCharsets.UTF_8);
            BufferedReader buffer = new BufferedReader(stream);

            String line;
            while ((line = buffer.readLine()) != null) {
                if (line.contains("CAB001")) {
                	//将字符串 line 按照一个或多个空白字符进行拆分，拆分后的各个子字符串存储到字符串数组 parts 中。
                    String[] parts = line.split("\\s+");
                    if (parts.length >= 5) {
                    	
                    	String firstValue = parts[0];
	    				  String secondValue = parts[1];
		    			  String fifthValue = parts[4].substring(
		    					  parts[4].indexOf("。") + 1);
                  
                  list.add(firstValue + " " + secondValue + " " + fifthValue);
                    }
                }
            }
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        writeFile(list);
    }

    public static void writeFile(List<String> list) {
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

//	 public static void main(String[] args) {
//	        
//	        String inputFilePath = "C:\\Users\\ztomi\\OneDrive\\桌面\\java io 基本概念.log";
//
//	        String outputFilePath = LocalDate.now().format(DateTimeFormatter.ISO_DATE) + ".result.log";
//	        String outputFileName = LocalDate.now().format(DateTimeFormatter.ISO_DATE) + ".result.log";
//	        Path outputPath = Paths.get(outputFileName).toAbsolutePath();
//	        System.out.println("Results will be saved to: " + outputPath);
//
//	        try (
//	            BufferedReader reader = Files.newBufferedReader(Paths.get(inputFilePath), StandardCharsets.UTF_8);
//	            BufferedWriter writer = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8)
//	        ) {
//	            String line;
//	            boolean foundAny = false;
//
//	            while ((line = reader.readLine()) != null) {
//	                String[] parts = line.split("\t");
//	                if (parts.length > 3 && "CAB001".equals(parts[1])) {
//	                    String timestamp = parts[0];
//	                    String[] messageParts = parts[3].split("loginId=");
//	                    if (messageParts.length > 1) {
//	                        String loginId = messageParts[1];
//	                        writer.write(timestamp + "," + loginId + "\n");
//	                        foundAny = true;
//	                    }
//	                }
//	            }
//
//	            if (!foundAny) {
//	                System.out.println("No CAB001 error logs found.");
//	            } else {
//	                System.out.println("処理が完了しました。" + outputPath);
//	            }
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	    }
 
    }
