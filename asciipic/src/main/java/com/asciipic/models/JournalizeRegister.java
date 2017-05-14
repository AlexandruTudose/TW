package com.asciipic.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Alexandru on 5/14/2017.
 */
@Entity
@Table(name = "j_register")
public class JournalizeRegister {
    @Id
    @JoinColumn(name = "journalize_id", referencedColumnName = "id")
    private Journalize journalize;

    @NotNull
    @Column(name = "user_id")
    private long userId;

    @NotNull
    @Column(name = "ip", length = 32)
    private String ip;

    public JournalizeRegister(Journalize journalize) {
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
