package khaoula.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import khaoula.example.demo.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
