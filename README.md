# OCCTest
OCC Test
Implement a Java Maven project to calculate the score for a list of names based on the following rules:
  1. The full path to the names file will be specified as a command-line argument.
  2. To score a name, sum the alphabetical value of each letter (A=1, B=2, C=3, etc...) and multiply the sum by the name’s position in the list (1-based).


To handle later requirement changes:  
  The Factory Design pattern is used. 

1. If the algorithms for calculating each name are changed, the NameScorer interface should be implemented based on later demands. 
2. fileReader is implemented to be able to handle both local .txt file and URL file. 
3. fileReader is implemented to be able to handle the condition when the name is the full name. Name "Amy Smith" is considered "AmySmith" when calculating the score. 

Junit5 is used for unit testing. 


This is Maven project. To run

1. download the project, import into eclipse. 
2. Run the MainScoreCalculator.java with argument either be the directory of a valid .txt file or a URL.
