public class Card implements Comparable<Card> {
    private String color;
    private String value;

    public Card(){
        this.setColor("");
        this.setValue("");
    }

    public Card(String color, String value){
        this.setColor(color);
        this.setValue(value);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String toString(){
        return getColor() + "," + getValue();
    }

    public int compareTo(Card other){
        int colorCompare = this.getColor().compareTo(other.getColor());

        if (colorCompare != 0) {
            return colorCompare;
        }

        return this.getValue().compareTo(other.getValue());
    }


}
