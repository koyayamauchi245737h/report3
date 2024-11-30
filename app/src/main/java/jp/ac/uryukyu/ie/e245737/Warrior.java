package jp.ac.uryukyu.ie.e245737;

public class Warrior extends Hero {

    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     
    @param opponent 攻撃対象
     */
    public void attackWithWeponSkill(LivingThing opponent) {
        if (!isDead()) {
            int damage = (int)(getAttack() * 1.5); // 150%のダメージ
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}

