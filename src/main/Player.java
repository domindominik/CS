package main;

public class Player
{
    private String name;
    private int round;
    private double money;
    private Weapon weapon;

    public Player(String name, Weapon weapon)
    {
        this.name = name;
        this.round = 1;
        this.money = money;
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

    public double getMoney()
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

    public void setMoney(double money)
    {
        this.money = money;
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }
    public void updateMoney(double damage)
    {
        money += (double) (10 * damage);
    }

    public void printInfo()
    {
        System.out.println("Your money: " + money + "$" +
                ", Round: " + round +
                ", Your weapon: " + weapon.getName());
    }
}
