package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Dungeon {
    Scanner sc = new Scanner(System.in);
    int day,pilih;
    ArrayList<Monster> monsters = new ArrayList<Monster>();

    public Dungeon(Hero hero) {
        monsters.clear();
        monsters.add(new Monster(10,1));
        monsters.add(new Monster(20,5));
        monsters.add(new Monster(30,10));
        monsters.add(new Monster(40,15));
        boolean status=true;
        for (int i = 0; i < monsters.size() ; i++) {
            status=true;
            while (status){
                System.out.println("Pilih");
                System.out.println("1. attack");
                System.out.println("2. items");
                System.out.println("3. run");
                pilih=sc.nextInt();
                switch (pilih){
                    case 1:
                        hero.attack(monsters.get(i));
                        monsters.get(i).attack(hero);
                        System.out.println("darah hero "+hero.getHp());
                        System.out.println("darah mosnter "+monsters.get(i).getHp());
                        break;
                    case 3:
                        status=false;
                        i+=monsters.size();
                        break;

                }
                if (monsters.get(i).getHp()<=0){
                    status=false;
                    break;
                }
                if (hero.getHp()<=0){
                    day+=3;
                    status=false;
                    i+=monsters.size();
                }
            }
        }
        City city = new City(hero);
    }
}
