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
@Document(collection="player")
public class Player {
    private String id;
    private String player_id;
    private String player;
    private String squad_id;
    private String nation;
    private String pos;
    private String age;
    private String born;
    private String mP;
    private String min;
    private String gls;
    private String ast;
    private String pK;
    private String crdY;
private String crdR;
private String soT;
private String passes_Cmp;
    private String tkl;
    private String blocks;
    private String fls;
    private String fld;
    private String off;
    private String pKcon;
    private String recov;
   private String league_name;

}
