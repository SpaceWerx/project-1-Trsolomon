package Models;

import java.util.Objects;

public class Reimbursement {
	private int id;
	private String Author;
	private String Resolver;
	private String Description;
	private String Type;
	private String Status;
	private double Amount;
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	
	}
	public Reimbursement(int id, String author, String resolver, String description, String type, String status,
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
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getResolver() {
		return Resolver;
	}
	public void setResolver(String resolver) {
		Resolver = resolver;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
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
		return Double.doubleToLongBits(Amount) == Double.doubleToLongBits(other.Amount)
				&& Objects.equals(Author, other.Author) && Objects.equals(Description, other.Description)
				&& Objects.equals(Resolver, other.Resolver) && Objects.equals(Status, other.Status)
				&& Objects.equals(Type, other.Type) && id == other.id;
	
	
	}
	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", Author=" + Author + ", Resolver=" + Resolver + ", Description="
				+ Description + ", Type=" + Type + ", Status=" + Status + ", Amount=" + Amount + "]";
	}}
	