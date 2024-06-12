package modeldaoimpl;

import modeldao.SellerDao;
import modelentities.Department;
import modelentities.Seller;

import java.util.List;

public class SellerDaoJDBC implements SellerDao {

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
