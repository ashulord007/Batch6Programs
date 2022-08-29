package com.programs.ashutosh;
import java.util.*;

public class frequcenyOfGivenChar
{    
    public static void main(String[] args) {    
    	Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String string = sc.nextLine();
        System.out.println("enter the char");
        char ch = sc.next().charAt(0);
        sc.close();
        int count = 0;    
            
        //The best of both worlds   
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ' && string.charAt(i)== ch)    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
    }    
} 
