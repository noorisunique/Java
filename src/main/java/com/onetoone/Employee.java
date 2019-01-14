package com.onetoone;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "empId")
	private int employeeId;

	@NotBlank
	@JoinColumn(name = "name")
	private String name;

	@JoinColumn(name = "email")
	private String email;

	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "address", insertable = true, updatable = true)
	private Address address;

	public Employee() {
	}

	public Employee(int employeeId, @NotBlank String name, @NotBlank String email, Address address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
