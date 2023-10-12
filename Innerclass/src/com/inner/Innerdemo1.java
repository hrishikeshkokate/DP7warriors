package com.inner;

class Mall
{
	private String mallname="Pacific";
	private String location="Pune";
	
	void doshopping()
	{
		class Cart
		{
			String item;
			float price;
			static double bill=0;
			
			void addItem(String item,float price)
			{
				this.item=item;
				this.price=price;
				
				System.out.println("Items : "+this.item+" "+this.price);
				bill+=price;
			}
			
			void displaybill()
			{
				System.out.println("_______________________");
				System.out.println("Total Bill : "+bill);
				
				System.out.println("_______________________");
				System.out.println("Thanks for shopping at "+mallname+" mall "+location);
			}
		}
		Cart c1=new Cart();
		c1.addItem("Shirt",1400);
		c1.displaybill();
	}
}
public class Innerdemo1 {

	public static void main(String[] args) {
		
		Mall m1=new Mall();
		m1.doshopping();
		

	}

}
