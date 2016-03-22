package br.com.gumga.freemarker;

public class Attribute {

	private final String name;
	private final String type;
	private final String nameGettterAndSetter;
	private final boolean oneToMany;
	private final boolean oneToOne;
	private final boolean manyToOne;
	private final boolean manyToMany;
	private final boolean required;

	public Attribute(String name, String type, String nameGettterAndSetter, boolean oneToMany, boolean oneToOne,
			boolean manyToOne, boolean manyToMany, boolean required) {
		this.name = name;
		this.type = type;
		this.oneToMany = oneToMany;
		this.oneToOne = oneToOne;
		this.manyToOne = manyToOne;
		this.manyToMany = manyToMany;
		this.required = required;
		this.nameGettterAndSetter = nameGettterAndSetter;
	}

	public String getNameGettterAndSetter() {
		return this.nameGettterAndSetter;
	}

	public boolean isManyToOne() {
		return this.manyToOne;
	}

	public boolean isManyToMany() {
		return this.manyToMany;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.type;
	}

	public String getNameGetterAndSetter() {
		return this.nameGettterAndSetter;
	}

	public boolean isOneToMany() {
		return this.oneToMany;
	}

	public boolean isRequired() {
		return this.required;
	}

	public boolean isOneToOne() {
		return this.oneToOne;
	}
}
