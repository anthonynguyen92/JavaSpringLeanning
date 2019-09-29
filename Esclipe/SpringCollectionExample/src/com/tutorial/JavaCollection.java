package com.tutorial;

import java.util.*;

public class JavaCollection {
	List addrestList;

	public List getAddrestList() {
		System.out.println("Your List: " + this.addrestList);
		return addrestList;
	}

	public void setAddrestList(List addrestList) {
		this.addrestList = addrestList;
	}

	public Set getAddrestSet() {
		System.out.println("Your Address: " + this.addrestSet);
		return addrestSet;
	}

	public void setAddrestSet(Set addrestSet) {
		this.addrestSet = addrestSet;
	}

	public Map getAddreMap() {
		System.out.println("Your map: " + this.addreMap);
		return addreMap;
	}

	public void setAddreMap(Map addreMap) {
		this.addreMap = addreMap;
	}

	public Properties getAddressPop() {
		System.out.println("Your Property: " + this.addressPop);
		return addressPop;
	}

	public void setAddressPop(Properties addressPop) {
		this.addressPop = addressPop;
	}

	Set addrestSet;
	Map addreMap;

	Properties addressPop;

}
