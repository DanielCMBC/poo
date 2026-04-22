import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    Book book = new Book(String title, String author, int year);

    @Override
    public String toString() {
        return String.format("Título: %s, Autor: %s, Ano: %d", title, author, year);
    }
    public class PrintBook extends Book {
        public PrintBook(String title, String author, int year, String publisher, String isbn) {
            super(title, author, year);
            this.publisher = publisher;
            this.isbn = isbn;
        }
        private String publisher;
        private String isbn;

        public String getPublisher() {return publisher;}

        public void setPublisher(String publisher) {this.publisher = publisher;}
        
        public String getIsbn() {return isbn;}
        public void setIsbn(String isbn) {this.isbn = isbn;}

        PrintBook printBook = new PrintBook(String title, String author, int year, String publisher, String isbn);

        @Override
        public String toString() {
            return super.toString() + ", Editora: " + publisher + ", ISBN: " + isbn;
        }
    }
    public class AudioBook extends Book {
        public AudioBook(String title, String author, int year, double fileSizeInMB, int playLengthInMinutes, String narrator){
            super(title, author, year);
            this.fileSizeInMB = fileSizeInMB;
            this.playLengthInMinutes = playLengthInMinutes;
            this.narrator = narrator;
        }
        private double fileSizeInMB;
        private int playLengthInMinutes;
        private String narrator;

        public double getFileSizeInMB() {return fileSizeInMB;}
        public void setFileSizeInMB(double fileSizeInMB) {this.fileSizeInMB = fileSizeInMB;}

        public int getPlayLengthInMinutes() {return playLengthInMinutes;}
        public void setPlayLengthInMinutes(int playLengthInMinutes) {this.playLengthInMinutes = playLengthInMinutes;}

        public String getNarrator() {return narrator;}
        public void setNarrator(String narrator) {this.narrator = narrator;}

        AudioBook audioBook = new AudioBook(String title, String author, int year, double fileSizeInMB, int playLengthInMinutes, String narrator);

        @Override
        public String toString() {
            return super.toString() + ", Tamanho do arquivo: " + fileSizeInMB + " MB, Duração: " + playLengthInMinutes + " minutos, Narrador: " + narrator;
        }
    }

    public class BookApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha o tipo de livro:");
            String bookType = scanner.nextLine();

            if (bookType.equalsIgnoreCase("print")) {
                printBook();
            } else if (bookType.equalsIgnoreCase("audio")) {
                audioBook();
            } else {
                System.out.println("Tipo de livro inválido.");
            }

            scanner.close();
    
            System.out.print("Digite o título do livro: ");
            String title = scanner.nextLine();
            System.out.print("Digite o autor do livro: ");
            String author = scanner.nextLine();
            System.out.print("Digite o ano de publicação do livro: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(title, author, year);
            System.out.println("Livro criado: " + book);
        }
    }
}