package org.campus02.analyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Import {
	
	private ArrayList<String> ungerade = new ArrayList<>();
	private ArrayList<String> gerade = new ArrayList<>();
	
	public void importReader() {
		File file = new File("/temp/text.txt");
		
		try (
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			) {
				String line;
				int counter = 1;
				while((line=br.readLine()) != null) {
					if(counter%2==0) {
						gerade.add(line);
						counter++;
					}
					else {
						ungerade.add(line);
						counter++;
					}
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public ArrayList<String> getUngerade() {
		return ungerade;
	}

	public ArrayList<String> getGerade() {
		return gerade;
	}

}
