package sonar;

public class Enemy implements Character
{   private float health = 100;
    private int lives = 1;
    public Enemy(){ // constructor
        System.out.println("constructed");
    }
    public Enemy(int i){ // constructor with one parameter
        lives = i;
    }

    public void ReduceHealth(int damage) 
    {
     
        health -= damage;
    }
    

    public void SetHealth(float health)
    {
        this.health = health;
    }

    public float GetHealth()
    {   // getting health when variables are private then we use such methods
        return health;
    }

    public float GetLives()
    {   // getting lives when variables are private then we use such methods
        return lives;
    }
}

