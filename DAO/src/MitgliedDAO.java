
public interface MitgliedDAO {
    public MitgliedInterface getMitglied(String email, String pw);
    public MitgliedInterface getMitglied(int MitgliedID);
    public void updateMitglied(Mitglied m);
    public void deleteMitglied(Mitglied m);
}
