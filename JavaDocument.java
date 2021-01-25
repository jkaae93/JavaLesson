package project;
/*
* Assign002 - 2
*/

public class JavaDocument extends Document {
    
    int page;
    String title;
    String author;
    
    
    public JavaDocument(int page, String title, String author) {
        this.page = page;
        this.title = title;
        this.author = author;
    }
    
    public int getPage() {
        return page;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
}