package java_220726;

import java.util.Collections;
import java.util.LinkedList;

public class Storefront {
	private final LinkedList catalog = new LinkedList();
	// Linkedlist : 파이썬의 list와 같음
	
	public void addItem(String id, String name, String price, String quant) {
		Item it = new Item(id, name, price, quant);
		catalog.add(it); // 만든 객체를 카탈로그 리스트에 넣는다.
	}
	
    public Item getItem(int i) {
        return (Item) catalog.get(i); // 이건 리스트에서 객체를 하나씩 꺼내는 용도
    }
	
	public int getSize() {
		return catalog.size(); // 리스트 안에 들은 갯수 말하는듯?
	}
	
	public void sort() {
		Collections.sort(catalog); //sort : 카탈로그 정렬하기. 현재는 가격으로 내림차순으로 정렬되어 있다.
	}
}


