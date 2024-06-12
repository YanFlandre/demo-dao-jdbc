package application;

import modeldao.DaoFactory;
import modeldao.SellerDao;
import modelentities.Department;
import modelentities.Seller;
import java.util.Date;

public class Program {

    public static void main(String[] args){

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, obj, 3000.0, new Date(), "bob@gmail.com", "Bob");
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(seller);
    }
}
