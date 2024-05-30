package webapp.escola_completo.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_completo.Model.Materias;


public interface MateriasRepository extends CrudRepository<Materias, Long>{
    // Materias findByIdMateria(long idMateria);
}
