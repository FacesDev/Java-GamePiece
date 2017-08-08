package com.company;
import java.util.*;
/**
 * Created by solderedmachd on 7/18/17.
 */
public class GamePiece {
    int positionX;
    int positionY;
    boolean isFrozen;
    String name;
    String color;
    Random randomNumber = new Random();

    public GamePiece(){
        positionX = 0;
        positionY = 0;
        isFrozen = false;
    }



    public int getPositionX() {
        System.out.println("PositionX: " + positionX);
        return positionX;
    }

    public int getPositionY() {
        System.out.println("PositionY: " + positionY);
        return positionY;
    }

    public boolean getisFrozen() {
        System.out.println("You are currently Frozen: " + isFrozen);
        return isFrozen;
    }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        System.out.println("Color: " + color);
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public void Move(){
        if(isFrozen){
            System.out.println("YOU FROZE UP");
        }else {
            this.positionY = randomNumber.nextInt(100);
            this.positionX = randomNumber.nextInt(100);
        }
    }

    public void Freeze(){
        isFrozen = true;
    }

    public void unFreeze(){
        isFrozen = false;
    }

}
