package poc.postgres.jsonbindex.adapter.rest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import poc.postgres.jsonbindex.app.FindDocuments;
import poc.postgres.jsonbindex.app.ListDocuments;
import poc.postgres.jsonbindex.app.ReadDocument;
import poc.postgres.jsonbindex.app.WriteDocument;
import poc.postgres.jsonbindex.domain.Document;
import io.swagger.v3.oas.annotations.Operation;
import poc.postgres.jsonbindex.domain.DocumentSearchIndex;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Slf4j
public class Controller {

    private final ReadDocument readDocument;
    private final WriteDocument writeDocument;
    private final ListDocuments listDocuments;
    private final FindDocuments findDocuments;

    @PostMapping("/document")
    @Operation
    public void saveDocument(@RequestBody Document document) {
        writeDocument.writeDocument(document);
    }

    @GetMapping("/document/{id}")
    @Operation
    public Document readDocument(UUID id) {
        return readDocument.readDocument(id);
    }

    @GetMapping("/document/author/{author}")
    @Operation
    public List<DocumentSearchIndex> readDocument(String author) {
        return findDocuments.findDocumentsByAuthor(author);
    }

    @GetMapping("/document/")
    @Operation
    public List<Document> getAllParties() {
        return listDocuments.listDocuments();
    }
}
