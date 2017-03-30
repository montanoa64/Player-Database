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
public class Player {
    
    private String Name;//this is dope
    private int Score;
    private int Shirt;
    
    public Player()
    {
        Name = "";
        Score = 0;
        Shirt = 0;
    }
    
    public Player(String newName, int newScore, int newShirt)
    {
        this.Name = newName;
        this.Score = newScore;
        this.Shirt = newShirt;
    }
    
    public Player(Player p)
    {
        this.Name = p.getName();
        this.Score = p.getScore();
        this.Shirt = p.getShirt();
    }
    
    public String getName()
    {
        return Name;
    }
    
    public int getScore()
    {
        return Score;
    }
    
    public int getShirt()
    {
        return Shirt;
    }
    
}
