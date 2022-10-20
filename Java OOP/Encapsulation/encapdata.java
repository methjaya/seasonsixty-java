public class encapdata {

    private double rad;
    private double pi=3.14,area,circ;

    //creating a method to set the radius value
    public void setrad(double x)
    {
        rad=x;
    }

    //creating a method to get the circumference
    public double getcir()
    {
        return circ=2*(pi*rad);
    }

    //creating a method to get the area
    public double getarea()
    {
        return area=pi*(rad*rad);
    }





}
