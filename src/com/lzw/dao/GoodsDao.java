package com.lzw.dao;

import java.util.List;

import com.lzw.entity.Goods;

public interface GoodsDao {
	public int addGoods(Goods g);
	public Goods findGoodsById(int id);
	public List<Goods> findAllGoods(); 
	public List<Goods> findGoodsByName(String name,int n);
	public List<Goods> findGoodsByGongying(String gong,int n);
	public int deletGoods(int id);
	public int updateGoods(Goods g);

}
