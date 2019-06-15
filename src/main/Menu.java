package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu
{
    public static void game()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name player: ");
        String name = scanner.next();

        Oponent oponent = new Oponent();
        List<Weapon> weaponList = new ArrayList<>();
        weaponList.add(new Weapon("Gun", 7, 0, 10));
        weaponList.add(new Weapon("Shot Gun", 2, 1000, 45));
        weaponList.add(new Weapon("Machine Gun", 15, 3000, 10));
        My my = new My(name, weaponList.get(0));
        GameEngine gameEngine = new  GameEngine(weaponList, my, oponent);


        while (oponent.getPointsLife() > 0)
        {
            my.printInfo();
            System.out.println("Chose your weapon: 1. Gun, 2. Shot gun, 3. Machine gun");
            int index = scanner.nextInt();
            gameEngine.setWeapon(index);
            my.printInfo();
            System.out.println(gameEngine.distance());
        }
        System.out.println("END");
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);



        game();
    }
}
