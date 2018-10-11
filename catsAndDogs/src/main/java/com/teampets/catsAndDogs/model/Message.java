package com.teampets.catsAndDogs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Message")
public class Message extends BaseEntity {

    @Column(name = "content")
    private String content;
    @OneToOne(mappedBy = "") //TODO: add mapping
    private Conversation conversation;
    @OneToOne(mappedBy = "") //TODO: add mapping
    private User user;
    @Column(name = "message_date")
    private LocalDateTime messageDate;
}
