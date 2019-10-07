package com.company;

public class Hero {
    int hp,atk,money,maxHp;

    public Hero() {
        hp=10;
        maxHp=hp;
        atk=2;
        money=0;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void attack (Monster monster){
        monster.setHp(monster.getHp()-atk);
    }
}
