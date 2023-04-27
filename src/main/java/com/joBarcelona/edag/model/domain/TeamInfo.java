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
@Document (collection="teamInfo")
public class TeamInfo {
    private String squad_id;
    private String squad;
    private String pl;
    private String age;
    private String poss;
    private String mp;
    private String gls;
    private String ast;
    private String pk;
    private String pkatt;

    private String crdy;
    private String crdr;
    private String sh;
    private String fls;
    private String off;
    private String pkcon;
    private String og;
    private String league_name;

    private String url_imagen;


//squad_id,squad,pl,age,poss,mp,gls,ast,pk,pkatt,crdy,crdr,sh,fls,fld,off,pkcon,og,league_name

}
