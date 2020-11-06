package by.btslogistics.fklservice.web.rest.proxyfeign;

import by.btslogistics.fklservice.service.flk.dto.messageslog.MessageLogDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "${rs.service.name}", url = "${rs.service.path}")
public interface RegistrationDocumentRsRestProxy {

    String URL_TO_REGISTER_SERVICE = "registration/save/messagelog";

    @PostMapping(URL_TO_REGISTER_SERVICE)
    ResponseEntity<Object> registerDocumentRs(@RequestBody MessageLogDto dto);

}
