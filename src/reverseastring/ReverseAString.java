/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseastring;

/**
 *
 * @author yuktisarwadia
 */
public class ReverseAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String forwardString = "Hello I have to reverse this!";
        
        StringBuilder sb = new StringBuilder();
        sb.append(forwardString);
        
        String reverseString = sb.reverse().toString();
        
        System.out.println("Forward String is: " +forwardString);
        System.out.println("Reverse String is: " +reverseString);
        
    }
    
}
