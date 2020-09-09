public class Book {
    private String author;
    private String title;
    private int year;
    private String publisher;
    private int number;

    public Book(String a, String t, int y, String p, int n)
    {
        author = a;
        title = t;
        year = y;
        publisher = p;
        number = n;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    public void setNumber(int number)
    {
        this.number = number;
    }
    public String getAuthor(String author)
    {
        return author;
    }
    public String getTitle(String title)
    {
        return title;
    }
    public int getYear(int year)
    {
        return year;
    }
    public String getPublisher(String publisher)
    {
        return publisher;
    }
    public int getNumber(int number)
    {
        return number;
    }
    public String toString() {
        return this.author+", " +this.title+", "+ this.year+", " + this.publisher+", " +this.number;

    }
}
