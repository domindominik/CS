package main;

public class Weapon
{
    public static final String[] NAMES = new String[] {"Gun", "Shot Gun", "Machine Gun"};
    private int shotsQuantity;
    private double price;
    private double damage;
    private int code;

    public Weapon(int code, int shotsQuantity, int price, int damage)
    {
        this.code = code;
        this.shotsQuantity = shotsQuantity;
        this.price = price;
        this.damage = damage;
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
        System.out.println("Name: " + NAMES[code] +
                ", Shots: " + shotsQuantity +
                ", Price: " + price +
                ", Damage: " + damage);
    }
}
