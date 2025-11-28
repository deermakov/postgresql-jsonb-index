package poc.postgres.jsonbindex.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Entity
@Table(name = "document")
@Data
public class DocumentSearchIndex {
    @Id
    private UUID id;

    private String author;
    private Integer year;
    private Integer pages;
}
