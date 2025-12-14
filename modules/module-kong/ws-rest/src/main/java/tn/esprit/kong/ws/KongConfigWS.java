package tn.esprit.kong.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/kong")
public class KongConfigWS {

    // Endpoint de test pour vérifier que Kong est UP
    @GetMapping("/health")
    public String health() {
        return "KONG UP";
    }

    // Optional: vérifier l'état des logs
    @GetMapping("/logs")
    public String logsStatus() {
        return "Logs are being recorded in /usr/local/kong/logs/kong_requests.log";
    }
}
