package poc.postgres.jsonbindex.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Entity
@Data
public class Document {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

//    @Type(JsonBinaryType.class)
    @JdbcTypeCode(SqlTypes.JSON)
//    @Column(name = "metadata", columnDefinition = "jsonb")
    private Metadata metadata;
}
