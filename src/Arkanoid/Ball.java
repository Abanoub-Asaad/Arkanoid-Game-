
package Arkanoid;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Ball
{
    
    Image ballImage = new Image("Resources/Images/Ball.png",30,30,false,false);
    ImageView ball_iv = new ImageView(ballImage); 

    double Height = 48;
    double Width  = 50;
    double stepX  =  1;
    double stepY  = -1;
    double speed  =  5;
    
    public double getHeight()
    {
        return Height ; 
    }
    
    public void setHeight(double height)
    { 
        Height = height ; 
    }
    public double getWidth()
    {
        return Width ; 
    }
    
    public void setWidth(double width)
    {
        Width = width ; 
    }
    
    public double getX()
    {
        return ball_iv.getX() ;
    }
    public void setX(double x)
    {
        ball_iv.setX(x);
    }
    public double getY() 
    {
        return ball_iv.getY();
    }

    public void setY(double y)
    {
        ball_iv.setY(y);
    }
    
    public double getStepX()
    {
        return  stepX ; 
    }
    
    public void setStepX(double stepX)
    {
        this.stepX=stepX;
    }
    public double getStepY() 
    {
        return stepY;
    }

    public void setStepY(double stepY)
    {
        this.stepY = stepY;
    }
    
    public double getSpeed()
    {
        return speed ; 
    }
    
    public void setSpeed(double speed)
    {
        this.speed = speed  ;
    }
}
