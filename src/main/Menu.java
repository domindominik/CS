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

        Opponent opponent = new Opponent();
        List<Weapon> weaponList = new ArrayList<>();
        weaponList.add(new Weapon("Gun", 7, 0, 10));
        weaponList.add(new Weapon("Shot Gun", 2, 1000, 45));
        weaponList.add(new Weapon("Machine Gun", 15, 3000, 10));
        Player player = new Player(name, weaponList.get(0));
        GameEngine gameEngine = new  GameEngine(weaponList, player, opponent);


        while (opponent.getPointsLife() > 0)
        {
            player.printInfo();
            int distance = gameEngine.distance();
            System.out.println("Distance: " + distance);

            System.out.println("Chose your weapon: 1. Gun[7]- 0$, 2. Shot gun[2]- 1000$, 3. Machine gun[15]- 3000$");
            int index = scanner.nextInt();
            gameEngine.setWeapon(index - 1);

            player.printInfo();

            opponent.setPointsLife(100);
            gameEngine.shot(distance);
        }
        System.out.println(player.getName() + " You win!");
    }
    public static void main(String[] args)
    {
        game();
    }
}
