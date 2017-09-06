package fr.romannumbers;

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
}