package jp.ac.uryukyu.ie.e245737;


public class Enemy extends LivingThing {
    public Enemy(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
        

    @Override
    public void wounded(int damage){
        
        if (isDead() == false) {           
            setHitPoint(getHitPoint() - damage);
            if (getHitPoint() <= 0) {
                setDead(true);
                System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}
}