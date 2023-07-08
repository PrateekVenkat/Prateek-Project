package dao;
import java.sql.*;

import connectionManager.ConnectionManager;
import model.Product;
public class ProductDAO {
	public void addProduct(Product product)throws ClassNotFoundException,SQLException
	{
		ConnectionManager conn=new ConnectionManager();
		Connection con=conn.establishConnection();
		
		String sql="insert into product(productId,productName,minSellQuantity,price,quantity)values(?,?,?,?,?))";
				
				PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,product.getProductId());
		ps.setString(2,product.getPoductName());
		ps.setInt(3,product.getMinSellQuantity());
		ps.setInt(4,product.getPrice());
		ps.setInt(5,product.getQuantity());
		
		conn.closeConnection();
	
	}
	
	public void display()throws ClassNotFoundException,SQLException
	{
		ConnectionManager conn= new ConnectionManager();
		Connection con=conn.establishConnection();
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from product");
		
		while(rs.next())
		{
			System.out.println("_________________________________");
			System.out.println(rs.getInt("productId")+"|"+rs.getString("productName")+"|"+rs.getInt("minSell_Quantity")+"|"+rs.getInt("price")+"|"+rs.getInt("quantity"));
			
		}
		conn.closeConnection();
	}

}
