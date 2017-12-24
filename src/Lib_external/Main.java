package Lib_external;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main {
	String name;
	String address;
	public boolean equals(Object o){
		return EqualsBuilder.reflectionEquals(this, o);
	}

}
