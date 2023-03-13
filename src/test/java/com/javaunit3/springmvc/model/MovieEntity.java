package com.javaunit3.springmvc.model;

import org.hibernate.engine.internal.Cascade;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "movies")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "maturity_Rating")
    private String maturityRating;

    @Column(name = "genre")
    private String genre;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie id")
    private List<VoteEntity> votes;
    public List<VoteEntity> getVotes()
    {
        return votes;
    }
    public void setVotes(List<VoteEntity> votes)
    {
        this.votes = votes;
    }
    public void addVotes(VoteEntity vote)
    {
        this.votes.add(vote);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
