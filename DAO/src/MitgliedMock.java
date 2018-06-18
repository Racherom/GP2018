import org.omg.CosNaming.NameComponentHelper;

import java.util.*;

public class MitgliedMock implements MitgliedInterface{
    private int id;
    private String vorname;
    private String nachname;
    private String email;
    private List<Aufenthalt> aufenthalte;
    private String pw;


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
        this.pw = pw;
    }

    @Override
    public List<Aufenthalt> getAufenthalte() {
        return aufenthalte;
    }
}
