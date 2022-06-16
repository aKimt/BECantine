package akimts.iepscf.produit.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProduitExhaustiveListDTO extends RepresentationModel<ProduitExhaustiveListDTO> {

    private List<BoissonDTO> boissons;
    private List<PlatChaudDTO> platChauds;
    private List<SandwichDTO> sandwiches;

}
