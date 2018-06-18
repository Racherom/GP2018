import java.util.List;

public interface MitgliedInterface {
    String getVorname();
    void setVorame(String vorname);
    String getNachname();
    void setNachame(String vorname);
    int getID();
    String getEmail();
    void setEmail(String email);
    void setPW(String pw);
    List<Aufenthalt> getAufenthalte();
}
