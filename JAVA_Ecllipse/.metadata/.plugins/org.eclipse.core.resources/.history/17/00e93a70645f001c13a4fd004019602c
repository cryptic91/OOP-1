package sakir1;

class User {
    public String email;
    public String password;
    public User(String email, String password){
         this.email = email;
         this.password=  password;
    }
}

class Book {
    public String bookId;
    public String bookName;

    public Book(String bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
    
}

interface libraryFunctions{
    public void bookInfo(Book b);
    public void bookBlock(Book b);
    public Boolean Logon(User user);
    public void accuntUpdate(String email,String password,User user);  
}

class Library implements libraryFunctions{
    public void bookInfo(Book b){
        System.out.println("Book informations");
    }
    public void bookBlock(Book b) {
        System.out.println("Book informations");
    }
    public Boolean Logon(User user) {
        if(user.email.equals("admin@admin.com") && user.password.equals("admin")){
            return true;
        }else {
            return false;
        }
    }
    public void accuntUpdate(String email,String password,User user){
        user.email = email;
        user.password = password;
    }
}
