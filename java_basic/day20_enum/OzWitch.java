

public enum OzWitch {
    A("Hello"),
    b("How are you"),
    C("Bye");

    private String desc;

    private OzWitch(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch + " " + witch.getDesc());
        }
    }

}
