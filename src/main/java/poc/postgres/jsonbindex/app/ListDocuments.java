package poc.postgres.jsonbindex.app;


import poc.postgres.jsonbindex.domain.Document;

import java.util.List;
import java.util.UUID;

public interface ListDocuments {
    List<Document> listDocuments();
}
