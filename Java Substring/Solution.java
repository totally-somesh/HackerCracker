import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
    
        char [] chArr = S.toCharArray();
        
        for(int i=start; i<end; i++){

            System.out.print(chArr[i]);          
        }        
    }   
}
