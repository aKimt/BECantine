package iepscf.akimts.commande.service;

import iepscf.akimts.commande.clients.CustomerClient;
import iepscf.akimts.commande.mapper.CommandeMapper;
import iepscf.akimts.commande.models.form.CommandeForm;
import iepscf.akimts.commande.repository.CommandeRepository;
import iepscf.akimts.data.entity.Commande;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class CommandeServiceImpl implements CommandeService {

    private final CommandeRepository repository;
    private final CustomerClient customerClient;

    public CommandeServiceImpl(CommandeRepository repository, CustomerClient customerClient) {
        this.repository = repository;
        this.customerClient = customerClient;
    }

    @Override
    public void createOrder(CommandeForm form) {

        Commande cmd = CommandeMapper.formToEntity(form);

        // TODO Object -> ClientInfo
//        Object user = customerClient.getCustormByUsername(form.getUsername());
//        cmd.setBur(user.getBur());
//        cmd.setPrenom(user.getPrenom());
//        cmd.setNom(user.getNom());

        repository.save(cmd);

    }
}
