package br.com.coutin.apirest_senai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.coutin.apirest_senai.Model.Responsavel;
import br.com.coutin.apirest_senai.Repository.ReponsavelRepository;

@Controller
public class IndexController {

    ReponsavelRepository rr;

    @GetMapping("/home")
    public ModelAndView indexRoute() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

     @PostMapping("/home")
    public ModelAndView acessoResponsavel(@RequestBody Responsavel responsavel) {
        ModelAndView mv = new ModelAndView("interna_responsavel");
        boolean existe = rr.existsById(responsavel.getId());
     if (existe) {
            
        } else
            mv.setViewName("index");

        return mv;
     }

    //tela de acesso ao administrador
    // @PostMapping("acesso-adm")
    // public ModelAndView acessoAdmLogin(@RequestParam String cpf,
    //         @RequestParam String senha,
    //         RedirectAttributes attributes) {
    //     ModelAndView mv = new ModelAndView("redirect:/interna-adm");// página interna de acesso
    //     try {
    //         // boolean acessoCPF = cpf.equals(ar.findByCpf(cpf).getCpf());
    //         boolean acessoCPF = rr.existsById(cpf);
    //         boolean acessoSenha = senha.equals(rr.findByCpf(cpf).getSenha());

    //         if (acessoCPF && acessoSenha) {
    //             String mensagem = "Login Realizado com sucesso";
    //             System.out.println(mensagem);
    //             acessoInternoAdm = true;
    //             mv.addObject("msg", mensagem);
    //             mv.addObject("classe", "verde");
    //         } else {
    //             String mensagem = "Login Não Efetuado";
    //             System.out.println(mensagem);
    //             attributes.addFlashAttribute("msg", mensagem);
    //             attributes.addFlashAttribute("classe", "vermelho");
    //             mv.setViewName("redirect:/login-adm");
    //         }
            
    //     } catch (Exception e) {
    //         String mensagem = "Login Não Efetuado";
    //         System.out.println(mensagem);
    //         attributes.addFlashAttribute("msg", mensagem);
    //         attributes.addFlashAttribute("classe", "vermelho");
    //         mv.setViewName("redirect:/login-adm");
    //     }
    //     return mv;
    // }

}
