package com.adaidam.ConsumingREST;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {

    private String status;
    private String copyright;
    private long num_result;
    private List<Results> results;

    public Book(String status, String copyright, long num_result, List<Results> results) {
        this.status = status;
        this.copyright = copyright;
        this.num_result = num_result;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public long getNum_result() {
        return num_result;
    }

    public void setNum_result(long num_result) {
        this.num_result = num_result;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
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
