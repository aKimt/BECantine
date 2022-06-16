package iepscf.akimts.commande.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("customer-service")
public interface CustomerClient {

    // TODO Object -> ClientInfo
    @GetMapping(path = "/by_username", params = "username")
    Object getCustormByUsername(@RequestParam String username);

}
