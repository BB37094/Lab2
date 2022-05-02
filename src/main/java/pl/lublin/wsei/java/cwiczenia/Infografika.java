package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    public String tytul, adresStrony, adresGrafiki, adresMiniaturki;
    public int wysokosc, szerokosc;

    public Infografika(String tekst) {

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher(tekst);
        if (m.find())
            tytul = m.group(1);
        else
            tytul = "";

        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher(tekst);
        if (m.find())
            adresStrony = m.group(1);
        else
            adresStrony = "";

        pat = Pattern.compile("content url=\"(.*)\" type");
        m = pat.matcher(tekst);
        if (m.find())
            adresGrafiki = m.group(1);
        else
            adresGrafiki = "";

        pat = Pattern.compile("thumbnail url=\"(.*)\" />");
        m = pat.matcher(tekst);
        if (m.find())
            adresMiniaturki = m.group(1);
        else
            adresMiniaturki = "";

        pat = Pattern.compile("width=\"(.*)\" height");
        m = pat.matcher(tekst);
        if (m.find())
            szerokosc = Integer.parseInt(m.group(1));
        else
            szerokosc = 0;

        pat = Pattern.compile("height=\"(.*)\">");
        m = pat.matcher(tekst);
        if (m.find())
            wysokosc = Integer.parseInt(m.group(1));
        else
            wysokosc = 0;
    }

    public void print() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Adres strony: "+ adresStrony);
        System.out.println("Adres grafiki: "+ adresGrafiki);
        System.out.println("Adres miniaturki: "+ adresMiniaturki);
        System.out.println("Rozmiary: " +  szerokosc + "x" +  wysokosc);
    }
}
