package app.config.Dto;

import app.model.Author;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class BookDto {
    private Long id;

    private String titleName;
    private Long mainAuthor;
    private Long coAuthor;
    private Integer originalsAmount;
    private Integer copiesAmount;
    private Boolean isAvailable;

    public BookDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public Long getMainAuthor() {
        return mainAuthor;
    }

    public void setMainAuthor(Long mainAuthor) {
        this.mainAuthor = mainAuthor;
    }

    public Long getCoAuthor() {
        return coAuthor;
    }

    public void setCoAuthor(Long coAuthor) {
        this.coAuthor = coAuthor;
    }

    public Integer getOriginalsAmount() {
        return originalsAmount;
    }

    public void setOriginalsAmount(Integer originalsAmount) {
        this.originalsAmount = originalsAmount;
    }

    public Integer getCopiesAmount() {
        return copiesAmount;
    }

    public void setCopiesAmount(Integer copiesAmount) {
        this.copiesAmount = copiesAmount;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
