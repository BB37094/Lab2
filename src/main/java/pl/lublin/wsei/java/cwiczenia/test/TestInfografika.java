package pl.lublin.wsei.java.cwiczenia.test;

import pl.lublin.wsei.java.cwiczenia.Infografika;

public class TestInfografika {

    public static void main(String[] args) {
    String exItem = "\t\t<item>\n" +
            "\t\t\t<title><![CDATA[Infografika - Koniunktura gospodarcza w kwietniu 2022 r.]]></title>\n" +
            "\t\t\t<pubDate><![CDATA[Fri, 22 Apr 2022 13:30:00 +0200]]></pubDate>\n" +
            "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-kwietniu-2022-r-,38,70.html</link>\n" +
            "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-koniunktura-gospodarcza-w-kwietniu-2022-r-,38,70.html</guid>\n" +
            "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/38/70/1/infografika_koniunktura_gospodarcza_03_2022.png\" type=\"image/png\" width=\"2362\" height=\"4548\">\n" +
            "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
            "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/70/1/infografika_koniunktura_gospodarcza_03_2022,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
            "\t\t\t</media:content>\n" +
            "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/38/70/1/infografika_koniunktura_gospodarcza_03_2022,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
            "\t\t</item>";

        Infografika Test = new Infografika(exItem);
        System.out.println("Tytuł: " + Test.tytul);
        System.out.println("Adres strony: "+Test.adresStrony);
        System.out.println("Adres grafiki: "+Test.adresGrafiki);
        System.out.println("Adres miniaturki: "+Test.adresMiniaturki);
        System.out.println("Rozmiary: " + Test.szerokosc + "x" + Test.wysokosc);


    }

}



