package Machine;
import States.*;
import java.util.*;

import Items.Item;

public class VendingMachine {
	private HashMap<String,Item> items;
	private HashMap<String,Integer> itemsSelected;
	private State state;
	private int earnings;
	private int moneyAdded;
	
	VendingMachine()
	{
		state=new Idle(this);
		earnings=0;
		moneyAdded=0;
		items=new HashMap<String,Item>();
		itemsSelected=new HashMap<>();
	}
	
	void changeItemPrice(String itemName,int price) throws Exception
	{
		if(items.containsKey(itemName))
		{
			items.get(itemName).setPrice(price);
		}
		throw new Exception("No item named:  "+itemName);
	}
	
	public void changeState(State state)
	{
		this.state=state;
	}

	public void addItems( HashMap<String,Integer> newItems) throws Exception {
		if(state instanceof Idle || state instanceof Selected) {
			for(String item:newItems.keySet())
			{
				items.get(item).addCount(newItems.get(item));
			}
		}
		else
		{
			throw new Exception("Not in correct state");
		}
	}
	
	public void removeItems(String itemName,int count) throws Exception
	{
		if(items.containsKey(itemName))
		{
			Item item =items.get(itemName);
			item.removeItem(moneyAdded, count);
			moneyAdded-=count*item.getPrice();
		}
	}
	
	public void moneyAdded(Idle idle,int money)
	{
		earnings+=money;
		moneyAdded+=money;
	}
	public void removeMoney(int money)
	{
		earnings-=money;
		moneyAdded-=money;
	}
	public int checkMoney()
	{
		return moneyAdded;
	}
	public int returnChange()
	{
		int temp=moneyAdded;
		moneyAdded=0;
		return temp;
	}

	public void emptyTally() {
		for(String item:itemsSelected.keySet()){
			System.out.println("Here are your: "+item);
		}
		itemsSelected=new HashMap<>();
		System.out.println("Here is your money: "+moneyAdded);
		earnings-=moneyAdded;
		moneyAdded=0;
	}

	public void removeSelectedItems(String itemName, int count) throws Exception {
		Item item =items.get(itemName);
		HashMap<String,Integer> hash=new HashMap<>();
		hash.put(itemName,count);
		addItems(hash);
		moneyAdded+=count*item.getPrice();
	}
	
	public int getEarnings()
	{
		return earnings;
	}
}