import java.util.*;
class Uppercase
{ 
    public static void main(String args[]){
        
    String og = "hello";
       String s = touppercase(og, 0);
       
       System.out.println(og+ "\n");
       System.out.println(s);
    }
    
    private static String touppercase(String input, int index)
    {
         if (index < 0 || index >= input.length()) {
            return input;
        }
        
        StringBuilder a = new StringBuilder(input);
        
        char t = a.charAt(index);
        char r = Character.toUpperCase(t);
        
        a.setCharAt(index, r);
        
        return a.toString();
        
    }
}