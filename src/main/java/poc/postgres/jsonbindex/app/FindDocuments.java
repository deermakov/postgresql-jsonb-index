package poc.postgres.jsonbindex.app;


import poc.postgres.jsonbindex.domain.Document;
import poc.postgres.jsonbindex.domain.DocumentSearchIndex;

import java.util.List;

public interface FindDocuments {
    List<DocumentSearchIndex> findDocumentsByAuthor(String author);
}
