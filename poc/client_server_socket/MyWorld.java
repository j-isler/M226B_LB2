import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Jenia Isler  
 * @version 16.01.2021
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        try{
            
        Server.SocketGetJSON();
    }  catch(Exception e){
        e.printStackTrace();
        System.out.println(e);
    }
    }
}


