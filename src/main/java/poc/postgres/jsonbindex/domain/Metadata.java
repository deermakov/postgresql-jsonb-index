package poc.postgres.jsonbindex.domain;

import lombok.Data;

@Data
public class Metadata {
    private String author;
    private Integer year;
    private Integer pages;
}
