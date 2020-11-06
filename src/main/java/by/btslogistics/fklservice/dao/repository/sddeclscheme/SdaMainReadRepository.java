package by.btslogistics.fklservice.dao.repository.sddeclscheme;


import by.btslogistics.fklservice.dao.model.sddeclscheme.SdaMain;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SdaMainReadRepository extends CrudRepository<SdaMain, String> {

    SdaMain findByNomPrin(String numPrin);

    Optional<SdaMain> findByToMessagesLogId(String id);
}
