package iepscf.akimts.commande.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "iepscf.akimts.data.entity"
})
public class BeanConfig {
}
