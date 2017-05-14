package com.asciipic.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Entity
@Table(name = "j_crawl")
public class JournalizeCrawl {
    @Id
    @JoinColumn(name = "journalize_id", referencedColumnName = "id")
    private Journalize journalize;

    @NotNull
    @Column(name = "user_id")
    private long userId;

    @NotNull
    @Column(name = "job_id")
    private long jopId;

    @Column(name = "post_date")
    private Date postDate;

    @Column(name = "height")
    private long height;

    @Column(name = "width")
    private long width;

    @Column(name = "tag", length = 32)
    private String tag;

    public JournalizeCrawl(Journalize journalize) {
        this.journalize = journalize;
    }

    public Journalize getJournalize() {
        return journalize;
    }

    public void setJournalize(Journalize journalize) {
        this.journalize = journalize;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getJopId() {
        return jopId;
    }

    public void setJopId(long jopId) {
        this.jopId = jopId;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
