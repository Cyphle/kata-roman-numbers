package fr.romannumbers;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ToArabicConverterFeatureTest {
  private NumberConverter converter;

  @Before
  public void setUp() throws Exception {
    converter = new NumberConverter();
  }

  @Test
  public void should_convert_from_roman_to_arabic() throws Exception {
    assertThat(converter.convertFromRomanToArabic("MCMIII")).isEqualTo(1903);
    assertThat(converter.convertFromRomanToArabic("MMMDCCCLII")).isEqualTo(3852);
  }
}
