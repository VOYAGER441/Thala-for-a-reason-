 import java.util.*;
 class Thala {
	public static void main(String[] args) {
		int i ,c;
		String name;
		Scanner sc =new Scanner(System.in);
		int j=0;
	while(j!=7){
			c=0;
			System.out.println("Enter any namr for checking, if it's Thala or not : ");
		 name = sc.nextLine();
		
		for ( i = 0; i < name.length(); i++) 
		{
            if (Character.isAlphabetic(name.charAt(i))) {
                
                c++;
            }
        }
		
	if (c==7)
	{
	    System.out.println("THALA FOR A REASON \n ");
	    System.out.println("\t【7】\n");         
	}
	else{
	System.out.println("\nYou are not THALA\n");
	}
	
	j++;
}
	}
 }