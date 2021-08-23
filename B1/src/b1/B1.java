/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

/**
 *
 * @author LENOVO
 */
public class B1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "    Nguyen tHi hoNg   ";
        String[] arr = s.split(" ");
        String newstring = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 0) {
                String y = arr[i].toLowerCase();
                //char x = Character.toUpperCase(arr[i].charAt(0));
                char x = arr[i].toUpperCase().charAt(0);
                //System.out.println(x);
                //System.out.println(y.length());
                newstring += " "+ x + y.substring(1);
            }

        }
        System.out.println(newstring);
    }

}
