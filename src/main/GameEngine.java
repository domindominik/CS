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
        Random random = new Random(3);
        return distance[random.nextInt((2))];
    }

    public void shot(int distance)
    {
        while (my.getWeapon().getShotsQuantity() > 0)
        {
            Random random = new Random();

        }
    }


}
