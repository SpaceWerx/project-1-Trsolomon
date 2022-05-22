package com.revature;

import java.util.ArrayList;
import java.util.List;
import Models.Reimbursement;

import Models.Type;
import Models.Status;
public class Mockreimbursementdata {
	private final List<Reimbursement> reimbursements = new ArrayList<>();
public void MockReimbursementData() {
}
Mockuserdata userData = new Mockuserdata();

Reimbursement Reimbursement_TO_PROCESS_1 = new Reimbursement(1, 1, 0, "Amazon Web Services", Type.other, Status.Pending, 400.00);
Reimbursement Reimbursement_TO_PROCESS_2 = new Reimbursement(2, 2, 0, "Travel out of state", Type.travel, Status.Pending, 550.00);
Reimbursement Reimbursement_APPROVED_1 = new Reimbursment(3, 1, 3, "Free Dinner for travel purposes", Type.food,Status.Approved, 50.00);
Reimbursement Reimbursement_APPROVED_2 = new Reimbursement(4, 2, 4, "3 nights stay at the Houston location", Type.lodging, Status.Approved, 450.00);
Reimbursement Reimbursement_DENIED_1 = new Reimbursement(5, 1, 3, "Rental car to use for personal reasons", Type.travel, Status.Denied, 220.00);


reimbursements.add(Reimbursement_TO_PROCESS_1);
reimbursements.add(Reimbursement_TO_PROCESS_2);
reimbursements.add(Reimbursement_APPROVED_1);
reimbursements.add(Reimbursmenet_APPROVED_2);
reimbursements.add(Reimbursement_DENIED_1);



public List<Reimbursement> getReimbursements() { return reimbursements; {



}}}