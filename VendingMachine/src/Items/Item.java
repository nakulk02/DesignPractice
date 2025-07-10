package Items;

public class Item {
	private String name = "";
	private int price;
	private int count;
	
	Item(String name,int price)
	{
		this.name = name;
		this.price = price;
		count=0;
	}
	
	public String getName()
	{
		return name;
	}
	public int getPrice()
	{
		return price;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public void addCount(int count)
	{
		this.count+=count;
	}
	public void removeItem(int count) throws Exception
	{
		if(this.count>count)
		{
			this.count-=count;
		}
	}
	public void removeItem(int money,int count) throws Exception
	{
		if(this.count<count)
		{
			throw new Exception("Insufficient item count");			
		}
		if(money<price*count)
		{
			throw new Exception("Insufficient money");
		}
		this.count-=count;
	}

	public int getCount() {
		return count;
	}
}