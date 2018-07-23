package data.structures.algorithms;

public class Numbers {

	public static int createNumberFrom(int firstValue, int secondValue) {
		String strFirstValue = String.valueOf(firstValue);
		String strSecondValue = String.valueOf(secondValue);
		String strThirdValue = "";
		int minLength = strFirstValue.length() < strSecondValue.length() ? strFirstValue.length()
				: strSecondValue.length();

		for (int i = 0; i < minLength; i++) {
			strThirdValue += Character.toString(strFirstValue.charAt(i)) + Character.toString(strSecondValue.charAt(i));
		}

		if (minLength < strFirstValue.length()) {
			strThirdValue += strFirstValue.substring(minLength);
		} else if (minLength < strSecondValue.length()) {
			strThirdValue += strSecondValue.substring(minLength);
		}

		int intThirdValue = Integer.valueOf(strThirdValue);

		return intThirdValue > 1000000 ? -1 : intThirdValue;
	}

}
