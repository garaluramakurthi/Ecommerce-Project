package com.naveen.emart.global;

import java.util.ArrayList;
import java.util.List;

import com.naveen.emart.model.Product;

public class GlobalData {
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}
}
