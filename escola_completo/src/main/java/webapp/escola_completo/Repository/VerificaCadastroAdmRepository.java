package webapp.escola_completo.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_completo.Model.VerificaCadastroAdm;
import java.util.List;




public interface VerificaCadastroAdmRepository extends CrudRepository<VerificaCadastroAdm, String>{
    List<VerificaCadastroAdm> findByCpf(String cpf);
    boolean existsByCpf (String cpf);
}
