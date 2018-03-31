package com.java.utilities;

public enum EnumUtility {
	TYPE1("TYPE1"), TYPE2("TYPE2"), TYPE3("TYPE3");

	private String variableType;

	private EnumUtility(String variableType) {
		this.variableType = variableType;
	}

	public String getVariableType() {
		return variableType;
	}

	public static EnumUtility findByVariableType(String variableType) {
		for (EnumUtility v : values()) {
			if (variableType != null && v.getVariableType().equalsIgnoreCase(variableType)) {
				return v;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return String.valueOf(variableType);

	}

	public static void main(String args[]) {
		System.out.println(findByVariableType("TYPE1"));

	}
}
