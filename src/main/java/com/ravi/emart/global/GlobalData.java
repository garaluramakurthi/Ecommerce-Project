package com.ravi.emart.global;

import java.util.ArrayList;
import java.util.List;

import com.ravi.emart.model.Product;

public class GlobalData {
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}
}
