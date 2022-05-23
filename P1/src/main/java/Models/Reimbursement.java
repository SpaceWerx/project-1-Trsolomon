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





	public Reimbursement(int id, int author, int resolver, String description, Models.Type type, Models.Status status,
			double amount) {
		super();
		this.id = id;
		Author = author;
		Resolver = resolver;
		Description = description;
		Type = type;
		Status = status;
		Amount = amount;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public int getAuthor() {
		return Author;
	}





	public void setAuthor(int author) {
		Author = author;
	}





	public int getResolver() {
		return Resolver;
	}





	public void setResolver(int resolver) {
		Resolver = resolver;
	}





	public String getDescription() {
		return Description;
	}





	public void setDescription(String description) {
		Description = description;
	}





	public Type getType() {
		return Type;
	}





	public void setType(Type type) {
		Type = type;
	}





	public Status getStatus() {
		return Status;
	}





	public void setStatus(Status status) {
		Status = status;
	}





	public double getAmount() {
		return Amount;
	}





	public void setAmount(double amount) {
		Amount = amount;
	}





	@Override
	public int hashCode() {
		return Objects.hash(Amount, Author, Description, Resolver, Status, Type, id);
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		return Double.doubleToLongBits(Amount) == Double.doubleToLongBits(other.Amount) && Author == other.Author
				&& Objects.equals(Description, other.Description) && Resolver == other.Resolver
				&& Status == other.Status && Type == other.Type && id == other.id;
	}





	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", Author=" + Author + ", Resolver=" + Resolver + ", Description="
				+ Description + ", Type=" + Type + ", Status=" + Status + ", Amount=" + Amount + "]";
	}







}