package com.jeremyakatsa.eventsbelt.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="messages")
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String comment;
	@Column(updatable=false)
    @DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
    private Date createdAt;
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
	private User messagesCreator;
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="event_id")
    private Event event;
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }

    public Message() {
    }
    
    public Message(User messagesCreator, Event event, String comment) {
    	this.messagesCreator = messagesCreator;
    	this.event = event;
    	this.comment = comment;
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public User getMessagesCreator() {
		return messagesCreator;
	}
	public void setMessagesCreator(User messagesCreator) {
		this.messagesCreator = messagesCreator;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
    

}
