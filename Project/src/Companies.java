//Author: Hadar Rozenberg 
//Date Created: 1/6/2018
//Last Modified: 1/7/2018

//---Class Description---
//Class for 'Companies', a structure to hold a company's name, amount they want to buy and price they will be paying

public class Companies {
	int quant, prc; //ints holding quantity to be bought and price
	String name; //string containing name of company


	Companies(int q, int p, String n) { //declaration 
		quant = q;
		prc = p;
		name = n;
	}
	
	Companies subtract(Companies f, Companies s) {
		Companies temp = new Companies(0,0,"");
		temp.quant=f.quant-s.quant;
		temp.prc=f.prc-s.prc;
		temp.name=f.name+s.name;
		return temp;
	}
	
	void printCompany(){
		System.out.print(name+ " amount: "+quant+" price: "+prc);
	}
}

