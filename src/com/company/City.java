package com.company;

import java.util.Scanner;

public class City {
    Scanner sc = new Scanner(System.in);
    public City(Hero hero){
        boolean status=true;
        int pilih;
        while (status){
            System.out.println("Dikota \n 1. Inn \n 2. Tokopedia \n 3. Dungeon");
            pilih= sc.nextInt();
            switch (pilih){
                case 1:
                    if (hero.getMoney()<=10){
                        System.out.println("Uang tidak cukup");
                    } else {
                        hero.setMoney(hero.getMoney()-10);
                        System.out.println("Tidur yang nyenyak");
                    }
                    break;
                case 3:
                    status=false;
                    Dungeon dungeon = new Dungeon(hero);
                    break;

            }
        }
    }
}
