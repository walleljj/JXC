package com.lzw.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lzw.dao.OrderDao;
import com.lzw.db.DBUtil;
import com.lzw.entity.DD;
import com.lzw.entity.Goods;
import com.lzw.entity.Order;

public class OrderDaoImpl implements OrderDao {

	@Override
	public int addOrder(Order or) {
		String sql = "insert into orderr(id,cId,gID,wID,number,price,amount,reason,oTime)"
				+ "values(?,?,?,?,?,?,?,?,?)";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, or.getId());
			pstmt.setInt(2, or.getcId());
			pstmt.setInt(3, or.getgId());
			pstmt.setInt(4, or.getwId());
			pstmt.setInt(5, or.getNumber());
			pstmt.setInt(6, or.getPrice());
			pstmt.setInt(7, or.getAmount());
			pstmt.setString(8, or.getReason());
			pstmt.setTimestamp(9, or.getoTime());
					
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
	public int removeOrder(Order or) {
		int id = or.getId();
		String sql = "delete from orderr where id='"+id+"'";
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
	public Order findOrderById(int id) {
		String sql = "select * from orderr where id='"+id+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			Order c=null;
			if(re.next()){
				c = new Order(re.getInt("id"),re.getInt("cId"),re.getInt("gId"),re.getInt("wId"),
						re.getInt("number"),re.getInt("price"),re.getString("reason"),re.getInt("amount"),
						re.getTimestamp("oTime"));
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
	public List<DD> findAll() {
		String sql = "select o.id,c.cName,c.cPhone,w.wName,w.Wphone,g.name,o.number,o.price,o.amount,o.reason,o.oTime "+
				"from customer c,waiter w,goods g,orderr o "+
				"where c.cId=o.cId and w.wId=o.wId and g.gId=o.gId";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<DD> list = new ArrayList<DD>();
			while(re.next()){
				DD c=null;
				c = new DD(re.getInt(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6),re.getInt(7),
						re.getInt(8),re.getInt(9),re.getString(10),re.getTimestamp(11));
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
	public List<DD> findIn() {
		String sql = "select o.id,c.cName,c.cPhone,w.wName,w.Wphone,g.name,o.number,o.price,o.amount,o.reason,o.oTime "+
				"from customer c,waiter w,goods g,orderr o "+
				"where c.cId=o.cId and w.wId=o.wId and g.gId=o.gId and o.reason='Èë¿â'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<DD> list = new ArrayList<DD>();
			while(re.next()){
				DD c=null;
				c = new DD(re.getInt(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6),re.getInt(7),
						re.getInt(8),re.getInt(9),re.getString(10),re.getTimestamp(11));
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
	public List<DD> findOut() {
		String sql = "select o.id,c.cName,c.cPhone,w.wName,w.Wphone,g.name,o.number,o.price,o.amount,o.reason,o.oTime "+
				"from customer c,waiter w,goods g,orderr o "+
				"where c.cId=o.cId and w.wId=o.wId and g.gId=o.gId and o.reason='³ö¿â'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<DD> list = new ArrayList<DD>();
			while(re.next()){
				DD c=null;
				c = new DD(re.getInt(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6),re.getInt(7),
						re.getInt(8),re.getInt(9),re.getString(10),re.getTimestamp(11));
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
	public List<DD> findByCustomer(String cc) {
		String sql = "select o.id,c.cName,c.cPhone,w.wName,w.Wphone,g.name,o.number,o.price,o.amount,o.reason,o.oTime "+
				"from customer c,waiter w,goods g,orderr o "+
				"where c.cId=o.cId and w.wId=o.wId and g.gId=o.gId and c.cName='"+cc+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<DD> list = new ArrayList<DD>();
			while(re.next()){
				DD c=null;
				c = new DD(re.getInt(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6),re.getInt(7),
						re.getInt(8),re.getInt(9),re.getString(10),re.getTimestamp(11));
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
	public List<DD> findByWaiter(String w) {
		String sql = "select o.id,c.cName,c.cPhone,w.wName,w.Wphone,g.name,o.number,o.price,o.amount,o.reason,o.oTime "+
				"from customer c,waiter w,goods g,orderr o "+
				"where c.cId=o.cId and w.wId=o.wId and g.gId=o.gId and w.wName='"+w+"'";
		Connection conn =  DBUtil.open();
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet re = pstmt.executeQuery();
			List<DD> list = new ArrayList<DD>();
			while(re.next()){
				DD c=null;
				c = new DD(re.getInt(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6),re.getInt(7),
						re.getInt(8),re.getInt(9),re.getString(10),re.getTimestamp(11));
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
