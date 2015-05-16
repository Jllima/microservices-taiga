package taiga.ocurrences;

import org.springframework.data.mongodb.repository.MongoRepository;

interface OccurrenceRepository extends MongoRepository<Occurrence, String>{

}
