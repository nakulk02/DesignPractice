package States;

import java.util.HashMap;

import Machine.VendingMachine;

public class MoneyAdded implements State{

	private VendingMachine vm;
	
	public MoneyAdded(VendingMachine vm)
	{
		this.vm=vm;
	}
	
	@Override
	public void changeState(State state) {
		vm.changeState(state);
	}
	
	@Override
	public void addMoney(int money) throws Exception {
		throw new Exception("Not correct state");
	}
	
	@Override
	public void selectItem(String itemName, int count) throws Exception {
		try {
			vm.removeItems(itemName,count);
			changeState(new Selected(vm));
		} 
		catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public void returnState() throws Exception {
		changeState(new Dispence(vm));
	}

	@Override
	public void removeItems() throws Exception {
		throw new Exception("Not in correct state");						
	}

	@Override
	public void addItems(HashMap<String, Integer> newItems) throws Exception {
		throw new Exception("Not in correct state");						
	}

	@Override
	public void removeSelected(String itemName, int count) throws Exception {
		throw new Exception("Not in correct state");						
	}
	
}
