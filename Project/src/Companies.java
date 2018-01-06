
public class Companies {
	int quant, prc; //ints holding quantity to be bought and price
	String name; //string containing name of company
	double ratio; //ratio of price per unit


	Companies(int q, int p, String n) { //declaration 
		quant = q;
		prc = p;
		name = n;
		ratio = (double)p/q;
	}
	
}

