

enum Signal {
    GREEN,
    RED,
    YELLOW
}

public class TrafficLight {
    Signal color = Signal.RED;

    public void change() {
        switch(color) {
            case GREEN: color = Signal.YELLOW; break;
            case YELLOW: color = Signal.RED; break;
            case RED: color = Signal.GREEN; break;
        }
    }

    public String toString() {
        return "" + color;
    }

    public static void main(String[] args) {
        TrafficLight x = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            x.change();
            System.out.println(x);
        }
    }
}
