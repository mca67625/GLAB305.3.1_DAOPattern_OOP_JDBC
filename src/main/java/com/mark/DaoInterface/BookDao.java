package com.mark.DaoInterface;

import com.mark.model.Books;

import java.sql.SQLException;
import java.util.List;

public interface BookDao {

    /**
     * This is the method to be used to list down all the records from the books table
     */
    List<Books> getAllBooks() throws ClassNotFoundException, SQLException;

    /**
     * This method is used to create a record in the books table
     */
    void saveBook(List<Books> BookList);

    /**
     * THis is the method to be used to delete a record from the Student table corresponding to a passed books id
     */
    boolean deleteBook(int id);

    /**
     * This is the method to be used to update a record into the books table
     */
    boolean updateBook(Books Book, int id);
}
