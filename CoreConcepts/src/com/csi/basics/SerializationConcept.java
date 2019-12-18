package com.csi.basics;

import java.beans.Transient;
import java.io.Serializable;
import java.rmi.Remote;

public class SerializationConcept implements Serializable {
public static void main(String[] args) {
	
	Transient empId;// We cant serialize it
	String empName;
	SerializationConcept sc = new SerializationConcept();//serialized
	
	
}
}
