package taskClass17;

public class Book {
    String name;
    double price;
    String author;
    Book(String name,double price){
        this.name=name;
        this.price=price;
    }
    Book(String name,double price,String author){
        this(name,price);
        this.author=author;



    }
    void info(){
        System.out.println("the book name is "+name+" the price is "+price+" the author is "+author);

    }

    public static void main(String[] args) {
        Book book=new Book("Java",23.45,"Asghar");
        book.info();
    }
}
