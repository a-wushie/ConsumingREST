package com.adaidam.ConsumingREST;

import java.util.List;

public class Results {

    private static String url;
    private static String publication_dt;
    private static String byline;
    private static String book_title;
    private static String book_author;
    private static String summary;
    private static String uuid;
    private static String uri;
    private static List<String> isbn13;

    public Results() {
    }

    public static String getUrl() {
        return url;
    }

    public static String getPublication_dt() {
        return publication_dt;
    }

    public static String getByline() {
        return byline;
    }

    public static String getBook_title() {
        return book_title;
    }

    public static String getBook_author() {
        return book_author;
    }

    public static String getSummary() {
        return summary;
    }

    public static String getUuid() {
        return uuid;
    }

    public static String getUri() {
        return uri;
    }

    public static List<String> getIsbn13() {
        return isbn13;
    }
}
