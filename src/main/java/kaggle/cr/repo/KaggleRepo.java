package kaggle.cr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kaggle.cr.model.KaggleData;


@Repository
public interface KaggleRepo extends JpaRepository<KaggleData, Long>{

}
