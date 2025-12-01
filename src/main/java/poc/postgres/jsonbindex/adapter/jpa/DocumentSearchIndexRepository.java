package poc.postgres.jsonbindex.adapter.jpa;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import poc.postgres.jsonbindex.domain.Document;
import poc.postgres.jsonbindex.domain.DocumentSearchIndex;

import java.util.List;
import java.util.UUID;

public interface DocumentSearchIndexRepository extends CrudRepository<DocumentSearchIndex, UUID> {
    // такой запрос по JSONB имеет смысл использовать при отсутствии витруальных колонок: @Query(value = "SELECT id, metadata->'author' as author, metadata->'year' as year, metadata->'pages' as pages FROM document WHERE metadata ->> 'author' = ?1", nativeQuery = true)
    List<DocumentSearchIndex> findByAuthor(String author);
}
