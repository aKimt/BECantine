package iepscf.akimts.commande.mapper;

import iepscf.akimts.commande.models.dto.CommandeDTO;
import iepscf.akimts.commande.models.form.CommandeForm;
import iepscf.akimts.data.entity.Commande;

import java.util.stream.Collectors;

public final class CommandeMapper {

    // no instance for this class
    private CommandeMapper(){}

    /**
     * mappe une form de commande vers la forme entité
     * Ignore:
     * <ul>
     *     <li>nom</li>
     *     <li>prenom</li>
     *     <li>bur</li>
     * </ul>
     *
     * @param form, un CommandeForm représentant les infos nécessaires
     *              à la création d'une commande
     * @return une entité Commande pouvant être placée en persistance
     */
    public static Commande formToEntity(CommandeForm form){
        if(form == null)
            return null;

        Commande cmd = new Commande();

        cmd.setUser(form.getUsername());
        cmd.setDate(form.getDate());

        cmd.setBoissons(form.getBoissons());
        cmd.setSandwich(form.getSandwiches());
        cmd.setPlats(form.getPlatChauds());

        return cmd;
    }


}
