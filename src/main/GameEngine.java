package main;

import java.util.List;
import java.util.Random;

public class GameEngine
{
    private List<Weapon> weaponList;
    private My my;
    private Oponent oponent;
    private int[] distance = new int[]{5, 10, 15};

    public GameEngine(List<Weapon> weaponList, My my, Oponent oponent)
    {
        this.weaponList = weaponList;
        this.my = my;
        this.oponent = oponent;
    }

    public void setWeapon(int index)
    {
        if (weaponList.get(index).getPrice() <= my.getMoney())
        {
            my.setWeapon(weaponList.get(index));
            my.setMoney(my.getMoney() - weaponList.get(index).getPrice());
        }
        else
        {
            my.setWeapon(weaponList.get(0));
        }
    }

    public int distance()
    {
        Random random = new Random();
        return distance[random.nextInt((3))];
    }

    public void shot(int distance)
    {
        while ((my.getWeapon().getShotsQuantity() > 0))
        {
            oponent.setPointsLife(100);
            Random random = new Random();
            int hit = random.nextInt((2));
            System.out.println(hit);
            if (hit == 1)
            {
                oponent.setPointsLife(oponent.getPointsLife() - my.getWeapon().getDamage());
                my.setMoney(my.getMoney() + my.getWeapon().getDamage() * 10);
                my.getWeapon().setShotsQuantity(my.getWeapon().getShotsQuantity() - 1);
            }
            else
            {
                my.getWeapon().setShotsQuantity(my.getWeapon().getShotsQuantity() - 1);
            }
        }
        my.setRound(my.getRound() + 1);
    }


}
