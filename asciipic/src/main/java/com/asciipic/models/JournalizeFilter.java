package com.asciipic.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Entity
@Table(name = "j_filters")
public class JournalizeFilter {
    @Id
    @JoinColumn(name = "journalize_id", referencedColumnName = "id")
    private Journalize journalize;

    @NotNull
    @Column(name = "user_id")
    private long userId;

    @NotNull
    @Column(name = "image_id")
    private long imageId;

    @NotNull
    @Column(name = "type", length = 32)
    private String type;


    public JournalizeFilter(Journalize journalize) {
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

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
