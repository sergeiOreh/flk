package by.btslogistics.fklservice.web.rest.proxyfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${dt.kdt.dts.service.name}", url = "${dt.kdt.dts.service.path}")
public interface RegistrationDocumentDtKdtDtsRestProxy {

    String URL_TO_REGISTER_SERVICE = "/register_document/{id}";

    @GetMapping(URL_TO_REGISTER_SERVICE)
    ResponseEntity<Object> registerDocument(@PathVariable String id);

}
