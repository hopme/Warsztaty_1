package coderslab.warsztat1.zadanie5;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Connection connect = Jsoup.connect("http://www.onet.pl/");



        try (PrintWriter wr = new PrintWriter("popular_words.txt")) {
            Document document = connect.get();
            Elements links = document.select("span.title");
            for (Element elem : links) {
                System.out.println(elem.text());
                StringTokenizer st = new StringTokenizer(
                        elem.text()," ,\\,.,',?,!,:,"); //p{Punct} - mozna uzyc w zamian - ale w tokenizerze ni emozna wyrazen regularnych uzywac
                while (st.hasMoreTokens()) {
                    wr.println((st.nextToken()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
