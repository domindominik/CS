package main;

public class Opponent
{
    public static final double[][] DAMAGE_BONUS = new double[][]
    {
            {0,0,0},
            {1.5,0,0.5},
            {0.5,0,1.5}
    };
    private double pointsLife;

    public Opponent()
    {
        this.pointsLife = 100;
    }

    public double getPointsLife()
    {
        return pointsLife;
    }

    public void setPointsLife(double pointsLife)
    {
        this.pointsLife = pointsLife;
    }

    public void updateLifePoints(double damage, int distance, int code)
    {
        pointsLife -= damage * DAMAGE_BONUS[distance][code];
    }
}
