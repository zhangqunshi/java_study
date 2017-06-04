class Customer2 {
    String name;
    int money;
    String[] goodsList = new String[10];
    static int goodsCount = 0;

    Customer2(String name, int money) {
        this.name = name;
        this.money = money;
    }

    void buy(String goods, int price) {
        goodsList[goodsCount] = goods;
        goodsCount++;
        money = money - price;
    }

    void printLeftMoney() {
        System.out.println("这个人还剩下: " + money);
    }

    void printGoodsList() {
        System.out.println("这个人买了如下货物: ");
        for (int i = 0; i < goodsList.length; i++) {
            System.out.println(goodsList[i]);
        }
    }
}