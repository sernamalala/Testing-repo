/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversestring;

import java.util.Scanner;

/**
 *
 * @author serna
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String input = in.nextLine();
        
        input = input.toLowerCase();
        
        
        System.out.println(recursiveStringReverse(input));
    }
    public static String recursiveStringReverse(String input){
    
        if(input.length()== 0){
        return "";}
        
        else{
         
            return input.charAt(input.length()-1) + recursiveStringReverse(input.substring(0,input.length()-1));
            
                    
        }
    }
    
}
