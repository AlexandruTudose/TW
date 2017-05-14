package com.asciipic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Entity
@Table(name = "tegs")
public class Tag {
    @Id
    @Column(name = "image_id")
    long imageId;

    @Id
    @Column(name = "tag_name")
    String tagName;

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
