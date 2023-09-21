public class Main
{
    public static void main(String[] args)
    {
        double totalCost = 0;
        double winterCost = 20.24;
        double springCost = 20.25;
        double summerCost = 20.26;
        double fallCost = 20.27;
        totalCost = winterCost + springCost + summerCost + fallCost;
        System.out.println("The annual maintenance cost for a winter cost of " + winterCost + ", a spring cost of " + springCost + ", a summer cost of " + summerCost + ", and a fall cost of " + fallCost + " is " + totalCost);
    }
}