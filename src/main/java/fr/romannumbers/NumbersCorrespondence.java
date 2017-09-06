package fr.romannumbers;

enum NumbersCorrespondence {
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
