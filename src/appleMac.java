package advance;

class appleMac extends laptop {
    public int cost;

    public appleMac(int unit, int serial_number, int startCost)
    {
        super(unit, serial_number);
        cost = startCost;
    }

    public void setCost(int newValue)
    {
        cost = newValue;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nlaptop cost is " + cost);
    }
}
