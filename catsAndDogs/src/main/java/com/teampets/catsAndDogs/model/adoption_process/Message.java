//package com.teampets.catsAndDogs.model.adoption_process;
//
//import com.teampets.catsAndDogs.model.BaseEntity;
//import com.teampets.catsAndDogs.model.user.User;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//import java.time.LocalDateTime;
//
//@Setter
//@Getter
//@Builder
//@Entity
//@Table(name = "Message")
//public class Message extends BaseEntity {
//
//    @Column(name = "content")
//    private String content;
//    @OneToOne(mappedBy = "") //TODO: add mapping
//    private Conversation conversation;
//    @OneToOne(mappedBy = "") //TODO: add mapping
//    private User user;
//    @Column(name = "message_date")
//    private LocalDateTime messageDate;
//}
