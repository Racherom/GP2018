import java.sql.*;

public class MitgiedDAOMySQL implements MitgliedDAO {
    static final String JDBC_DRIVER = "con.mysql.jdbc.Driver";

    private Connection conn;
    MitgiedDAOMySQL() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/EMP");
        } catch (SQLException se){
            se.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {

        }
    }


    @Override
    public Mitglied getMitglied(String email, String pw) {
        Mitglied m;
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Mitglieder WHERE Email = ? AND PWHash = ? ");
            stmt.setString(1, email);
            stmt.setString(2, Mitglied.hashPW(pw));
            ResultSet rs = stmt.executeQuery();
            m = new Mitglied(rs.getInt("id"));

        } catch (SQLException se){
            se.printStackTrace();
        }
        return m;
    }

    @Override
    public Mitglied getMitglied(int MitgliedID) {
        return null;
    }

    @Override
    public void updateMitglied(Mitglied m) {

    }

    @Override
    public void deleteMitglied(Mitglied m) {
    }
}
