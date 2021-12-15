package Persons;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class PersonParser {
    public static void main(String[] args) {
        String url = "https://veteran-vov.vagsh.mil.ru/vov";
        String selector = "div>ul>li>a[href]";
        try {
            Document document = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
