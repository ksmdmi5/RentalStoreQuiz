package com.skilldistillery.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Store {
	
	public Store() {}
	private int storeId;
	
	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	private List<Store> store;
	// TODO: each store has an id
	private List<Customer> storeId() {
		List<Store> store = new ArrayList<>();
		for (Store newStore : store) {
				((List<Store>) store).add(new Store());
		}
		return storeId();
	}
	// TODO: each store has 0 or more unique Customers
	
	// TODO: implement the required methods to:
	//       * Add a customer (no duplicates allowed)
	List<Customer> ct() {
		getStoreId().add(Customer);
		return new ArrayList<>();
	}
	//       * Return the number of customers
	//       * Display all data

	public String displayData() {
		return "Store [storeId=" + storeId + ", store=" + store + ", ct=" + ct + "]";
	}
	
}
