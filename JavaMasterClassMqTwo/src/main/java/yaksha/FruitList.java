package yaksha;

import java.util.ArrayList;

public class FruitList {
	private ArrayList<String> fruitList1;
	private ArrayList<String> fruitList2;

	public FruitList(ArrayList<String> fruitList1, ArrayList<String> fruitList2) {
		super();
		this.fruitList1 = fruitList1;
		this.fruitList2 = fruitList2;
	}

	public ArrayList<String> getFruitList1() {
		return fruitList1;
	}

	public void setFruitList1(ArrayList<String> fruitList1) {
		this.fruitList1 = fruitList1;
	}

	public ArrayList<String> getFruitList2() {
		return fruitList2;
	}

	public void setFruitList2(ArrayList<String> fruitList2) {
		this.fruitList2 = fruitList2;
	}
}