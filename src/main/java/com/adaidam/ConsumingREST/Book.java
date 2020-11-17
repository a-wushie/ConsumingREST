package com.adaidam.ConsumingREST;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

    private static String status;
    private static String copyright;
    private static long num_result;
    private ArrayList<Results> results;

    public Book(){};



    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        Book.status = status;
    }

    public static String getCopyright() {
        return copyright;
    }

    public static void setCopyright(String copyright) {
        Book.copyright = copyright;
    }

    public static long getNum_result() {
        return num_result;
    }

    public static void setNum_result(long num_result) {
        Book.num_result = num_result;
    }

    public ArrayList<Results> getResults() {
        return results;
    }

    public void setResults(ArrayList<Results> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Book{" +
                "status='" + status + '\'' +
                "copyright='" + copyright + '\'' +
                "num_result='" + num_result + '\'' +
                ", result=" + results +
                '}';
    }
}
