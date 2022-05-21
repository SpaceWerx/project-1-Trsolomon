package com.revature;

import java.util.ArrayList;
import java.util.List;

public class Mockreimbursementdata<Reimbursement> {
	private final List<Reimbursement> reimbursements = new ArrayList<>();
public void MockReimbursementData() {
}
Mockuserdata userData = new Mockuserdata()

Reimbursement_TO_PROCESS_1 = new Reimbursement(id: 1, author 1, resolver 0, description: "Amazon Web Services", ReimbursementType.other, Status.Pending, amount: 400.00);
Reimbursement_TO_PROCESS_2 = new Reimbursement(id: 2, author 2, resolver 0, description: "Travel out of state", ReimbursementType.travel, Status.Pending, amount: 550.00);
Reimbursement_APPROVED_1 = new Reimbursment(id: 3, author 1, resolver 3, description: "Free Dinner for travel purposes", ReimbursementType.food,Status.Approved, amount: 50.00);
Reimbursement_APPROVED_2 = new Reimbursement(id:4, author 2, resolver 4, description: "3 nights stay at the Houston location", ReimbursementType.lodging, Status.Approved, amount: 450.00);
Reimbursement_DENIED_1 = new Reimbursement(id:5, author 1, resolver 3, description: "Rental car to use for personal reasons", ReimbursementType.travel, Status.Denied, amount: 220.00);


reimbursements.add(Reimbursement_TO_PROCESS_1);
reimbursements.add(Reimbursement_TO_PROCESS_2);
reimbursements.add(Reimbursement_APPROVED_1);
reimbursements.add(Reimbursmenet_APPROVED_2);
reimbursements.add(Reimbursement_DENIED_1);



public List<Reimbursement> getReimbursements() { return reimbursements; {



}}}