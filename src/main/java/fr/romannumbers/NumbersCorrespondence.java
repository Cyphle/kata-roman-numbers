package fr.romannumbers;

import java.util.Arrays;

enum NumbersCorrespondence {
  THOUSAND(1000, "M"),
  NINE_HUNDRED(900, "CM"),
  FIVE_HUNDRED(500, "D"),
  FOUR_HUNDRED(400, "CD"),
  HUNDRED(100, "C"),
  NINETY(90, "XC"),
  FIFTY(50, "L"),
  FORTY(40, "XL"),
  TEN(10, "X"),
  NINE(9, "IX"),
  FIVE(5, "V"),
  FOUR(4, "IV"),
  ONE(1, "I");

  public final int arabicValue;
  public final String romanValue;

  NumbersCorrespondence(int arabicValue, String romanValue) {
    this.arabicValue = arabicValue;
    this.romanValue = romanValue;
  }

  public static NumbersCorrespondence findByRoman(String toFind) {
    return Arrays.stream(values())
            .filter(number -> number.romanValue.equals(toFind))
            .findAny()
            .orElse(values()[0]);
  }

  public boolean isLowerOrEqualThan(int toCompare) {
    return arabicValue <= toCompare;
  }

  public void addRomanValueTo(StringBuilder romanNumber) {
    romanNumber.append(romanValue);
  }

  public int subtractArabicValueFrom(int reference) {
    return reference - arabicValue;
  }
}
