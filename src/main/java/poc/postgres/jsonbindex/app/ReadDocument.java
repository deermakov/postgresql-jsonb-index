package poc.postgres.jsonbindex.app;

import poc.postgres.jsonbindex.domain.Document;

import java.util.UUID;

public interface ReadDocument {
    Document readDocument(final UUID id);
}
