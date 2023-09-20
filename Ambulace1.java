import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ambulace1 extends Actor
{
    int score = 0;

    public void act()
    {
        getWorld().showText("Score : " + score, 70,30);
        checkKey();
        end();
        addscore();
    }

    public void checkKey(){
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-2);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+2);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-2, getY());
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+2, getY());
        }
    }

    public void end(){
        if(isTouching(MobilBiru.class)||isTouching(MobilHijau.class)){
            getWorld().showText("GAME OVER \n score : " + score, 300,300);
            Greenfoot.stop();
        }
    }

    public void addscore(){
        if(isTouching(Koin.class)){
        score = score + 50 ;
        removeTouching(Koin.class);
        }
    }
}

