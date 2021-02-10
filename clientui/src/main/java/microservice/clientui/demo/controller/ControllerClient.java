package microservice.clientui.demo.controller;

import microservice.clientui.demo.beans.ProduitBean;
import microservice.clientui.demo.proxies.MicroserviceProduitProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ControllerClient {

    @Autowired
    private MicroserviceProduitProxy.MicroserviceProduitsProxy microserviceProductProxy;


    @RequestMapping("/")
    public String index(Model model){

        List<ProduitBean> produits =  microserviceProductProxy.listeDesProduits();

        model.addAttribute("produits", produits);

        return "Index";
    }

    @RequestMapping("/detail-produit/{id}")
    public String ficheProduit(@PathVariable int id, Model model){

        ProduitBean produit = microserviceProductProxy.recupererUnProduit(id);

        model.addAttribute("produit", produit);

        return "detail-produit";
    }


}
