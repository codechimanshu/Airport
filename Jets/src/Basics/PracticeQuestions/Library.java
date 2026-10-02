package Basics.PracticeQuestions;


class CollegeLibrary {
    String[] Book;
    int count;

    CollegeLibrary(){
        Book = new String[100];
        int count = 0;
    }

    void AddBook(String book){
        Book[count] = book;
        count++;
        System.out.println(book + " book has been added to the Library");
    }

    void ShowBooks(){
        System.out.println("Books in the Library :");
        for(String Book:Book ){
            if(Book == null){
                continue;
            }
            System.out.println("* "+Book);
        }
    }

    void IssueBook(String book){
        for(int b=0;b<Book.length;b++){
            if(Book[b]==book){
                System.out.println("Book has been Issued");
                Book[b]=null;
                return;
            }
        }
        System.out.println("The Book doesn't exist in the Library");
    }
}

class Library{
    static void main() {
        CollegeLibrary L1 = new CollegeLibrary();
        L1.AddBook("The Art of Being Alone");
        L1.AddBook("Java Tutorial");
        L1.AddBook("Dumb ways to Die");
        L1.ShowBooks();
        L1.IssueBook("The Art of Being Alone");
        L1.ShowBooks();
    }
}
