package Mod2;

public class Bank {
    private static Customer[] customers = new Customer[1000];
    private static int numofClients = 0;
    static {
        customers = new Customer[10]; // Инициализация массива на 10 элементов (вы можете выбрать другой размер)
        numofClients = 0;
    }
    private Bank() {

    }

    public static Customer getCustomer(int custNo) {
        if (custNo < customers.length)
            return customers[custNo];
        return null;

    }

    public static void addCustomer(Customer newCustomer) {
        customers[numofClients] = newCustomer;
        numofClients++;

    }

    public static int getNumofClients() {
        return numofClients;
    }
}
