package com.crystal.spring_db.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User { @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private Integer id;
@Column(name="full_name")
@NotBlank(message = "Name is mandatory")
@NotNull(message ="Null value not allowed")
private String fullName;
@Column(name="email")
@NotBlank(message = "Email is mandatory")
@Email(message = "Input should be a valid email")
@NotNull(message ="Null value not allowed")
//@Min(value = 2,message = "Min of length is 2")
private String email;
@Column(name="password")
@NotBlank(message = "Name is mandatory")
@NotNull(message ="Null value not allowed")
private String password;

}

