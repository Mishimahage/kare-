import greenfoot.*;

/**
 * Write a description of class aho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aho extends Actor
{
    /**
     * Act - do whatever the aho wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {


        // Add your action code here.
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
}



        // Add your action code here.
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(270);
        move(1);
}

        if( Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(1);
        }

    }    
}
