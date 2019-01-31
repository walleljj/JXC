package com.lzw.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lzw.dao.GoodsDao;
import com.lzw.db.DBUtil;
import com.lzw.entity.Goods;


public class GoodsDaoImpl implements GoodsDao {

	@Override
	public int addGoods(Goods g) {
		String sql = "insert into goods(gId,name,pinpai,gongying,size,kuanshi,color,mianliao,baozhuang,kucun,jinjia)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, g.getgId());
			pstmt.setString(2, g.getName());
			pstmt.setString(3, g.getPinpai());
			pstmt.setString(4, g.getGongying());
			pstmt.setString(5, g.getSize());
			pstmt.setString(6, g.getKuanshi());
			pstmt.setString(7, g.getColor());
			pstmt.setString(8, g.getMianlia());
			pstmt.setString(9, g.getBaozhuang());
			pstmt.setInt(10, g.getKucun());
			pstmt.setInt(11, g.getJinjia());			
			pstmt.executeUpdate();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return 0;
	}

	@Override
	public Goods findGoodsById(int id) {
		String sql = "select * from goods where gId='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			Goods c=null;
			if(re.next()){
				c = new Goods(re.getInt("gId"),re.getString("name"),
						re.getString("pinpai"),re.getString("gongying"),
						re.getString("size"),re.getString("kuanshi"),
						re.getString("color"),re.getString("mianliao"),
						re.getString("baozhuang"),re.getInt("kucun"),re.getInt("jinjia"));
			}
			return c;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}

	@Override
	public List<Goods> findAllGoods() {
		String sql = "select * from goods";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Goods> list = new ArrayList<Goods>();
			while(re.next()){
				Goods c=null;
				c = new Goods(re.getInt("gId"),re.getString("name"),
						re.getString("pinpai"),re.getString("gongying"),
						re.getString("size"),re.getString("kuanshi"),
						re.getString("color"),re.getString("mianliao"),
						re.getString("baozhuang"),re.getInt("kucun"),re.getInt("jinjia"));
				list.add(c);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}

	@Override
	public List<Goods> findGoodsByName(String name, int n) {
		String sql = null;
		if(n==0)
			sql = "select * from goods where name='"+name+"' and kucun<'1'";
		else
			sql = "select * from goods where name='"+name+"' and kucun>'1'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Goods> list = new ArrayList<Goods>();
			while(re.next()){
				Goods c=null;
				c = new Goods(re.getInt("gId"),re.getString("name"),
						re.getString("pinpai"),re.getString("gongying"),
						re.getString("size"),re.getString("kuanshi"),
						re.getString("color"),re.getString("mianliao"),
						re.getString("baozhuang"),re.getInt("kucun"),re.getInt("jinjia"));
				list.add(c);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}

	@Override
	public List<Goods> findGoodsByGongying(String gong, int n) {
		String sql = null;
		if(n==0)
			sql = "select * from goods where gongying='"+gong+"' and kucun<'1'";
		else
			sql = "select * from goods where gongying='"+gong+"' and kucun>'1'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Goods> list = new ArrayList<Goods>();
			while(re.next()){
				Goods c=null;
				c = new Goods(re.getInt("gId"),re.getString("name"),
						re.getString("pinpai"),re.getString("gongying"),
						re.getString("size"),re.getString("kuanshi"),
						re.getString("color"),re.getString("mianliao"),
						re.getString("baozhuang"),re.getInt("kucun"),re.getInt("jinjia"));
				list.add(c);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}

	@Override
	public int deletGoods(int id) {
		
		String sql = "delete from goods where gId='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return 0;
	}

	@Override
	public int updateGoods(Goods g) {
		int id = g.getgId();
		String sql = "update goods set gId=?,name=?,pinpai=?,gongying=?,size=?,kuanshi=?,color=?,mianliao=?,baozhuang=?,kucun=?,jinjia=? where gId='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, g.getgId());
			pstmt.setString(2, g.getName());
			pstmt.setString(3, g.getPinpai());
			pstmt.setString(4, g.getGongying());
			pstmt.setString(5, g.getSize());
			pstmt.setString(6, g.getKuanshi());
			pstmt.setString(7, g.getColor());
			pstmt.setString(8, g.getMianlia());
			pstmt.setString(9, g.getBaozhuang());
			pstmt.setInt(10, g.getKucun());
			pstmt.setInt(11, g.getJinjia());
			pstmt.executeUpdate();
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return 0;
	}
	public List<Goods> findGoodsBySize(String size, int n) {
		String sql = null;
		if(n==0)
			sql = "select * from goods where size='"+size+"' and kucun<'1'";
		else
			sql = "select * from goods where size='"+size+"' and kucun>'1'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Goods> list = new ArrayList<Goods>();
			while(re.next()){
				Goods c=null;
				c = new Goods(re.getInt("gId"),re.getString("name"),
						re.getString("pinpai"),re.getString("gongying"),
						re.getString("size"),re.getString("kuanshi"),
						re.getString("color"),re.getString("mianliao"),
						re.getString("baozhuang"),re.getInt("kucun"),re.getInt("jinjia"));
				list.add(c);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}
	
	public List<Goods> findGoodsByKuanshi(String gong, int n) {
		String sql = null;
		if(n==0)
			sql = "select * from goods where kuanshi='"+gong+"' and kucun<'1'";
		else
			sql = "select * from goods where kuanshi='"+gong+"' and kucun>'1'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Goods> list = new ArrayList<Goods>();
			while(re.next()){
				Goods c=null;
				c = new Goods(re.getInt("gId"),re.getString("name"),
						re.getString("pinpai"),re.getString("gongying"),
						re.getString("size"),re.getString("kuanshi"),
						re.getString("color"),re.getString("mianliao"),
						re.getString("baozhuang"),re.getInt("kucun"),re.getInt("jinjia"));
				list.add(c);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}
	
	public List<Goods> findGoodsByColor(String gong, int n) {
		String sql = null;
		if(n==0)
			sql = "select * from goods where color='"+gong+"' and kucun<'1'";
		else
			sql = "select * from goods where color='"+gong+"' and kucun>'1'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Goods> list = new ArrayList<Goods>();
			while(re.next()){
				Goods c=null;
				c = new Goods(re.getInt("gId"),re.getString("name"),
						re.getString("pinpai"),re.getString("gongying"),
						re.getString("size"),re.getString("kuanshi"),
						re.getString("color"),re.getString("mianliao"),
						re.getString("baozhuang"),re.getInt("kucun"),re.getInt("jinjia"));
				list.add(c);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}
	public List<Goods> findGoodsByMianliao(String gong, int n) {
		String sql = null;
		if(n==0)
			sql = "select * from goods where mianliao='"+gong+"' and kucun<'1'";
		else
			sql = "select * from goods where mianliao='"+gong+"' and kucun>'1'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Goods> list = new ArrayList<Goods>();
			while(re.next()){
				Goods c=null;
				c = new Goods(re.getInt("gId"),re.getString("name"),
						re.getString("pinpai"),re.getString("gongying"),
						re.getString("size"),re.getString("kuanshi"),
						re.getString("color"),re.getString("mianliao"),
						re.getString("baozhuang"),re.getInt("kucun"),re.getInt("jinjia"));
				list.add(c);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}
	public List<Goods> findAll(int n) {
		String sql = null;
		if(n==0)
			sql = "select * from goods where kucun<'1'";
		else
			sql = "select * from goods where kucun>'1'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<Goods> list = new ArrayList<Goods>();
			while(re.next()){
				Goods c=null;
				c = new Goods(re.getInt("gId"),re.getString("name"),
						re.getString("pinpai"),re.getString("gongying"),
						re.getString("size"),re.getString("kuanshi"),
						re.getString("color"),re.getString("mianliao"),
						re.getString("baozhuang"),re.getInt("kucun"),re.getInt("jinjia"));
				list.add(c);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(conn);
		}
		return null;
	}

}
