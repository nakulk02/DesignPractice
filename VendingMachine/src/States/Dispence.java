package States;

import java.util.HashMap;

import Machine.VendingMachine;

public class Dispence implements State {
	
	private VendingMachine vm;

	public Dispence(VendingMachine vm) 
	{
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
	public void selectItem(String itemName, int count) throws Exception {
		throw new Exception("Not in correct state");				
	}

	@Override
	public void returnState() throws Exception {
		throw new Exception("Not in correct state");				
	}
	
	@Override
	public void removeItems()
	{
		vm.emptyTally();
		changeState(new Idle(vm));
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
