package Wintersemester1314;

import java.io.*;
import java.util.*;

public class VocabularyTrainer extends AbstractVocabularyTrainer {

	@Override
	public String readLineFromSystemIn() {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		String line = "";
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
			line = (line == null) ? "" :line;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return line;
	}

	@Override
	public void load(String filename) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		dictionary = new HashMap<String,String>();
		BufferedReader br = null;
		try{
			br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
		}catch(FileNotFoundException e){
			throw new IllegalArgumentException();
		}try{
		String line = "";
		String key = null;
		while((line = br.readLine())!= null){
			if(key == null)
				key = line;
			else{
				dictionary.put(key, line);
				key = null;
			}
		}
		br.close();
		}catch(Exception e)
		{
			e.getMessage();
		}
	}

	@Override
	public String getRandomFirstLanguageWord() {
		// TODO Auto-generated method stub+
		String[] keys = dictionary.keySet().toArray(new String[0]);
		return keys[(int)(Math.random()*keys.length)];
	}

	@Override
	public boolean testTranslation(String lang1, String lang2) {
		// TODO Auto-generated method stub
		String second = dictionary.get(lang1);
		return second.equals(lang2);
	}
	public static void main(String[] args){
		VocabularyTrainer my = new VocabularyTrainer();
		my.runTraining();
	}

}
