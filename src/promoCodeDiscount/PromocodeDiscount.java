package promoCodeDiscount;

public class PromocodeDiscount {
	double productPrice;
	double discountPrice;
	String promoCode;
	double finalDiscountPrice;
	double finalProductPrice;
		
	void getDiscountPrice()
	{
		discountPrice = productPrice * 0.5;

		if(promoCode=="Promo5")
		{
			finalDiscountPrice = discountPrice * 0.05;
			System.out.println("Promocode applied");
			System.out.println("You got 5% additional discount of " + finalDiscountPrice);
			finalProductPrice = discountPrice - finalDiscountPrice;
			System.out.println("Final price of the Product " + finalProductPrice);
		}
		else if(promoCode=="Promo10")
		{
			finalDiscountPrice = discountPrice * 0.10;
			System.out.println("Promocode applied");
			System.out.println("You got 10% additional Discount " + finalDiscountPrice);
			finalProductPrice = discountPrice - finalDiscountPrice;
			System.out.println("Final price of the Product " + finalProductPrice);
		}
		else if(promoCode=="Promo20")
		{
			finalDiscountPrice = discountPrice * 0.20;
			System.out.println("Promocode applied");
			System.out.println("You got 20% additional discount " + finalDiscountPrice);
			finalProductPrice = discountPrice - finalDiscountPrice;
			System.out.println("Final price of the Product " + finalProductPrice);
		}
		else
		{
			System.out.println("No Promocode applied");
			System.out.println("Final price of the Product " + discountPrice);
		}
		
	}
	
}
