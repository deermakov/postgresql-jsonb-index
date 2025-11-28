package poc.postgres.jsonbindex.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Document {
    @Id
    private UUID id;
}
