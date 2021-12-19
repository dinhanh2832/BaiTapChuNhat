package service;

import model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProductService extends IGeneralService<Product>{
    public Page<Product> findAll(Pageable pageable);
}
