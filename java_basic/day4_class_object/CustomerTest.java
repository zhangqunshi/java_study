public class CustomerTest {
    public static void main(String[] args) {
        Customer2 cst = new Customer2("Kris", 1000);
        cst.buy("apple", 10);
        cst.buy("TOP ten CD", 60);
        cst.buy("IBM notebook", 8000);

        cst.printLeftMoney();
        cst.printGoodsList();

    }
}