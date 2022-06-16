package akimts.iepscf.produit.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ComposantDTO {

    private String ingredient;
    private double qte;
    private String unite;

}
