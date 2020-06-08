package bank;

abstract class AbstractMoney 
{

    protected String coinName;
    protected int coinAmount;
    protected double coinValue;

    // Constructor

    public AbstractMoney(String coinName, int coinAmount, double coinValue)
    {
        this.coinName = coinName;
        this.coinAmount = coinAmount;
        this.coinValue = coinValue;
    }

    // Getters

    public String getCoinName() 
    {
        return coinName;
    }

    public int getCoinAmount() 
    {
        return coinAmount;
    }

    public double getCoinValue() 
    {
        return coinValue;
    }

    // Setters

    public void setCoinName(String coinName) 
    {
        this.coinName = coinName;
    }

    public void setCoinValue(double coinValue) 
    {
        this.coinValue = coinValue;
    }

    // Other Methods

    public double getTotal(int coinAmount)
    {
        return coinValue * coinAmount;
    }

    @Override
    public String toString()
    {
        return "\n" + coinAmount + coinName;
    }
}