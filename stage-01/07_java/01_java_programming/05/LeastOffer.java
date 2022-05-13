import java.util.Scanner;

class Item {
    String name;
    int price;
    int discount;

    public Item(String name, int price, int discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public int getDiscountAmount() {
        return price * discount / 100;
    }
}

public class LeastOffer {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int noOfItems = in.nextInt();
            Item[] items = new Item[noOfItems];

            in.nextLine();

            for (int i = 0; i < noOfItems; i++) {
                String inputLine = in.nextLine();
                String[] params = inputLine.split(",");

                items[i] = new Item(params[0], Integer.parseInt(params[1]), Integer.parseInt(params[2]));
            }

            Item costlyItem = items[0];

            for (Item item : items) {
                if (item.getDiscountAmount() < costlyItem.getDiscountAmount()) {
                    costlyItem = item;
                }
            }

            for (Item item : items) {
                if (item.getDiscountAmount() == costlyItem.getDiscountAmount()) {
                    System.out.println(item.name);
                }
            }

        }
    }
}
