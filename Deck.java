import java.util.*;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();

        String[] colors = {"red", "green", "blue", "yellow"};

        for (String color : colors) {
            // Add 0
            cards.add(new Card(color, "0"));

            // Add 1–9 twice
            for (int i = 1; i <= 9; i++) {
                cards.add(new Card(color, i + ""));
                cards.add(new Card(color, i + ""));
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < cards.size(); j++) {
                int randomIndex = rand.nextInt(cards.size());

                Card temp = cards.get(j);
                cards.set(j, cards.get(randomIndex));
                cards.set(randomIndex, temp);
            }
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void valueSort() {
        Collections.sort(cards, new ValueComparator());
    }

    public String toString() {
        String result = "";

        for (int i = 0; i < cards.size(); i++) {
            result += cards.get(i) + " | ";

            if ((i + 1) % 15 == 0) {
                result += "\n";
            }
        }

        return result;
    }

}
