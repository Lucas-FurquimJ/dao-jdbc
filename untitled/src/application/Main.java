package application;


import jdbc.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        SellerDao sellerdao = DaoFactory.createSellerDao();


       List<Seller> list = sellerdao.findByDepartmentId(new Department(2,null));

        list = sellerdao.findAll();
        for(Seller obj : list) {
            System.out.println(obj);
        }
    }
}