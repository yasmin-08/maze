import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Animal
{
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        move(4);
        hitEdge();
        // Add your action code here.
    }
    public void hitEdge(){
        if(getX()>=590 || getX()>=590 || getX()<=10 || getY()<=10){
            turn(40); 
        }
        
    }
}
