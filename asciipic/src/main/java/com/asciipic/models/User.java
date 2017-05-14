package com.asciipic.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
