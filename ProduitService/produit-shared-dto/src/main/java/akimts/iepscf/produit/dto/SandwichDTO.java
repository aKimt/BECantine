package akimts.iepscf.produit.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import java.util.Set;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Data
public class SandwichDTO extends RepresentationModel<SandwichDTO> implements ProduitDTO {

    private Object id;
    private String nom;
    private double prix;
    private String description;
    private Set<ComposantDTO> composants;

}
