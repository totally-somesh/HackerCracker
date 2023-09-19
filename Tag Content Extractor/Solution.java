import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
        
		int testCases = Integer.parseInt(in.nextLine());
        
		while(testCases-- >0){
			String line = in.nextLine();
			
          	//Write your code here
			
            boolean matchFound = false;
            
            Pattern pat = Pattern.compile("<(.+)>([^<]+)</\\1>"); 
            
            Matcher mat = pat.matcher(line);
            
            while(mat.find()){
                
                System.out.println(mat.group(2));
                
                matchFound = true;          
            }//end of inner while loop         
            
            if(!matchFound){
                    
                System.out.println("None");             
            }//end of if statement    
		}//end of outer while loop
        
        in.close();
	}//end of main method
}//end of class



