package advance;

class laptop {
    public int unit;
    public int serial_number;

    public laptop(int unit, int serial_number){
        this.unit = unit;
        this.serial_number = serial_number;
    }

    public void increaseUnit(int decrement)
    {
        unit -= decrement;
    }

    public void decreaseUnit(int increment)
    {
        unit += increment;
    }

    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of units are " + unit + "\n" + "serial number of laptop is " + serial_number);
    }
}