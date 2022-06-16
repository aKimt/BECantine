package iepscf.akimts.commande.controller;

import iepscf.akimts.commande.models.form.CommandeForm;
import iepscf.akimts.commande.service.CommandeService;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/commande")
public class CommandeController {

    private final CommandeService service;

    public CommandeController(CommandeService service) {
        this.service = service;
    }

    @PreAuthorize("permitAll()")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/confirmer")
    public void confirmer(@Valid @RequestBody CommandeForm form){
        service.createOrder(form);
    }

}
