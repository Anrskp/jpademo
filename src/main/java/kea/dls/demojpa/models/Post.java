package kea.dls.demojpa.models;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotNull
    private String author;
    @NotNull
    private String title;
    @NotNull
    private String content;

    protected Post() {}

    public Post(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
