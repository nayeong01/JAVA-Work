
package java_220726;


public class Item implements Comparable { // 두 개를 비교해서 같으면 0을 반환한다.
										  // 비교당하는 값이 더 작으면 -, 더 크면 +
	private final String id; // 아이디
	private final String name; // 이름
	private final double retail; // 소매가
	private final int quantity; // 개수
	double price; // 가격
	
	Item(String idIn, String nameIn, String retailIn, String qIn){
		
		id = idIn;
		name = nameIn;
		retail = Double.parseDouble(retailIn);
		quantity = Integer.parseInt(qIn);
		
		if(quantity > 400) {
			price = retail*.5D;
		}else if (quantity > 200) {
			price = retail*.6D;
		}else {
			price = retail*.7D;
		}
		price = Math.floor(price*100+.5)/100; // 정수에서 가까운 값을 자른다...?
		//System.out.println(nameIn + " price: " + price);	
	}
	
	@Override
	public int compareTo(Object obj) {
		Item temp = (Item) obj;
    	
		if(this.price < temp.price) {
			System.out.println(this.name+"은 "+temp.name+"보다 쌉니다.");
			return 1;
		}else if (this.price > temp.price) {
			System.out.println(this.name+"은 "+temp.name+"과 가격이 비쌉니다.");
			return -1;
		}
		System.out.println(this.name+"은 "+temp.name+"와 같습니다.");
			return 0;
		}
	
	public String getId() {
		return id;
	}
	
    public String getName() {
        return name;
    }

    public double getRetail() {
        return retail;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Item item1 = new Item("Id1", "name1", "500", "500"); // 250
		Item item2 = new Item("Id2", "name2", "600", "300"); // 240
		Item item3 = new Item("Id3", "name3", "500", "500"); // 210
		Item item4 = new Item("Id4", "name4", "200", "100"); // 140
		
		item1.compareTo(item2);
		item1.compareTo(item3);
		item1.compareTo(item4);
		*/
	}

}
