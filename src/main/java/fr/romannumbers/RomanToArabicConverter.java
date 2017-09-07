package fr.romannumbers;

class RomanToArabicConverter {
  int convert(String toConvert) {
    RomanNumber numberToConvert = new RomanNumber(toConvert);
    return numberToConvert.toArabic();
  }
}