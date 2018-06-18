import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Aufenthalt {
    private static DateFormat dateFormat = new SimpleDateFormat("DD.MM.yyyy hh:mm:ss");
    private static DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
    private GregorianCalendar von;
    private GregorianCalendar bis;

    Aufenthalt(GregorianCalendar von, GregorianCalendar bis){
        this.von = von;
        this.bis = bis;
    }
    Aufenthalt(int jahr, int monat, int tag, String von, String bis){
        try {
            this.von.setTime(timeFormat.parse(von));
            this.bis.setTime(timeFormat.parse(bis));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.von.set(GregorianCalendar.YEAR, jahr);
        this.bis.set(GregorianCalendar.YEAR, jahr);
        this.von.set(GregorianCalendar.MONTH, monat);
        this.bis.set(GregorianCalendar.MONTH, monat);
        this.von.set(GregorianCalendar.DAY_OF_MONTH, tag);
        this.bis.set(GregorianCalendar.DAY_OF_MONTH, tag);
    }
    Aufenthalt(String von, String bis) {
        try {
            this.von.setTime(dateFormat.parse(von));
            this.bis.setTime(dateFormat.parse(bis));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getJahr(){
        return von.get(GregorianCalendar.YEAR);
    }

    public int getMonat() {
        return von.get(GregorianCalendar.MONTH);
    }

    public int getTag(){
        return von.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public float getStunden(){
        return (bis.getTimeInMillis()-von.getTimeInMillis())/(1000 * 60 * 60);
    }

    public String getTimeVon(){
        return  timeFormat.format(von);
    }

    public String getTimeBis(){
        return  timeFormat.format(bis);
    }

    public String getVon() {
        return dateFormat.format(von);
    }

    public String getBis() {
        return dateFormat.format(bis);
    }
}