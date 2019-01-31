package com.lzw.dao;

import com.lzw.entity.Waiter;

public interface WaiterDao {
	public int addWaiter(Waiter w);
	public int updeteWaiter(Waiter w);
	public Waiter findWaiterById(int id);

}
