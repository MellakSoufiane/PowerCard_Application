package s.prj.springboot.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import s.prj.springboot.model.PowerCard;

@Repository
public interface PowerCardRepository extends MongoRepository<PowerCard, Integer> {
	
}
