package poc.postgres.jsonbindex.adapter.jpa;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import poc.postgres.jsonbindex.app.FindDocuments;
import poc.postgres.jsonbindex.app.ListDocuments;
import poc.postgres.jsonbindex.app.ReadDocument;
import poc.postgres.jsonbindex.app.WriteDocument;
import poc.postgres.jsonbindex.domain.Document;
import poc.postgres.jsonbindex.domain.DocumentSearchIndex;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Component
@RequiredArgsConstructor
public class DbAdapter implements ReadDocument, WriteDocument, ListDocuments, FindDocuments {
    private final DocumentRepository documentRepository;
    private final DocumentSearchIndexRepository documentSearchIndexRepository;

    @Override
    public Document readDocument(final UUID id) {
        return documentRepository.findById(id).orElse(null);
    }

    @Override
    public void writeDocument(Document document) {
        documentRepository.save(document);
    }

    @Override
    public List<Document> listDocuments() {
        return StreamSupport.stream(documentRepository.findAll().spliterator(), false).toList();
    }

    @Override
    public List<DocumentSearchIndex> findDocumentsByAuthor(String author) {
        return documentSearchIndexRepository.findByAuthor(author);
    }
}
