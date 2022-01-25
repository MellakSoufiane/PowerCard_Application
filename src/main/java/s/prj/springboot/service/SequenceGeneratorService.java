package s.prj.springboot.service;


import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import s.prj.springboot.model.DataSequence;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class SequenceGeneratorService {
	
	 
	    private MongoOperations mongoOperations;

	    @Autowired
	    public SequenceGeneratorService(MongoOperations mongoOperations) {
	        this.mongoOperations = mongoOperations;
	    }
	    public int generateSequence(String seqName) {

	        DataSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
	                new Update().inc("seq",1), options().returnNew(true).upsert(true),
	                DataSequence.class);
	        return !Objects.isNull(counter) ? counter.getSeq() : 1;

	    }
	}