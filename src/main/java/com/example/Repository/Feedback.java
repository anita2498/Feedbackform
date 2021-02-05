package com.example.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name = "feedback")
@Data
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	@NonNull
	private String name;
	@Column(name = "email", unique = true)
	@NonNull
	private String email;
	@Column(name = "feedback1")
	@NonNull
	private String feedback1;

}
