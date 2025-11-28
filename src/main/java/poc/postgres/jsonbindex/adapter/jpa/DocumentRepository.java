package poc.postgres.jsonbindex.adapter.jpa;

import org.springframework.data.repository.CrudRepository;
import poc.postgres.jsonbindex.domain.Document;

import java.util.UUID;

public interface DocumentRepository extends CrudRepository<Document, UUID> {
}
