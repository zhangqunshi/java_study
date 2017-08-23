

public enum SpaceShip {
    HELLO, WORLD, KRIS;

    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (SpaceShip x : values()) {
            System.out.println(x);
        }
    }

}
