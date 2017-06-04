/**
 * 描述客户的信息
 */
class Customer {
    int age;
    String name;


    Customer() {
        name = "Kris";
        age = 30;
    }

    Customer(String n, int a) {
        name = n;
        age = a;
    }

    int returnAge() {
        return age;
    }

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }
}