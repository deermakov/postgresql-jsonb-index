package poc.postgres.jsonbindex.app;

import poc.postgres.jsonbindex.domain.Document;

import java.util.UUID;

public interface WriteDocument {
    void writeDocument(final Document document);
}
