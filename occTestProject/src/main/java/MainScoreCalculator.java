package occTestProject;

import java.io.File;
import java.io.IOException;

import occTestProject.impl.IndexNameScorerImpl;
import occTestProject.impl.TextFileReader;

/*
 * This is the main program to run
 * This program can find the scores of the given file based on the first name and current algorithm
 * Used factory design pattern to make the program loose coupling and easy to modify
 * 
 * */
public class MainScoreCalculator {
	
	public static int getFileScores(String file) throws IOException {
		//FileScoresCalculator calculates the total score of the given file
		//This can be changes when the calculating algorithm changes
		FileScoresCalculator scalculator = new FileScoresCalculator(new TextFileReader(), new IndexNameScorerImpl());
		int score =  scalculator.getFileScore(file);
		return score;
	}
	public static void main(String[] args) throws IOException {
		if (args.length == 0 || !(new File(args[0]).exists()))  {
			System.err.println("Please provide file name as argument");
		} else {
			int score = getFileScores(args[0]);
			System.out.println("The Score for the given file is " + score);
		}
	}
}



