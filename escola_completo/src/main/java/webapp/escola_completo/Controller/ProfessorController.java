package webapp.escola_completo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import webapp.escola_completo.Model.Professor;
import webapp.escola_completo.Repository.ProfessorRepository;
import webapp.escola_completo.Repository.VerificaCadastroAdmRepository;



@Controller
public class ProfessorController {
    @Autowired
    private ProfessorRepository pr;

    @PostMapping("/cad-professor")
    public String postCadProf(Professor prof) {

        pr.save(prof);

        return "redirect:/";


    }

}