/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerdatabasedemo;

import java.util.Scanner;

/**
 *
 * @author montanoa64
 */

public class PlayerDatabaseDemo {

    /**
     * @param args the command line arguments
     */
//    public static void menu()
//    {
//        
//    }
    public static int enterNumPlayer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int num = scan.nextInt();
        return num;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int num = enterNumPlayer();
        PlayerDatabase n = new PlayerDatabase(num);
        
        n.addPlayer();
        n.Dispalylist();
        
    }
    
}
