package java_220726;

public class GiftShop {
	public static void main(String[] args) {
		Storefront store = new Storefront();
		
        store.addItem("C01", "MUG", "9.99", "150");
        store.addItem("C02", "LG MUG", "12.99", "82");
        store.addItem("C03", "MOUSEPAD", "10.49", "800");
        store.addItem("D01", "T SHIRT", "16.99", "90");
        store.sort();//Item 클래스에서 compareTo가 불리면서 정렬이 된다. 근데 어떻게 부르는거지??
        
        for (int i = 0; i < store.getSize(); i++) {
            Item show = (Item) store.getItem(i);
            
            System.out.println("\nItem ID: " + show.getId() +
                "\nName: " + show.getName() +
                "\nRetail Price: $" + show.getRetail() +
                "\nPrice: $" + show.getPrice() +
                "\nQuantity: " + show.getQuantity());
        }
    }
}

