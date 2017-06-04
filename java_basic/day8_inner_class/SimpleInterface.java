interface Person {
    String getName();

    int getAge();

    void setName(String s);
}


abstract class Kris implements Person {

    String name;
    int age;

    Kris(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setName(String s) {
        this.name = s;
    }
}

class HaoShuang extends Kris {
    String getName() {
        return "i am HaoShuang";
    }
}