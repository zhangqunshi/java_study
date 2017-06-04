/**
 * 描述一张纸牌
 */
class Card {

    int cardValue;
    char type;

    Card(int value, char t) {
        cardValue = value;
        type = t;
    }

    public String toString() {
        switch (cardValue) {
            case 1:
                return type + " A";
            case 11:
                return type + " J";
            case 12:
                return type + " Q";
            case 13:
                return type + " K";
        }
        return type + " " + cardValue;
    }

    public static void main(String[] args) {
        Card c = new Card(8, 'h');
        System.out.println(c.toString());
        c.cardValue = 9;
        c.type = 'c';

        Card c2 = new Card(7, 'c');
        c2.cardValue = 1;
        System.out.println(c2.toString());
    }
}