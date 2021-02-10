package microservice.clientui.demo.proxies;

import microservice.clientui.demo.beans.ProduitBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class MicroserviceProduitProxy {
    @FeignClient(name = "microservice-produit", url = "localhost:9696")
    public interface MicroserviceProduitsProxy {
        @GetMapping(value = "/Produits")
        List<ProduitBean> listeDesProduits();

        @GetMapping(value = "/Produits/{id}")
        ProduitBean recupererUnProduit(@PathVariable("id") int id);
    }
}
