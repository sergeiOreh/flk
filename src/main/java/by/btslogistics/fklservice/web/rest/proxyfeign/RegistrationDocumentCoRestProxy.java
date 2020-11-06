package by.btslogistics.fklservice.web.rest.proxyfeign;

import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "${co.service.name}", url = "${co.service.path}")
public interface RegistrationDocumentCoRestProxy {

    String URL_TO_REGISTER_SERVICE = "registration/save/messagelog";

    @PostMapping(URL_TO_REGISTER_SERVICE)
    ResponseEntity<Object> registerDocumentCo(@RequestBody MessageLogDto dto);

}
