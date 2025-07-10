package States;

import java.util.List;

import Items.Item;
import Machine.VendingMachine;

public class Selected implements State {
	
	private VendingMachine vm;
	public Selected(VendingMachine vm) {
		this.vm=vm;
	}

	@Override
	public void changeState(State state) {
		vm.changeState(state);
	}

	@Override
	public void addMoney(int money) throws Exception {
		throw new Exception("Not in correct state");				
	}

	@Override
	public void addItems(List<Item> newItems) throws Exception {
		throw new Exception("Not in correct state");				
		
	}

	@Override
	public void selectItem(String itemName, int count) throws Exception {
		throw new Exception("Not in correct state");				
		
	}

	@Override
	public void returnState() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeItems() throws Exception {
		throw new Exception("Not in correct state");		
	}

}
