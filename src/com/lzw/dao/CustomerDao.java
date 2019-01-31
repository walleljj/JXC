package com.lzw.dao;

import java.util.List;

import com.lzw.entity.Customer;

public interface CustomerDao {
	public int addCustomer(Customer c);
	public int removeCustomer(Customer c);
	public int updateCustomer(Customer c);
	public Customer findCustomerById(int id);
	public List<Customer> findQianzhang();
	public List<Customer> findAll();

}
