package webapp.escola_completo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import webapp.escola_completo.Model.Administrador;
import webapp.escola_completo.Repository.AdministradorRepository;
import webapp.escola_completo.Repository.VerificaCadastroAdmRepository;


@Controller
public class AdministradorController {

    @Autowired
    private AdministradorRepository ar;

    @Autowired
    private VerificaCadastroAdmRepository vcar;
    
    
    @PostMapping("cadastrar-adm")
    public ModelAndView cadastroAdmBD(Administrador adm) {

        boolean verificaCpf = vcar.existsById(adm.getCpf()) ;

        ModelAndView mv = new ModelAndView("login/login-adm");

        if(verificaCpf){
            ar.save(adm);
            String mensagem = "Cadastro Realizado com sucesso";
            System.out.println(mensagem);
            mv.addObject("msg", mensagem);
            mv.addObject("classe", "verde");
        }else{
            String mensagem = "Cadastro Não Realizado";
            System.out.println(mensagem);
            mv.addObject("msg", mensagem);
            mv.addObject("classe", "vermelho");
        }
         
        return mv;
    }
    
}
