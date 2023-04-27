package com.joBarcelona.edag.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="allTeam")
public class AllTeam {

    private String squad_id;
    private String squad;
    private String url_imagen;

}
