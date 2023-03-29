package promoCodeDiscount;

public class DiscountMain {

	public static void main(String[] args) 
	{
		//create instance of a class
		PromocodeDiscount discount = new PromocodeDiscount();
		
		//Initializing values
		discount.productPrice = 600;
		discount.discountPrice = discount.productPrice * 0.5;
				
		System.out.println("Actual price of the product " + discount.productPrice);
		System.out.println("50% Discount applied " + discount.discountPrice);
	    
		/****Showing all possibilities of program****/
		//If the customer get 5% discount
		System.out.println("******Getting 5% Discount****");
		discount.promoCode = "Promo5";
		discount.getDiscountPrice();
		
		//If the customer get 10% discount
		System.out.println("******Getting 10% Discount****");
		discount.promoCode = "Promo10";
		discount.getDiscountPrice();
		
		//If the customer get 20% discount
		System.out.println("******Getting 20% Discount****");
		discount.promoCode = "Promo20";
		discount.getDiscountPrice();
		
		//If the customer is not applying any promocode
		System.out.println("******No Promocode****");
		discount.promoCode = null;
		discount.getDiscountPrice();
	}

}
