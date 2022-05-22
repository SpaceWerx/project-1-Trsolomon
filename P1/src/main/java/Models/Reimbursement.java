package Models;

import java.util.Objects;

public class Reimbursement {
	private int id;
	private int Author;
	private int Resolver;
	private String Description;
	private Type Type;
	private Status Status;
	private double Amount;
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	
	}
	public Reimbursement(int id, int author, int resolver, String description, Type type, Status status,
			double amount) {
		super();
		this.id = id;
		Author = author;
		Resolver = resolver;
		Description = description;
		this.Type = Type;
		Status = status;
		Amount = amount;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
