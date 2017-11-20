package lab6;

public class Account {

	
	//variables	
	String name;
	int accountNumber;
	double Balance;
	
	//constructors
	 Account(String s){
		this.name = s;
	}
	 Account(String s, int n){
		this.name = s;
		this.accountNumber = n;
	}
	 Account(String s, double b){
		 this.name = s;
		 this.Balance = b;
	 }
	 Account(String s, int n, double b){
		 this.name = s;
		 this.accountNumber = n;
		 this.Balance = b;
	 }
	 //setters
	void setName(String s) {
		return;
	}
	void setAccountNumber(int n) {
		return;
	}
	void setBalance(double b) {
		return;
	}
	//getters
	 String getName(){
         return this.name;
     }

     int getAccountNumber(){
         return this.accountNumber;
     }

     double getBalance(){
         return this.Balance;
     }
     public double deposit(double d){//updates balance
    	 	this.Balance += d;
    	 	return Balance;
    	 
     }
     public double withdrawl(double w) { //allows withdrawl if funds available 
    	 	if(this.Balance >= w) {
    	 		
    	 		this.Balance -= w;
    	 		return this.Balance;
    	 	}else { //if funds are unavailable this message is printed.
    	 			System.out.println("you have insufficient funds :(");
    	 			return this.Balance;
    	 		
    	 	}
     }
     public String toString() { //prints the values in order.
    	 System.out.println("name: "+ this.name + ", accountNumber: " + this.accountNumber + ", balance: " + this.Balance);
         return null; 
     }
     }
