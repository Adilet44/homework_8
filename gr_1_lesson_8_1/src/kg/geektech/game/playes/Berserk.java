package kg.geektech.game.playes;

import kg.geektech.game.general.RPG_Game;

public class  Berserk extends Hero {
    private int savedDamage;
    private int snekDamage ;

    public int getSnekDamage() {
        return snekDamage;
    }

    public void setSnekDamage(int snekDamage) {
        this.snekDamage = snekDamage;
    }

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean lok = RPG_Game.random.nextBoolean();
        if (lok==false) {
            setSnekDamage(snekDamage += boss.getDamage() / 4);
            System.out.println("Bersek Damage: " + snekDamage);
        }else if (lok==true) {
            if (boss.getDefence()==SuperAbility.SAVE_DAMAGE_AND_REVERT){
                snekDamage=0;
                System.out.println("Berserk block");
            }else {
                boss.setHealth(boss.getHealth() - snekDamage);
                System.out.println("Berserk ability: " + snekDamage);
                snekDamage=0;
            }

        }
        }
        private int getSavedDamage(){
        return savedDamage;
        }

        
    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}
