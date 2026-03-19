import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();
        JOptionPane.showMessageDialog(null, "Shuffled:\n" + deck);

        deck.sort();
        JOptionPane.showMessageDialog(null, "Sorted (Color then Value):\n" + deck);

        deck.valueSort();
        JOptionPane.showMessageDialog(null, "Sorted (Value only):\n" + deck);
    }
}
