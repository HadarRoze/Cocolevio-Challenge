//Author: Hadar Rozenberg 
//Date Created: 1/6/2018
//Last Modified: 1/7/2018

//---Class Description---
//contains the database given in the definition of the problem, as well as the function to solve the problem

public class Database {
	Companies[] DB = new Companies[10];
	
	Database() { //declaration of the sample data given in the definition of the problem
		DB[0]= new Companies(1,1,"A");
		DB[1]= new Companies(2,5,"B");
		DB[2]= new Companies(3,8,"C");
		DB[3]= new Companies(4,9,"D");
		DB[4]= new Companies(5,10,"E");
		DB[5]= new Companies(6,17,"F");
		DB[6]= new Companies(7,17,"G");
		DB[7]= new Companies(8,20,"H");
		DB[8]= new Companies(9,24,"I");
		DB[9]= new Companies(10,30,"J");
	}
	
	Companies findBestHelper(Companies sol, int inx, int amnt) { //recursive function to find best solution
		//a solution was found
		if(sol.quant<=amnt)
			return sol;
		//unwanted exception 
		if(inx<0)
			return new Companies(0,0,"");
		//find best solution without removing company at current index
		Companies sol1 = findBestHelper(sol, inx-1,amnt);
		//find best solution after removing company at current index
		Companies sol2 = findBestHelper(sol.subtract(sol,DB[inx]),inx-1,amnt);
		//return better solution of the two
		if(sol1.prc>sol2.prc)
			return sol1;
		else
			return sol2;
	}
	
	void findBest(int amnt) { //this function will find the solution to the problem
		//sum of quantities
		int qSum = DB[0].quant+DB[1].quant+DB[2].quant+DB[3].quant+DB[4].quant+DB[5].quant+DB[6].quant+DB[7].quant+DB[8].quant+DB[9].quant;
		//sum of prices
		int pSum = DB[0].prc+DB[1].prc+DB[2].prc+DB[3].prc+DB[4].prc+DB[5].prc+DB[6].prc+DB[7].prc+DB[8].prc+DB[9].prc;
		//companies with sums
		Companies sum = new Companies(qSum, pSum, "");
		findBestHelper(sum,9,amnt).specialPrintCompany();
	}
	
}
