package main;

public class My
{
    private String name;
    private int round;
    private int money;
    private Weapon weapon;

    public My(String name, Weapon weapon)
    {
        this.name = name;
        this.round = 1;
        this.money = 0;
        this.weapon = weapon;
    }

    public String getName()
    {
        return name;
    }

    public int getRound()
    {
        return round;
    }

    public int getMoney()
    {
        return money;
    }

    public Weapon getWeapon()
    {
        return weapon;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setRound(int round)
    {
        this.round = round;
    }

    public void setMoney(int money)
    {
        this.money = money;
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }

    public void printInfo()
    {
        System.out.println("Your money: " + money + "$" +
                ", Round: " + round +
                ", Your weapon: " + weapon.getName());
    }
}
