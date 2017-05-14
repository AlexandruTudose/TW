package com.asciipic.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Blob;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Entity
@Table(name = "saved_images")
public class SavedImage {

    @Id
    @Column(name = "image_id")
    private long imageId;

    @NotNull
    @Lob
    @Column(name = "data")

    private Blob data;

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public Blob getData() {
        return data;
    }

    public void setData(Blob data) {
        this.data = data;
    }
}
