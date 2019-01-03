package com.sanjula.oop.java.tutorials.Practice_Paper_1;

public class Book implements Comparable<Book>{
    private String name;
    private String author;
    private int pageNumber;

    public Book(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public int compareTo(Book book) {
        return(this.pageNumber - book.pageNumber);
    }
}
