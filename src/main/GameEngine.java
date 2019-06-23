package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameEngine
{
    private List<Weapon> weaponList;
    private Player player;
    private Opponent opponent;

    public GameEngine(List<Weapon> weaponList, Player player, Opponent opponent)
    {
        this.weaponList = weaponList;
        this.player = player;
        this.opponent = opponent;
    }

    public void setWeapon(int index)
    {
        if (weaponList.get(index).getPrice() <= player.getMoney())
        {
            player.setWeapon(weaponList.get(index));
            player.setMoney((int) (player.getMoney() - weaponList.get(index).getPrice()));
        }
        else
        {
            player.setWeapon(weaponList.get(0));
        }
    }

    public int distance()
    {
        return (int)(Math.random() * 3);
    }

    public void shot(int distance)
    {
        for (int i = 0; i < player.getWeapon().getShotsQuantity(); i++)
        {
            //if((int)(Math.random() * 2) < 1) continue;
            int shot = (int) (Math.random() * 2);
            System.out.println(shot);
            if (shot == 1)
            {
                double damage = player.getWeapon().getDamage();
                int code =  player.getWeapon().getCode();
                opponent.updateLifePoints(damage,distance,code);
                player.updateMoney(damage);
            }
        }
        player.setRound(player.getRound() + 1);

        System.out.println("Opponent points: " + opponent.getPointsLife());
    }

    public static void game()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name player: ");
        String name = scanner.next();

        Opponent opponent = new Opponent();
        List<Weapon> weaponList = new ArrayList<>();
        weaponList.add(new Weapon(0, 7, 0, 10));
        weaponList.add(new Weapon(1, 2, 1000, 45));
        weaponList.add(new Weapon(2, 15, 3000, 10));
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
}
