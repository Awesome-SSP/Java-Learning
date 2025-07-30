import sonar.Enemy;
import sonar.SuperEnemy;
import sonar.Character;

public class game {
    public static void main(String [] args)
    {
        // Enemy e1 = new Enemy();
        // e1.lives = 10;

        // Enemy e2 = new Enemy();
        // System.out.println(e1.lives);      
        // System.out.println(e2.lives);  
        
        // e2.ReduceHealth(9);
        // System.out.println(e1.health);      
        // System.out.println(e2.health);  

        // Enemy e3 = new Enemy(7);
        // System.out.println(e3.lives);
        // System.out.println(e3.health);

        // SuperEnemy se = new SuperEnemy();
        // System.out.println(se.lives);
        // System.out.println(se.health);


        Enemy e1 = new Enemy(7);
        System.out.println(e1.GetHealth());
        e1.ReduceHealth(1);
        System.out.println(e1.GetHealth());

        SuperEnemy se = new SuperEnemy();
        System.out.println(se.health);
        se.ReduceHealth(1);
        System.out.println(se.health);

        // Character ch = new Character();

        

    }
}
