package com.mark.Controller;

import com.mark.DaoInterface.BookDao;
import com.mark.DaoInterface.ConnectionDAO;
import com.mark.model.Books;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Having defined our BookDao interface, let’s implement it. BookDaoImpl class
 * will be our business layer.
 * Our BookDaoImpl class supports select, insert, update, and delete operations.
 * The business layer remains unaware of the actual persistence logic.
 */
public class BookDaoImpl implements BookDao {

    @Override
    public List<Books> getAllBooks(){
       try {
           Connection con = ConnectionDAO.getConnection();
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("select * from books");
           List<Books> books = new ArrayList<>();

           while (rs.next()) {
               Books book = new Books();
               book.setIsbn(rs.getInt("isbn"));
               book.setBookName(rs.getString("bookName"));
               books.add(book);
           }
           return books;
       }catch (SQLException e) {
           e.printStackTrace();
           System.err.format("SQL State: %s\n%s", e.getSQLState(),e.getMessage());
       }catch(ClassNotFoundException e){
           e.printStackTrace();
       }
       return null;
    }

    @Override
    public void saveBook(List<Books> BookList) {
        try{
            Connection con = ConnectionDAO.getConnection();
            for(Books b: BookList){
                String sqlQuery ="insert into books(isbn,bookName) values(?,?)";
                PreparedStatement prepStmt = con.prepareStatement(sqlQuery);
                prepStmt.setInt(1, b.getIsbn());
                prepStmt.setString(2, b.getBookName());
                int rowsAffected = prepStmt.executeUpdate();
                System.out.println("Rows affected: " + rowsAffected);
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch (SQLException s){
            throw new RuntimeException(s);
        }
    }

    @Override
    public boolean deleteBook(int id) {
        try{
            Connection connection= ConnectionDAO.getConnection();
            String sqlQuery ="delete from books where id=?";
            PreparedStatement ps = connection.prepareStatement(sqlQuery);
            ps.setInt(1, id);
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected>0){
                return true;
            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException s){
            throw new RuntimeException(s);
        }
        return false;
    }

    @Override
    public boolean updateBook(Books Book, int id) {
        try{
            Connection connection= ConnectionDAO.getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE  books SET isbn = ?, bookName = ? WHERE id = ?");
            ps.setInt(1,Book.getIsbn());
            ps.setString(2,Book.getBookName());
            ps.setInt(3,id);
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected>0){
                return true;
            }

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException s){
            s.printStackTrace();
            System.err.format("SQL State: %s\n%s", s.getSQLState(),s.getMessage());
        }
        return false;
    }
}
