package day11PracticeProblem;
public interface StockAccountInterface {
	
	double valueOf();

	void buy(int amount, String symbol);
	
	void sell(int amount, String symbol);
	
	void printReport();

}
