package com.test.demo.entities;
import java.util.LinkedList;

public class VacansiesAnswer
{
    private LinkedList<Vacancy> items;
    private int found;
    private Integer pages;
    private Integer per_page;
    private Integer page;
    private String clusters;
    private String arguments;
    private Object alternate_url;

    public LinkedList<Vacancy> getItems() {
        return items;
    }

    public void setItems(LinkedList<Vacancy> items) {
        this.items = items;
    }

    public Integer getFound() {
        return found;
    }

    public void setFound(Integer found) {
        this.found = found;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getClusters() {
        return clusters;
    }

    public void setClusters(String clusters) {
        this.clusters = clusters;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public Object getAlternate_url() {
        return alternate_url;
    }

    public void setAlternate_url(Object alternate_url) {
        this.alternate_url = alternate_url;
    }
}
