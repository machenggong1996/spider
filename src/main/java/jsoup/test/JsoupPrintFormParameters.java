package jsoup.test;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupPrintFormParameters {
    public static void main(String[] args) throws IOException {
        //Document doc = Jsoup.parse(new File("e:\\register.html"), "utf-8");
        Document doc = Jsoup.connect("http://www.yiibai.com").get();
        Element loginform = doc.getElementById("yiiba-bottom");

        Elements inputElements = loginform.getElementsByTag("dt");
        for (Element inputElement : inputElements) {
            //String key = inputElement.attr("name");
            //String value = inputElement.attr("value");
            //System.out.println("Param name: " + key + " \nParam value: " + value);
            System.out.println("text : " + inputElement.text());
        }
    }
}