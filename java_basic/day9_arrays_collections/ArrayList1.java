import java.util.ArrayList;

class Apple {
    private static long count;
    private final long id = count++;
    private String name;

    public Apple() {

    }

    public Apple(String name) {
        this.name = name;
    }

    public long id() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        Apple another = (Apple) other;
        if (this.name != null && this.name.equals(another.getName())) {
            return true;
        }
        return false;
    }
}

class Orange {
}


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Apple> appleList = new ArrayList<>();  // 新建

        for (int i = 0; i < 3; i++) {
            appleList.add(new Apple());  // 添加
        }

        // appleList.add(1, new Orange());  // 带index的插入

        // appleList.add(1.01);  // 自动装箱

        // Apple apple = (Applet) appleList.get(0); // 获取，需要强制转型
        Apple apple = appleList.get(0); // 获取

        // System.out.println((Double)appleList.get(4) + 2); // 自动拆箱

        // appleList.remove(0);
        // appleList.clear();
        
        // ArrayList orangeList = new ArrayList();
        // orangeList.add(new Orange());
        // orangeList.add(new Orange());

        // appleList.addAll(orangeList);

        // Object[] arr = appleList.toArray();

        appleList.add(null);
        appleList.add(null);
        System.out.println("size = " + appleList.size());
        boolean exist = appleList.contains(null);
        System.out.println("exist = " + exist);

        appleList.add(new Apple("big"));
        exist = appleList.contains(new Apple("big"));
        System.out.println("exist big = " + exist);

        System.out.println("is empty = " + appleList.isEmpty());

        for (int i = 0; i < appleList.size(); i++) {
            System.out.println(appleList.get(i));
        }

        for (Apple x : appleList) {
            System.out.println(x);
        }

    }
}