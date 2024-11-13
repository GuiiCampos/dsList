package com.ProjetoIntesivao.dslist.dto;

import com.ProjetoIntesivao.dslist.entities.Game;

public class GameDTO {
    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;


    public GameDTO() {
    }
    public GameDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
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
}
