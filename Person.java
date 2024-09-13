import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    public void act()
    {
        // Add your action code here.
        moveAround();
        hitEnemy();
        hitFood();
    }
    public boolean hitHome(){
       if(isTouching(Home.class)){
           return true;
       }
       else{
        return false;
        }
    }
    public boolean hitWall(){
       if(isTouching(Wall.class)){
           return true;
       }
       else{
        return false;
        }
    }
    public void hitEnemy(){
       Actor apple = getOneIntersectingObject(Enemy.class);
       if(apple != null){
           getWorld().removeObject(apple);
           MyWorld.score--;
        }
       
    }
    public void hitFood(){
       Actor food = getOneIntersectingObject(Food.class);
       if(food != null){
           getWorld().removeObject(food);
           MyWorld.score++;
        }
       
    }
    public boolean hitEdge(){
        int getX = getX();
        int getY = getY();
        if(getX <= 30|| getX >=590|| getY <= 35|| getY >= 585  ){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public void moveAround(){
       if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-3);
            if(isTouching(Wall.class)){
                setLocation(getX(), getY()+4);
            }
        }
         if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+3);
            if(isTouching(Wall.class)){
                setLocation(getX(), getY()-4);
            }
        } if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3, getY());
            if(isTouching(Wall.class)){
                setLocation(getX()+4, getY());
            }
        } if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3, getY());
            if(isTouching(Wall.class)){
                setLocation(getX()-4, getY());
            }
        }
    }
}
