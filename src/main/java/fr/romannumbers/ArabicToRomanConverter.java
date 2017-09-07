package fr.romannumbers;

class ArabicToRomanConverter {
  String convert(int arabicNumberToConvert) {
    ArabicNumber numberToConvert = new ArabicNumber(arabicNumberToConvert);
    return numberToConvert.toRoman();
  }
}
