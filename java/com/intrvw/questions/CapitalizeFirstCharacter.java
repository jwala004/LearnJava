package com.intrvw.questions;

import java.util.Objects;

public class CapitalizeFirstCharacter {

	public static void main(String[] args) {

		System.out.println(capitailzeFirstCharacterOfString("Jwala"));
	}

	private static String capitailzeFirstCharacterOfString(String strToCapitalize) {

		if (Objects.nonNull(strToCapitalize) && !strToCapitalize.isEmpty()) {
			return strToCapitalize.substring(0, 1).toUpperCase() + strToCapitalize.substring(1);
		} else {
			return "Null or Empty value of string supplied";

		}

	}

}
