import java.util.ArrayList;

class Apple2 {
}

class Gala extends Apple2 {
}


public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Apple2> appleList = new ArrayList<>();  // 新建

        appleList.add(new Apple2());
        appleList.add(new Gala());

        for (Apple2 x : appleList) {
            System.out.println(x);
        }

    }
}