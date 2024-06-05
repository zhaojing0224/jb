package jb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo {

	public static void main(String[] args) {

		// 指定要读取的文本文件路径
		String filePath = "C:\\Users\\ztomi\\OneDrive\\桌面\\doc\\person.txt";

		BufferedReader reader = null;

		List<PersonObj> list = new ArrayList<PersonObj>();

		// 创建一个 BufferedReader 实例以读取文件
		try {
			reader = new BufferedReader(new FileReader(filePath));
			// 用于保存每行的字符串
			String line;

			while ((line = reader.readLine()) != null) {

				String[] parts = line.split(",");
				PersonObj obj = new PersonObj();

				obj.setId(parts[0]);
				obj.setName(parts[1]);
				obj.setAge(Integer.valueOf(parts[2]));
				obj.setAddress(parts[3]);
				list.add(obj);
			}

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		PersonService personService = new PersonService();
		personService.addPerson(list);

	}

}
