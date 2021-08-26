/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1;

public class Book {
    private String nome;
    private String ISBN;
    private Author author;
    private Chapter chapter;
    
    public Book (String nome, String ISBN, Author author, Chapter chapter) {
        this.nome = nome;
        this.ISBN = ISBN;
        this.author = author;
        this.chapter = chapter;
    }

    public void showBook() {
        System.out.println("Nome do livro - " + this.getNome());
        System.out.println("ISBN - " + this.getISBN());
        System.out.println("Autor - " + this.getAuthor().getName());
        System.out.println("Número de Capítulos - " + chapter.getNumber());
        System.out.println("----------------");
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getISBN() {
        return this.ISBN;
    }
    
    public void setISBN (String ISBN) {
        this.ISBN = ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
    
}
