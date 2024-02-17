class Textbook 
{
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher) 
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public void setTextbookTitle(String title) 
    { 
        this.title = title; 
    }

    public void setTextbookAuthor(String author) 
    { 
        this.author = author; 
    }

    public void setTextbookPublisher(String publisher) 
    { 
        this.publisher = publisher; 
    }


    public String getTextbookTitle() 
    { 
        return title; 
    }

    public String getTextbookAuthor() 
    { 
        return author; 
    }

    public String getTextbookPublisher() 
    { 
        return publisher; 
    }
}

