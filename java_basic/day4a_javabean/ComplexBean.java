/**
 * Complex JavaBean Example
 */
public class ComplexBean {

    private String name;
    private int age;

    public String getName() {
        if ("kris".equals(this.name)) {
            return "Good man";
        } else {
            return this.name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (this.age > 30) {
            return this.age - 10;
        }
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}