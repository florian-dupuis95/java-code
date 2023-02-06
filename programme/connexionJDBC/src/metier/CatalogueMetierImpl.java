package metier;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CatalogueMetierImpl implements CatalogueMetier {

	@Override
	public List<Client> getAllClients() {
		List<Client> clients = new ArrayList<Client>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_banque","java","java123&*");
			PreparedStatement ps =  conn.prepareStatement("SELECT * FROM client");
			ResultSet rs = ps.executeQuery();			
			
			
			while(rs.next()) {
				Client c = new Client();
				c.setIdClient(rs.getInt("ID"));
				c.setNomClient(rs.getString("NOM"));
				c.setPrenomClient(rs.getString("PRENOM"));
				clients.add(c);
			}
			
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return clients;
	}

	@Override
	public List<Client> getClientByKeyword(String mc) {
		List<Client> clients = new ArrayList<Client>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_banque","java","java123&*");
			PreparedStatement ps =  conn.prepareStatement("SELECT * FROM client Where NOM like ?");
			ps.setString(1,"%" +mc+ "%");
			ResultSet rs = ps.executeQuery();			
			
			
			while(rs.next()) {
				Client c = new Client();
				c.setIdClient(rs.getInt("ID"));
				c.setNomClient(rs.getString("NOM"));
				c.setPrenomClient(rs.getString("PRENOM"));
				clients.add(c);
			}
			
			ps.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return clients;
	}

	@Override
	public void addClient(Client c) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_banque","java","java123&*");
			PreparedStatement ps =  conn.prepareStatement("INSERT INTO client (NOM, PRENOM) valuest(?,?)");
			ps.setString(1, "Toto");
			ps.setString(2, "Titi");
			ResultSet rs = ps.executeQuery();
			
			int nb = ps.executeUpdate();
			
			System.out.println("nombre de ligne traité :" + nb);
			ps.close();
			conn.close();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Pilote non trouvé ou verifier la présence dans le classpath");
				
			} catch ( SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
