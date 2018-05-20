package info.mypackage;

import info.mypackage.dao.CartDAO;
import info.mypackage.model.Cart;

public class AppRunner {

	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.setCreateTime(System.currentTimeMillis());
		
		CartDAO.save(cart);
	}
}
