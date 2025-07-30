package sonar;

public class SuperEnemy implements Character 
{   public int health = 1000;
    public SuperEnemy(){ // constructor
        this.health = 1000;
    }

    public void ReduceHealth(int damage) // over riding
    {
        //super.ReduceHealth(damage);
        health -= damage *2;
    }
}






