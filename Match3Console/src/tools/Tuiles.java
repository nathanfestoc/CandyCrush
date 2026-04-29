/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

/**
 *
 * @author nfestoc
 */
public class Tuiles {
    private int type;
    private Coordonnés position;

    public int getType() {
        return type;
    }

    public Coordonnés getPosition() {
        return position;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setPosition(Coordonnés position) {
        this.position = position;
    }
    public boolean equals(int tuiles){
        if(this.type == tuiles){
            return true;
        }else{
            return false;
        }
    }
}
