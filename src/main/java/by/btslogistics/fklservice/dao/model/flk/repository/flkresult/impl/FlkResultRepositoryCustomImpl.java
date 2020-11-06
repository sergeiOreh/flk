package by.btslogistics.fklservice.dao.model.flk.repository.flkresult.impl;


import by.btslogistics.fklservice.dao.model.flk.constants.FlkNamesProcAndPkg;
import by.btslogistics.fklservice.dao.model.flk.model.flkresult.FlkResult;
import by.btslogistics.fklservice.dao.model.flk.repository.flkresult.FlkResultRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.time.LocalDateTime;

@Repository
public class FlkResultRepositoryCustomImpl implements FlkResultRepositoryCustom {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Iterable<FlkResult> findFlkResultFromProcedure(String idDeclaration,
                                                          LocalDateTime dateStart,
                                                          String typeDocument) {

        StoredProcedureQuery namedStoredProcedureQuery =
                this.entityManager.createNamedStoredProcedureQuery(FlkNamesProcAndPkg.GET_LIST_ERRORS_FOR_SERVICE);

        namedStoredProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        namedStoredProcedureQuery.registerStoredProcedureParameter(2, LocalDateTime.class, ParameterMode.IN);
        namedStoredProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        namedStoredProcedureQuery.registerStoredProcedureParameter(4, void.class, ParameterMode.REF_CURSOR);


        namedStoredProcedureQuery.setParameter(1, idDeclaration);
        namedStoredProcedureQuery.setParameter(2, dateStart);
        namedStoredProcedureQuery.setParameter(3, typeDocument);

        namedStoredProcedureQuery.execute();


        Iterable<FlkResult> resultList = namedStoredProcedureQuery.getResultList();

        return resultList;
    }

    @Override
    public Iterable<FlkResult> findFlkResultFromProcedure(String idDeclaration) {

        StoredProcedureQuery namedStoredProcedureQuery =
                this.entityManager.createNamedStoredProcedureQuery(FlkNamesProcAndPkg.GET_LIST_ERRORS_FOR_UI)
                        .registerStoredProcedureParameter(1,String.class, ParameterMode.IN)
                        .registerStoredProcedureParameter(2,void.class, ParameterMode.REF_CURSOR)
                        .setParameter(1,idDeclaration);

        namedStoredProcedureQuery.execute();

        Iterable<FlkResult> resultList = namedStoredProcedureQuery.getResultList();

        return resultList;
    }


}
