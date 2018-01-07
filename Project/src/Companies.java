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
	
	Companies subtract(Companies f, Companies s) { //returns a company that is the difference between to companies. Notice that the resultant 'name' is actually the sum. This should only be used by database
		Companies temp = new Companies(0,0,"");
		temp.quant=f.quant-s.quant;
		temp.prc=f.prc-s.prc;
		temp.name=f.name+s.name;
		return temp;
	}
	
	void printCompany(){ //prints company in a very straight forward way. This is mainly for debugging.
		System.out.print(name+ " amount: "+quant+" price: "+prc);
	}
	
	void specialPrintCompany(){//prints companies in a way that specifically fits my solution 
		String sol = "";
		for(int x=0; x<10; x++) {
			char c = (char)(65+x);
			if(!name.contains(Character.toString(c)))
				sol+=c;
		}
		System.out.println("Accept offers from companies: "+sol+", which would sell "+quant+ " units for "+prc);
	}
}

