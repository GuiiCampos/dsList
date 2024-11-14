package com.ProjetoIntesivao.dslist.dto;

import com.ProjetoIntesivao.dslist.entities.Game;
import com.ProjetoIntesivao.dslist.projections.GameMinProjection;

public class GameDTO {
    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
//    private Integer position;


    public GameDTO() {
    }
    public GameDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }
    public GameDTO(GameMinProjection projection) {
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.year = projection.getYear();
        this.imgUrl = projection.getImgUrl();
        this.shortDescription = projection.getShortDescription();
//        this.position = projection.getPosition();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

//    public Integer getPosition() {
//        return position;
//    }
}
