package com.revature.game;
import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.lang.*;
import java.util.Scanner;

@SuppressWarnings("unused")
public class GameDriver {
	
	public static void main(String[] args) {
		
		
		String namesPath = "/Users/Bouba/Desktop/Java/CoreJava/names.txt";
		String questionsPath = "/Users/Bouba/Desktop/Java/CoreJava/questions.txt";     	
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> questions = new ArrayList<String>();

		
		try {
			BufferedReader nbr = new BufferedReader(new FileReader(namesPath));
			BufferedReader qbr = new BufferedReader(new FileReader(questionsPath));
			
			String nameLine = nbr.readLine();
			names.add(nameLine);
			String questionLine = qbr.readLine();
			questions.add(questionLine);
			
			//System.out.println("Here are all the names readin: ");
			
			while((nameLine != null) && (nameLine != "")) {
				//System.out.println(nameLine);
				nameLine = nbr.readLine();
				names.add(nameLine);
			}
			
			//System.out.println("Here are all the questions readin: ");
			
			while((questionLine != null) && (questionLine != "")) {
				//System.out.println(questionLine);
				questionLine = qbr.readLine();
				questions.add(questionLine);
				
			}
			
			questions.remove(questions.size()-1);
			names.remove(names.size()-1);
			Collections.shuffle(names);
			Collections.shuffle(questions);
			
			int i = 0;
			
			while(i < questions.size() && i < names.size()) {
					System.out.println(names.get(i));
					System.out.println(questions.get(i));
					i++;
					new Scanner(System.in).nextLine();
				}
			
			
			System.out.println("Game is over. Thank you.");			
			nbr.close();
			qbr.close();
			
		} catch (IOException e) {
			e.printStackTrace();

		}
	
	}

}
