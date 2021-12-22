package holidays;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Holiday {
    private Date date;
    private String name;
    private String desc;

    public String toString (){
        DateFormat dateFormat = new SimpleDateFormat("dd.MM");
        String sDate = dateFormat.format(date);
        return String.format("date: %s, name: %s, desc:%s",sDate,name,desc);
    }

    public Holiday(Date date, String name, String desc) {
        this.date = date;
        this.name = name;
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
