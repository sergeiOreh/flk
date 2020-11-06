package by.btslogistics.fklservice.dao.model.flk.repository.flkmain;


import by.btslogistics.fklservice.dao.model.flk.model.flkmain.FlkMain;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.List;

public interface FlkMainReadRepository extends PagingAndSortingRepository<FlkMain, String> {

    List<FlkMain> findByIdTypeControl(Integer id, Pageable pageable);
}
