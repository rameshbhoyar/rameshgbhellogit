package com.csi.coreconcept;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Customer {
	int customerId;
	String customerName;
	int customerAge;
	public Customer(int customerId, String customerName, int customerAge) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ "]";
	}
}
class NameComparator implements Comparator<Customer> {
	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.customerName.compareTo(o2.customerName);

	}

}

class AgeComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if (o1.customerAge == o2.customerAge) {
			return 0;
		} else if (o1.customerAge > o2.customerAge) {
			return 1;} else {
			return -1;}}}
public class CompratorConcept {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer(111, "JERRY", 22));
		customerList.add(new Customer(110, "TOM", 19));
		customerList.add(new Customer(119, "RUTUJA", 34));
		customerList.add(new Customer(114, "PANKAJ", 23));
		customerList.add(new Customer(117, "RAVI", 18));
		customerList.add(new Customer(116, "ANUJA", 21));
		System.out.println("\n Age Sorting: ");
		Collections.sort(customerList, new AgeComparator());
		customerList.forEach(cc -> System.out.println(cc));
		System.out.println("\n Name Sorting");
		Collections.sort(customerList, new NameComparator());
		customerList.forEach(cc -> System.out.println(cc));
	}
}
