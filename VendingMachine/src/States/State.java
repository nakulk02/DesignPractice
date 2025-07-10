package States;

import java.util.List;

import Items.Item;

public interface State {
	
	/*
	 * states-
	 * Idle,MoneyAddition,Selected,Dispense
	 */
	
	public void changeState(State state);
	
	public void addMoney(int money) throws Exception;
	
	public void addItems(List<Item>newItems) throws Exception;

	void selectItem(String itemName, int count) throws Exception;

	void returnState() throws Exception;

	void removeItems() throws Exception;
}
