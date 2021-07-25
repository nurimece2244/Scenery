/**
 * This program draws a scenery of buildings and trees 
 * according to the information in the text file provided.
 * @author Nur Imece - 041601003
 * @since 15.8.2020
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Nur_imece {
	public static void main(String[] args) throws FileNotFoundException {

		 String filename = "src/data5.txt"; // line 1: input filename
		 Building[] buildings = new Building[100]; // lines 2,3: scene elements will be stored in arrays
		 Tree[] trees = new Tree[100];
		 loadData(filename, buildings, trees); // line 4: load scene elements from input file
		 
		plotScene(buildings, trees); // line 5: plot scene elements
		}
	
	/**
	 * This method for drawing buildings and trees with for each loop
	 * @param buildings is a array for keep the buildings value
	 * @param trees is a array for keep the trees value
	 */
	private static void plotScene(Building[] buildings, Tree[] trees) {
		for(Building building : buildings) { 
			if(building != null) { // if building is not equal null
			building.drawbuilding();  // call the drawbuilding method in Building class
			}
		}
		
		for( Tree tree: trees) {
			if(tree != null) { // if tree is not equal null
			tree.drawTree(); // call the drawTree method in Tree class
			}
		}
		
	}
	
	/**
	 * 
	 * @param filename is a file to be read 
	 * @param buildings is a array to load with Building data
	 * @param trees is a array to load with Tree data
	 */

	private static void loadData(String filename, Building[] buildings, Tree[] trees) {

		File file = new File(filename);
		Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(filename + ": Input file can not be found!\nExiting program...");
			System.exit(1);
		}
		int lineCounter = 0; // counter for file
		int treeCounter= 0; // counter for tree array
		int buildingCounter=0; // counter for building array
		String line[]= new String[2000]; // keep the value as a string in the file
		String building = "Building"; 
		String tree = "Tree";
		while(input.hasNext() ) {
			line[lineCounter] = input.nextLine(); // keep value a current line in the file
			
			String[] tokens = line[lineCounter].split(";"); // separate file with semicolon
		
			if (tokens[0].equals(building)) { // if first element is equal to building
			// take value and convert to true type for building class
	
			buildings[buildingCounter] = new Building(Integer.parseInt(tokens[1]),Double.parseDouble(tokens[2]),Double.parseDouble(tokens[3]),tokens[4]) ;
			
			buildingCounter++; // increase the building array counter
				
			}
			else if (tokens[0].equals(tree)) { //  if first element is equal to tree
				// take value and convert to true type for tree class
				trees[treeCounter] = new Tree(Double.parseDouble(tokens[1]));
				treeCounter++; // increase the tree array counter
				
			}
			lineCounter++; // increase the line array counter
		
		}
		
	}

	
}
