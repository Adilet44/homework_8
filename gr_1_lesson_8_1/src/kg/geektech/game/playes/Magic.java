package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {

    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int runer = RPG_Game.random.nextInt(15)+1;
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage()+runer);
        }
        System.out.println(this.getName()+":Mag damage:" + runer);
    }

}
