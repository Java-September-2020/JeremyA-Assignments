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
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank (message="required")
    private String firstName;
    @NotBlank (message="required")
    private String lastName;
    @NotBlank (message="required")
    @Email(message="must be valid format")
    private String email;
    @NotBlank (message="required")
    private String city;
    @NotBlank (message="required")
    private String state;
    @NotBlank (message="required")
    @Size(min=8, message="must be greater than 8 characters")
    private String password;
    @Transient
    private String passwordConfirmation;
    @Column(updatable=false)
    @DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
    private Date updatedAt;
    @OneToMany(mappedBy="eventCreator", fetch=FetchType.LAZY)
	private List<Event> eventCreator;
    @OneToMany(mappedBy="messagesCreator", fetch=FetchType.LAZY)
	private List<Message> messagesCreated;
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
    	name="joined",
    	joinColumns = @JoinColumn(name="user_id"),
    	inverseJoinColumns = @JoinColumn(name="event_id")
    )
    private List<Event> eventsJoined;
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    public User() {
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}
	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
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
	public List<Event> getEventCreated() {
		return eventCreator;
	}
	public void setEventCreated(List<Event> eventCreator) {
		this.eventCreator = eventCreator;
	}
	public List<Message> getMessagesCreated() {
		return messagesCreated;
	}
	public void setMessagesCreated(List<Message> messagesCreated) {
		this.messagesCreated = messagesCreated;
	}
	public List<Event> getEventsJoined() {
		return eventsJoined;
	}
	public void setEventsJoined(List<Event> eventsJoined) {
		this.eventsJoined = eventsJoined;
	}
    
	
    
}