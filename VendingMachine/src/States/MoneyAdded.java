package States;

import java.util.List;

import Items.Item;
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
	public void addItems(List<Item> newItems) throws Exception {
		throw new Exception("Not correct state");
	}
	
	@Override
	public void selectItem(String itemName, int count) throws Exception
	{
		try {
			vm.removeItems(itemName,count);
			changeState(new Selected(vm));
		} 
		catch(Exception e)
		{
			throw e;
		}
	}
	
	@Override
	public void returnState() throws Exception {
		changeState(new Idle(vm));
	}

	@Override
	public void removeItems() throws Exception {
		throw new Exception("Not in correct state");						
	}
	
}
