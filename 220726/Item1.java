package java_220726;

public class Item1 implements Comparable { // 두 개를 비교해서 같으면 0을 반환한다.
										  // 비교당하는 값이 더 작으면 -, 더 크면 +
	private final String id; // 아이디
	private final String name; // 이름
	private final double retail; // 소매가
	private final int quantity; // 개수
	private double price; // 가격
	private final Boolean noDisCount; // true면 노할인, false면 할인
	
	Item1(String idIn, String nameIn, String retailIn, String qIn, Boolean noDisCountIn){
		
		id = idIn;
		name = nameIn;
		retail = Double.parseDouble(retailIn);
		quantity = Integer.parseInt(qIn);
		noDisCount = noDisCountIn;
		
		if (noDisCount == true) {
			price = retail;
			System.out.println(nameIn + "은 $"+ price +"에 판매되었습니다.");
		} else {
			if(quantity > 400) {
				price = retail*.5D;
			}else if (quantity > 200) {
				price = retail*.6D;
			}else {
				price = retail*.7D;
			}
			price = Math.floor(price*100+.5)/100; // 정수에서 가까운 값을 자른다...?
			System.out.println(nameIn + "은 $"+ price +"에 판매되었습니다.");	
		}
	}
	
	@Override
	public int compareTo(Object obj) {
		Item1 temp = (Item1) obj;
    	
		if(this.price < temp.price) {
			System.out.println(this.name+"은 "+temp.name+"보다 쌉니다.");
			return 1;
		}else if (this.price > temp.price) {
			System.out.println(this.name+"은 "+temp.name+"보다 가격이 비쌉니다.");
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
		
		Item1 item1 = new Item1("ID1","name1","300","400",true);
		Item1 item2 = new Item1("ID2","name2","300","400",false);
		
		item1.compareTo(item2);
		
	}
}