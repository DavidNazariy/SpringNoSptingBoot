package app.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titleName;

    @ManyToOne
    @JoinColumn(name = "mainAuthor_id", referencedColumnName = "id")
    private Author mainAuthor;

    @ManyToOne
    @JoinColumn(name = "coAuthor_id", referencedColumnName = "id")
    private Author coAuthor;

    private Integer originalsAmount;
    private Integer copiesAmount;
    private Boolean isAvailable;

    public Book(Long id, String titleName, Author mainAuthor, Author coAuthor, Integer originalsAmount, Integer copiesAmount, Boolean isAvailable) {
        this.id = id;
        this.titleName = titleName;
        this.mainAuthor = mainAuthor;
        this.coAuthor = coAuthor;
        this.originalsAmount = originalsAmount;
        this.copiesAmount = copiesAmount;
        this.isAvailable = isAvailable;
    }

    public Book() {
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

    public Author getMainAuthor() {
        return mainAuthor;
    }

    public void setMainAuthor(Author mainAuthor) {
        this.mainAuthor = mainAuthor;
    }

    public Author getCoAuthor() {
        return coAuthor;
    }

    public void setCoAuthor(Author coAuthor) {
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", titleName='" + titleName + '\'' +
                ", mainAuthor=" + mainAuthor +
                ", coAuthor=" + coAuthor +
                ", originalsAmount=" + originalsAmount +
                ", copiesAmount=" + copiesAmount +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
