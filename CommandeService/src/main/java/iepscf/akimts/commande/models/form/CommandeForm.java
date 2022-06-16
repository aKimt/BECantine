package iepscf.akimts.commande.models.form;


import akimts.iepscf.produit.dto.BoissonDTO;
import akimts.iepscf.produit.dto.PlatChaudDTO;
import akimts.iepscf.produit.dto.SandwichDTO;
import iepscf.akimts.data.entity.Commande;
import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Collection;

@Data
public class CommandeForm {

    @NotNull
    private String username;
    private String bureau;
    @Future
    @NotNull
    private LocalDate date;
    private Collection<Commande.CmdProduit> platChauds;
    private Collection<Commande.CmdSandwich> sandwiches;
    private Collection<Commande.CmdProduit> boissons;

}
