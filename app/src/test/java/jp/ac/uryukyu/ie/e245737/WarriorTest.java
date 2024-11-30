package jp.ac.uryukyu.ie.e245737;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    public void testAttackWithWeponSkill() {
        Warrior warrior = new Warrior("デモ戦士", 100, 20); // 攻撃力20
        Enemy enemy = new Enemy("スライムもどき", 100, 10); // HP100

        for (int i = 0; i < 3; i++) {
            int expectedDamage = (int)(20 * 1.5); // 攻撃力20の150%
            warrior.attackWithWeponSkill(enemy);

            int remainingHP = 100 - expectedDamage * (i + 1);
            remainingHP = Math.max(remainingHP, 0); // HPは0未満にならない

            assertEquals(remainingHP, enemy.getHitPoint(), 
                "攻撃後の敵のHPが期待通りではありません");
        }
}
}
