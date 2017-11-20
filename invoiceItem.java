package lab6;

class invoiceItem1{
    //variables
		int id;
		String description;
		int quantity;
		double unitPrice;
		static int counter;
		
 invoiceItem1(int i, String d, int q, double u)
    { //constructors
			id = i;
			description = d;
			quantity = q;
			unitPrice = u;
    }
    //getters
	int getId() {
		return id;
	}
	String getDescription() {
		return description;
	}
	int getQuantity() {
		return quantity;
	}
	double getUnitPrice() { 
		return unitPrice;
	
}
    //setters
	void setQuantity(int quantity) {
		this.quantity = quantity; 
	}
	void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
    //this function returns all objects in an order.
	public String toString() {
		return "invoiceItem[ " + "id = " + id + ", description = " + description + ", quantity = " + quantity + ", unitPrice = " + unitPrice + "]";
	}

}	
//new constructor with set values.
public class invoiceItem {
	public static void main(String[] args) {
	        invoiceItem1 deets =   new invoiceItem1(501, "tax", 5,345);
	        System.out.println(deets.toString());
		}

}
