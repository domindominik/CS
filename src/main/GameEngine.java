package main;

import java.util.List;
import java.util.Random;

public class GameEngine
{
    private List<Weapon> weaponList;
    private Player player;
    private Opponent opponent;
    private int[] distance = new int[]{5, 10, 15};

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
            player.setMoney(player.getMoney() - weaponList.get(index).getPrice());
        }
        else
        {
            player.setWeapon(weaponList.get(0));
        }
    }

    public int distance()
    {
        Random random = new Random();
        return distance[random.nextInt((3))];
    }

    public void shot(int distance)
    {
        opponent.setPointsLife(100);

        for (int i = 0; i < player.getWeapon().getShotsQuantity(); i++)
        {
            Random random = new Random();
            int hit = random.nextInt((2));
            System.out.println(hit);
            if (hit == 1)
            {
                opponent.setPointsLife(opponent.getPointsLife() - player.getWeapon().getDamage());
                player.setMoney(player.getMoney() + player.getWeapon().getDamage() * 10);
            }
            if (opponent.getPointsLife() < 1)
            {
                break;
            }
        }
        player.setRound(player.getRound() + 1);

        System.out.println("Opponent points: " + opponent.getPointsLife());
    }

    /*public void shot(int distance)
    {
        while (player.getWeapon().getShotsQuantity() > 0)
        {
            opponent.setPointsLife(100);
            Random random = new Random();
            int hit = random.nextInt((2));
            System.out.println(hit);
            if (hit == 1)
            {
                opponent.setPointsLife(opponent.getPointsLife() - player.getWeapon().getDamage());
                player.setMoney(player.getMoney() + player.getWeapon().getDamage() * 10);
                player.getWeapon().setShotsQuantity(player.getWeapon().getShotsQuantity() - 1);
            }
            else
            {
                player.getWeapon().setShotsQuantity(player.getWeapon().getShotsQuantity() - 1);
            }
        }
        player.setRound(player.getRound() + 1);
    }*/


}
