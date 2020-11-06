package by.btslogistics.fklservice.service.flk.read.flkmain.impl;

import by.btslogistics.fklservice.dao.model.flk.model.flkmain.FlkMain;
import by.btslogistics.fklservice.dao.model.flk.repository.flkmain.FlkMainReadRepository;
import by.btslogistics.fklservice.service.flk.read.flkmain.FlkMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlkMainServiceImpl implements FlkMainService {

   private FlkMainReadRepository repository;

   @Autowired
    public FlkMainServiceImpl(FlkMainReadRepository repository) {
        this.repository = repository;
    }

    @Override
    public Boolean isRelationships(Integer idTypeControl) {

        List<FlkMain> byIdTypeControl = findByIdTypeControl(idTypeControl);

        boolean empty = byIdTypeControl.isEmpty();

        return !empty;
    }

    /** Запрашивается первые 2 записи из таблицы FLK_MAIN
     * @param idTypeControl номер вида типа котроля ФЛК
     * @return возвращаем несколько записей, если они есть или пустую коллекцию,
     * если записи отсутствуют.
     */
    private List<FlkMain> findByIdTypeControl(Integer idTypeControl){

        int numberPage = 0;
        int amountPage = 1;

        Pageable pageable = PageRequest.of(numberPage, amountPage);

        List<FlkMain> byIdTypeControl = this.repository.findByIdTypeControl(idTypeControl, pageable);

        return byIdTypeControl;
    }
}
