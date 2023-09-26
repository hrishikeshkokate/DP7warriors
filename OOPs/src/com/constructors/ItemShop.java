package com.constructors;

public class ItemShop 
{
	static void discount(Item i)
	{
		if(i.getPrice()>200)
		{
			int p=i.getPrice();
			p=(int) (p-(p*0.1));
			i.setPrice(p);
			
			
		}
	}

	public static void main(String[] args) 
	{
		Item i1= new Item(001,"flour",100);
		Item i2= new Item(002,"sugar",150);
		Item i3= new Item(003,"milk",220);
		Item i4= new Item(004,"chocolate",180);
		Item i5= new Item();
		i5.setId(005);
		i5.setName("coffee");
		i5.setPrice(600);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		
		System.out.println("======After discount======");
		
		discount(i1);
		discount(i2);
		discount(i3);
		discount(i4);
		discount(i5);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);

		
		
		
	}

}
