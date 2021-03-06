package fr.romannumbers;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ToArabicConverterFeatureTest {
  private RomanToArabicConverter converter;

  @Before
  public void setUp() throws Exception {
    converter = new RomanToArabicConverter();
  }

  @Test
  public void should_convert_from_roman_to_arabic() throws Exception {
    assertThat(converter.convert("MCMIII")).isEqualTo(1903);
    assertThat(converter.convert("MMMDCCCLII")).isEqualTo(3852);
  }
}
