package main;

import java.util.List;
import java.util.Random;

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
        return (int)(Math.random()*2);
    }

    public void shot(int distance)
    {
        for (int i = 0; i < player.getWeapon().getShotsQuantity(); i++)
        {
            if((int)(Math.random() * 2) < 1) continue;
            double damage = player.getWeapon().getDamage();
            int code =  player.getWeapon().getCode();
            opponent.updateLifePoints(damage,distance,code);
            player.updateMoney(damage);
        }
        player.setRound(player.getRound() + 1);

        System.out.println("Opponent points: " + opponent.getPointsLife());
    }
}
