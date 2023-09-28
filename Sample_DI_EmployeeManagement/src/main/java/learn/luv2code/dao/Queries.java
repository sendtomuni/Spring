package learn.luv2code.dao;

public enum Queries {

	EMPLOYEE_INSERT_DETAILS("INSERT INTO employee_info VALUES(EID_SEQ1.NEXTVAL, ?,?,?,?,?)");

	private final String value;

	private Queries(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
