/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author nfestoc
 */
public class Coordonnées {
    
    private int x;
    private int y;
    
    public Coordonnés(int x,int y){
        this.x=x;
        this.y=y;
     }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public boolean estVoisine(Coordonnés c) {
        boolean str = false;
        if(this.x == c.x | this.y == c.y){
            str = true;    
        }
        return str;
    }
    
}
