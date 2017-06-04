
public class IntegerMatch {

    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));

        //起始字符可能是+或者-,或者二者都没有(因为后面有个?)
        //因为+在正则表达式中有特殊意义，所以必须使用\\将其转义
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }

}
