package akimts.iepscf.produit.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

@Data
@EqualsAndHashCode(callSuper = true)
public class BoissonDTO extends RepresentationModel<BoissonDTO> implements ProduitDTO {
    private Object id;
    private String nom;
    private double prix;
}
