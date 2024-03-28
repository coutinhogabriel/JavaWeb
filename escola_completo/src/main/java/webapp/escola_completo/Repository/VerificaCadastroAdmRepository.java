package webapp.escola_completo.Repository;

import org.springframework.data.repository.CrudRepository;

public interface VerificaCadastroAdmRepository extends CrudRepository<VerificaCadastroAdm, String> {
    VerificaCadastro findByCpf(String cpf);
