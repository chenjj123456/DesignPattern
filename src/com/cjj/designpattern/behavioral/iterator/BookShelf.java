package com.cjj.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjj on 2018/12/19
 */
public class BookShelf implements Aggregate {
    private List<Book> books;
    public BookShelf(){
        this.books=new ArrayList();
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        this.books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
