package com.mark;

import com.mark.Controller.BookDaoImpl;
import com.mark.DaoInterface.BookDao;
import com.mark.model.Books;

import java.sql.SQLException;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        By using the saveBook (List<Books> BookList) method, let's add a few records in the database.
        Add the below code in AccessBook class.
         */

        BookDao bookDao = new BookDaoImpl();
//        System.out.println("----------inserting book records-------");
//
//        ArrayList<Books> bookList = new ArrayList<Books>();
//
//        Books b1 = new Books();
//        b1.setIsbn(120);
//        b1.setBookName("Java Book");
//        bookList.add(b1);
//
//        Books b2 = new Books();
//        b2.setIsbn(300);
//        b2.setBookName("Python Book");
//        bookList.add(b2);
//
//        Books b3 = new Books();
//        b3.setIsbn(365);
//        b3.setBookName("JavaScript Book");
//        bookList.add(b3);
//
//        Books b4 = new Books();
//        b4.setIsbn(256);
//        b4.setBookName("SQL Book");
//        bookList.add(b4);
//
//        bookDao.saveBook(bookList);

//        System.out.println("----------Book information is updating-------");
//
//        Books bookUpdating  = new Books();
//        bookUpdating.setIsbn(100);
//        bookUpdating.setBookName("Algorithm Book");
//        boolean result = bookDao.updateBook(bookUpdating,6);
//        System.out.println(result);

//        System.out.println("----------Display List of All Books-------");
//
//        try{
//            for (Books cc : bookDao.getAllBooks()){
//                int ISBN = cc.getIsbn();
//                String bookName = cc.getBookName();
//                System.out.println("=========================");
//                System.out.println("ISBN: " + ISBN + "|"+" Book Name: " + bookName);
//            }
//
//        }catch (ClassNotFoundException cnfe){
//            cnfe.printStackTrace();
//        }catch (SQLException sqle){
//            sqle.printStackTrace();
//        }

//        System.out.println("----------Deleting All Books-------");
//
//       boolean a = bookDao.deleteBook(1);
//        if(a == true){
//            System.out.println("Book deleted successfully");
//        }
//        else {
//            System.out.println("Book deletion failed");
//        }
//
//        boolean b = bookDao.deleteBook(2);
//        if(b == true){
//            System.out.println("Book deleted successfully");
//        }
//        else {
//            System.out.println("Book deletion failed");
//        }
//
//        boolean c = bookDao.deleteBook(3);
//        if(c == true){
//            System.out.println("Book deleted successfully");
//        }
//        else {
//            System.out.println("Book deletion failed");
//        }
//
//        boolean d = bookDao.deleteBook(4);
//        if(d == true){
//            System.out.println("Book deleted successfully");
//        }
//        else {
//            System.out.println("Book deletion failed");
//        }

    }
}