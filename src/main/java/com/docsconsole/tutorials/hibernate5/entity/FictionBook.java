package com.docsconsole.tutorials.hibernate5.entity;


import javax.persistence.*;


@Entity
@PrimaryKeyJoinColumn(name="BOOK_ID")
@Table(name="fiction_book2")
public class FictionBook extends Book {


    @Column(name = "BOOK_PRICE")
    private Double bookPrice;

    @Column(name = "BOOK_TYPE")
    private String bookType;

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}