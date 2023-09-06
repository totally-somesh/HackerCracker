import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        int quoteCount = 0;
        int wordCount = 0;
        boolean flag = true; 
           
        for(int i=0; i<s.length(); i++){
        
        if(s.charAt(i) == ' '){           
                
                      
        }else{
            flag = false;
        }    
            
        }
        if(flag == true){
            
            System.out.println("0");     
        }
              
        if(flag == false){
        String newS = s.trim();
               
        for(char c : newS.toCharArray()){
            
            if((int)c == 39){
                quoteCount++;       
            }            
        }
        
        String [] strArr = newS.split("[\\s\\p{Punct}]+");
        
        System.out.println(strArr.length);
        
        for(String S : strArr){
            
            System.out.println(S);          
        }
        
        }              
    }
}

