package main;

public class Weapon
{
    private String name;
    private int shotsQuantity;
    private int price;
    private int damage;

    public Weapon(String name, int shotsQuantity, int price, int damage)
    {
        this.name = name;
        this.shotsQuantity = shotsQuantity;
        this.price = price;
        this.damage = damage;
    }

    public String getName()
    {
        return name;
    }

    public int getShotsQuantity()
    {
        return shotsQuantity;
    }

    public int getPrice()
    {
        return price;
    }

    public int getDamage()
    {
        return damage;
    }

    public void printInfo()
    {
        System.out.println("Name: " + name +
                ", Shots: " + shotsQuantity +
                ", Price: " + price +
                ", Damage: " + damage);
    }
}
