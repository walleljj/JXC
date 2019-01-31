package com.lzw.dao;

import java.util.List;

import com.lzw.entity.DD;
import com.lzw.entity.Order;

public interface OrderDao {
	public int addOrder(Order or);
	public int removeOrder(Order or);
	public Order findOrderById(int id);
	public List<DD> findAll();
	public List<DD> findIn();
	public List<DD> findOut();
	public List<DD> findByCustomer(String c);
	public List<DD> findByWaiter(String w);
	
	
	

}
