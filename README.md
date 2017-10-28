# labexercises
//finding longest string in array
public class Exercise1 {
	public static void main(String[] args) {
		
		String [] stringArray = {"computing", "at ","Goldsmiths", "College",
		"University", "of", "London", "New Cross", "London","SE14 6NW"};
		
		System.out.println(longestStringInArray(stringArray)); // this should print university.
		}
	
		public static String longestStringInArray(String [] a) {
			String max = a[0];
			for (int i=0; i <= a.length-1; i++) 
				if (max.length() <= a[i].length()) {
					max = a[i];
					
					
					
}
			return max;
		

}
}
		

