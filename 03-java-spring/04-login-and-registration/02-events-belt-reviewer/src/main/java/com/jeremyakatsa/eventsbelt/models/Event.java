package com.jeremyakatsa.eventsbelt.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="events")
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank (message="Required")
	private String name;
	@NotBlank (message="Required")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private int date;
    @NotBlank (message="Required")
    private String city;
    @NotBlank (message="Required")
    private String state;
    @Column(updatable=false)
    @DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
    private Date updatedAt;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
	private User eventCreator;
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
    	name="joined",
    	joinColumns = @JoinColumn(name="event_id"),
    	inverseJoinColumns = @JoinColumn(name="user_id")
    )
    private List<User> usersJoined;
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    
    
    public Event() {
    	
    }
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public User getEventCreator() {
		return eventCreator;
	}
	public void setEventCreator(User eventCreator) {
		this.eventCreator = eventCreator;
	}
	public List<User> getUsersJoined() {
		return usersJoined;
	}
	public void setUsersJoined(List<User> usersJoined) {
		this.usersJoined = usersJoined;
	}

}
