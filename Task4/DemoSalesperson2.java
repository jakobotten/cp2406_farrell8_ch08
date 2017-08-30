public class DemoSalesperson2 {
    public static void main(String[] args) {

        int IDNum = 111;
        double salesAmount = 25000;

        Salesperson[] salespeople = new Salesperson[10];

        for(int i = 0; i < salespeople.length; i++) {
            salespeople[i] = new Salesperson(IDNum, salesAmount);

            IDNum++;
            salesAmount += 5000;
        }

        for(int i = 0; i < salespeople.length; i++)
            System.out.println("Salesperson " + (i+1) + " has the ID number: " + salespeople[i].getIDNum() +
                    " and a salesAmount of: $" + salespeople[i].getSalesAmount() + "\n");
    }
}
