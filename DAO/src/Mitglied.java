import java.util.*;

public class Mitglied implements MitgliedInterface{
    private int id;
    private String vorname;
    private String nachname;
    private String email;
    private List<Aufenthalt> aufenthalte;
    private String pwHash;

    public Mitglied(int id, String vorname, String nachname, String email, List<Aufenthalt> aufenthalte, String pwHash) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
        this.aufenthalte = aufenthalte;
        this.pwHash = pwHash;
    }

    @Override
    public String getVorname() {
        return vorname;
    }

    @Override
    public void setVorame(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String getNachname() {
        return nachname;
    }

    @Override
    public void setNachame(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setPW(String pw){
        this.pwHash = hashPW(pw);
    }

    @Override
    public List<Aufenthalt> getAufenthalte() {
        return aufenthalte;
    }
    public static String hashPW(String pw){
        return pw;
    }

    public void addAufenhalt( Aufenthalt a){
        aufenthalte.add(a);
    }
}
