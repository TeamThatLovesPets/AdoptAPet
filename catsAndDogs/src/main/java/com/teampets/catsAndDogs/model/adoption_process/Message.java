package com.teampets.catsAndDogs.model.adoption_process;

import com.teampets.catsAndDogs.model.BaseEntity;
import com.teampets.catsAndDogs.model.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@Entity
@Table(name = "Message")
public class Message extends BaseEntity {

    @Column(name = "content")
    private String content;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH})
    private Conversation conversation;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.DETACH})
    private User user;

    @Column(name = "message_date")
    private LocalDateTime messageDate;
}
