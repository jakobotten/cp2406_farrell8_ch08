public class DemoSalesperson {
    public static void main(String[] args) {

        Salesperson[] salespeople = new Salesperson[10];

        for(int i = 0; i < salespeople.length; i++)
            salespeople[i] = new Salesperson(9999, 0.0);

        for(int i = 0; i < salespeople.length; i++)
            System.out.println("Salesperson " + (i+1) + " has the ID number: " + salespeople[i].getIDNum() +
                    " and a salesAmount of: $" + salespeople[i].getSalesAmount() + "\n");
    }
}
