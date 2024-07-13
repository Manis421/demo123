package mani.com.example.demo123.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mani.com.example.demo123.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
