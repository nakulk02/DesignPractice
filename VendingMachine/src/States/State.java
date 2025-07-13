package States;

import java.util.HashMap;

public interface State {
	
	/*
	 * states-
	 * Idle,MoneyAddition,Selected,Dispense
	 */
	
	void changeState(State state);
	
	void addMoney(int money) throws Exception;
	
	void selectItem(String itemName, int count) throws Exception;

	void returnState() throws Exception;

	void removeItems() throws Exception;

	void addItems(HashMap<String, Integer> newItems) throws Exception;

	void removeSelected(String itemName, int count) throws Exception;
}
