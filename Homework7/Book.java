package com.company.denis.Homework7;

public class Book {


    private String name;
    private String author;
    private String publisher;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 10) {
            this.price = price;
        }else{
            System.out.println("Недопустимая цена, должна быть больше 10");
        }
    }

    public Book() {

    }

    public Book(String name, String author, String publisher, double price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.setPrice(price);
    }

    public void information() {
        System.out.println("Название книги:" + this.getName());
        System.out.println("Автор" + this.getAuthor());
        System.out.println("Издатель" + publisher);
        System.out.println("Цена" + price);
    }

    public static class Main {
        public static void main(String[] args) {
            Book b1 = new Book("Мастер и Маргарита", "Михаил Булгаков", "СССР книга", 9.0);
            b1.information();

            System.out.println("--------------------");

            Book b2 = new Book("Поход за вином", "Чарльз Буковски", "Лондонград", 55.5);
            b2.information();
        }
    }
}
