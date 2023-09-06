import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        boolean flag = true;
        
        if(a.length() != b.length()){
            
            return false;           
        }
        
        char [] aArr = a.toLowerCase().toCharArray();
        char [] bArr = b.toLowerCase().toCharArray();
        int j = 0;
        int i = 0;
        
        while(j<aArr.length && i<bArr.length){
            
            if(bArr[i] == aArr[j]){
                
                aArr[j] = '0';
                i++;
                j=0;               
            }
            else{
                j++;                 
            }           
        }
        
        for(char c : aArr){
                        
            if(c != '0'){
                flag = false;                
            }           
        }
        
        if(flag == true){
            return true;             
        }
        else{
           return false;
        }    
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
