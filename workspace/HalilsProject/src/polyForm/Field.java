package polyForm;

public class Field {

	private String label = "undefind";
	private Object defaultValue = "undefined";
	private Object value = "";

	int labelDisplayLength = 20;
	int valueDisplayLength = 30;

	static String nOf(String str, int nTimes) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nTimes; i++) {
			sb.append(str);
		}
		return sb.toString();
	}

	Field(String label) {
		this.label = label;
	}

	void setValue(Object value) {
		this.value = value;
	}

	void setDefaultValue(Object DefaultValue) {
		this.defaultValue = defaultValue;
	}

	String getType() {
		return "Field";
	}

	String getLabel() {
		return label;
	}

	String getDefaultValue() {
		System.out.println(defaultValue);
		return defaultValue.toString();

	}

	String getValue() {
		String strValue = value.toString();

		if (strValue.equals(""))
			return getDefaultValue();
		else
			return strValue;
	}

	String getFieldDefinition() {
		return getType() + "[label = " + getLabel() + " , default_value = " + getDefaultValue() + " , value = "
				+ getValue() + "]";
	}

	String displayLabel() {
		return getLabel() + Field.nOf(" ", labelDisplayLength - getLabel().length()) + ":";
	}

	String displayValue() {
		return getValue();
	}

	boolean isValid() {
		return false;
	}

}
