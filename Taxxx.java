
public class Taxxx {
	public static void main(String args[])
	{
	
    double income = 50000; //declaring the variable income as 50000
   
        if (income < 0) { 
        System.out.println("Income can't be less than zero.");
        }else if (income <= 15000) { //income
            income = 0; //amount of tax 
        } else if (income >= 15000) {
            income *= 0.05;
        } else if (income > 30000) {
            income *= 0.1;
        } else if (income > 500000) {
            income *= 0.02;
    }

}
}