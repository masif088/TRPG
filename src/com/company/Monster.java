package com.company;

public class Monster {
    int hp, atk;

    public Monster(int hp, int atk) {
        this.hp = hp;
        this.atk = atk;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
    public void attack (Hero monster){
        monster.setHp(monster.getHp()-atk);
    }
}
