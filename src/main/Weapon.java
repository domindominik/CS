package main;

public class Weapon
{
    public static final int GUN = 0;
    public static final int SHOT_GUN = 1;
    public static final int MACHINE_GUN = 2;
    public static final String[] NAMES = new String[] {"Gun", "Shot Gun", "Machine Gun"};

    private String name;
    private int shotsQuantity;
    private double price;
    private double damage;
    private double bonus;
    private int code;

    public Weapon(String name, int shotsQuantity, int price, int damage)
    {
        this.name = name;
        this.shotsQuantity = shotsQuantity;
        this.price = price;
        this.damage = damage;
        this.bonus = 0.5;
    }

    public double getBonus()
    {
        return bonus;
    }

    public String getName()
    {
        return NAMES[code];
    }

    public int getCode()
    {
        return code;
    }

    public int getShotsQuantity()
    {
        return shotsQuantity;
    }

    public double getPrice()
    {
        return price;
    }

    public double getDamage()
    {
        return damage;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setShotsQuantity(int shotsQuantity)
    {
        this.shotsQuantity = shotsQuantity;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    public void printInfo()
    {
        System.out.println("Name: " + name +
                ", Shots: " + shotsQuantity +
                ", Price: " + price +
                ", Damage: " + damage);
    }
}
