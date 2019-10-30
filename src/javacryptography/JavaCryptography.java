/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacryptography;
import java.util.Scanner;

/**
 *
 * @author SJHS-DHuynh
 */
public class JavaCryptography {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String msg1;
        char a;
        char b;
        String msg2;
        char encrypt[] = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
        char decrypt[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String encodemsg = "";
        String decodemsg = "";
        
        System.out.println("Enter Your Message That You Want To Encrypt: ");
        msg1 = input.nextLine().toLowerCase();
        
        for(int i = 0; i < msg1.length(); i++)
        {
            a = msg1.charAt(i);
            for(int r = 0; r < decrypt.length; r++)
            {
                if(a == decrypt[r])
                {
                    encodemsg = encodemsg + encrypt[r];
                }
            }
        }
        System.out.println("Your Encoded Msg: " + encodemsg);
        
        System.out.println("Enter Your Message That You Want To Decrypt");
        msg2 = input.nextLine().toLowerCase();
        
        for(int i = 0; i < msg2.length(); i++)
        {
            b = msg2.charAt(i);
            for(int r = 0; r < encrypt.length; r++)
            {
                if(b == encrypt[r])
                {
                   decodemsg = decodemsg + decrypt[r];
                }
            }
        }
        System.out.println("Your Decoded Msg: " + decodemsg);
    }
    
}
