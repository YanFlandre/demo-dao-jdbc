package modeldao;

import modelentities.Department;
import modelentities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Seller> findAll();
}
