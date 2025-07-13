package States;

import java.util.HashMap;

import Machine.VendingMachine;

public class Idle implements State {
	
	private VendingMachine vm;
	
	public Idle(VendingMachine vm)
	{
		this.vm=vm;
	}
	
	@Override
	public void changeState(State state) {
		vm.changeState(state);
	}

	@Override
	public void addMoney(int money) throws Exception {
		vm.moneyAdded(this, money);
		changeState(new MoneyAdded(vm));
	}

	@Override
	public void addItems(HashMap<String,Integer> newItems) throws Exception {
		vm.addItems(newItems);
	}

	@Override
	public void selectItem(String itemName, int count) throws Exception {
		throw new Exception("Not in correct state");		
	}

	@Override
	public void returnState() throws Exception {
		changeState(new Dispence(vm));
	}

	@Override
	public void removeItems() throws Exception{
		throw new Exception("Not in correct state");		
	}

	@Override
	public void removeSelected(String itemName, int count) throws Exception {
		throw new Exception("Not in correct state");								
	}
}
