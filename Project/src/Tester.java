//Author: Hadar Rozenberg 
//Date Created: 1/5/2018
//Last Modified: 1/7/2018

//---Class Description---
//Runs the program

public class Tester {
	public static void main(String[] args) {
		Database db = new Database();
		
		//test case: selling nothing
		db.findBest(0);
		//test case: selling only 1 unit
		db.findBest(1);
		//test case: selling medium amounts of units
		db.findBest(20);
		db.findBest(25);
		db.findBest(30);
		//test case: selling large amounts of units
		db.findBest(50);
		db.findBest(45);
		db.findBest(40);
		//test case: selling all units
		db.findBest(55);
		//test case: selling more units than needed 
		db.findBest(60);
	}
	
}
