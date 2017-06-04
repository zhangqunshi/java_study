class Game {
    Card[] cards;

    Game() {
        cards = new Card[52];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                int index = i * 13 + j;
                cards[index] = new Card(j + 1, (char) (i + 3));
            }
        }
    }
}