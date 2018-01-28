package Product;

import Enums.BookFormat;
import Enums.Condition;
import Enums.Department;
import Enums.ProductState;
import Person.Individual;
import Person.Seller;

import java.text.ParseException;
import java.util.ArrayList;

public class Book extends Product {

    BookFormat format;
    ProductState state;

    public Book(String name, BookFormat format, String releaseDate, Department department, double rrp, double price, Condition condition) throws ParseException {
        super(name, releaseDate, department, rrp, price, condition);
        this.format = format;
    }

    public BookFormat getFormat() {
        return format;
    }

    public ProductState getProductState(){
        return format.getState();
    }
}

