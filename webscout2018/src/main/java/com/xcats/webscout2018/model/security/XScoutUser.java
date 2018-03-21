package com.xcats.webscout2018.model.security;

import javax.persistence.*;
import java.util.Set;

@Entity
public class XScoutUser {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private long id;

	@Column(nullable = false, unique = true)
	private String username;

	private String password;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="user_role", joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns = @JoinColumn(name="role_id"))
	private Set<XScoutRole> roles;
}
