/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerdatabasedemo;

/**
 *
 * @author montanoa64
 */
import java.util.Scanner;
public class PlayerDatabase {
    
    private Player [] players;
    private int numPlayers;
    
    public PlayerDatabase(int num)
    {
        
        if(num > 10 || num < 0)
        {
            System.out.println("Only 1-10 players");
        }
        else
        {
            numPlayers = 0;
            players = new Player[num];
        }
        
    }
    
    public void addPlayer()
    {
        
        if(numPlayers < 10)
        {
            
                for(int i = 0; i < numPlayers; i++)
                {
                    String name = readName();
                    int Score = readScore();
                    int Shirt =  readShirt();
                    players[i] = new Player(name, Score, Shirt);
                }
            
        }
       
    }
    
    puclic void addPlayer()
    {
        players[0].
    }
    
    public void Dispalylist()
    {
        for(int i = 0; i < numPlayers; i++)
        {
            System.out.printf("Name: %s  Score: %d  Shirt: %d%n", players[i].getName(), players[i].getScore(), players[i].getShirt());
        }
    }
    
    public String readName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter player's name: ");
        String name = scan.nextLine();
        return name;
    }
    
    public int readScore()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter player's score: ");
        int Score = scan.nextInt();
        return Score;
    }
    
    public int readShirt()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter player's shirt number: ");
        int Shirt = scan.nextInt();
        return Shirt;
    }
    
    public int getArraylenght()
    {
        return numPlayers;
    }
    
    
}
