package holidays;

import org.jsoup.Jsoup;
import javax.swing.text.Document;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HolidaysParser {

    private Document document;
    private final String url = "https://www.timeanddate.com/calendar/?country=1";
//*[@id="ch1"]/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td[1]/span
// *[@id="ch1"]/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/a
//*[@id="ch1"]/tbody/tr[1]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[1]/span
    private final String selector = "table>tbody>tr>td>table>tbody>tr>td>table>tbody>tr";
    private List<Holiday> holidays = new ArrayList<>();
    public boolean connect(){
        try {
            document = (Document) Jsoup.connect(url).get();
        } catch (IOException e) {
            System.err.println("Check HTTP connection to the url " + url);
            return false;
        }
        return true;
    }

}
