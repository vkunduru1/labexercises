public class triangleOfStars{
	public static void main(String args [])
{
		int i; //declaring i as a int value
		int j; // declaring j as a int value
	for(i=1; i<=6; i++){ //out for loop incrementing i until it is less than or equal to 6.
	for ( j = 1; j<= i; j++ ) { // inner for loop incrementing j until it is less than or equal to 6
		System.out.print( "*" ); //printing stars 
		
	}
	System.out.println(); //making a space between each value
	}


for(i=6; i>=1; i--) { //decrementing i until it is less than 1. 
for ( j = 1; j<= i; j++) { 
 System.out.print(j);
}
 System.out.println(); 

}
}
}