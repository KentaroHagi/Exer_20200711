package exer_01;

import java.io.*;
import java.util.*;
public class Exer0711_01 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try (BufferedReader reader = new BufferedReader(new FileReader("src/exer_01/sentence.txt"));){
			HashMap<String, Integer> map = new HashMap<>();
			String s;
			while((s = reader.readLine()) != null) {
				s = s.toUpperCase();
				for (int i = 0 ; i < s.length() ; i++) {
					String c = String.valueOf(s.charAt(i));
					if (!c.matches("[A-Z]")) continue;
					int count = (map.get(c) == null) ? 1 : (map.get(c) + 1);
					map.put(c, count);
				}
			}
			for (String c : map.keySet()) {
				System.out.println(c + "‚ÌoŒ»‰ñ”F" + map.get(c) + "‰ñ");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
