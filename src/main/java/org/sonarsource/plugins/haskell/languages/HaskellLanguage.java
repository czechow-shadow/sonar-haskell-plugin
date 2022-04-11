package org.sonarsource.plugins.haskell.languages;

import org.sonar.api.config.Configuration;
import org.sonar.api.resources.AbstractLanguage;

/**
 * This class defines the Haskell language.
 */
public final class HaskellLanguage extends AbstractLanguage {

  public static final String NAME = "Haskell";
  public static final String KEY = "haskell";

  private final Configuration config;

  public HaskellLanguage(Configuration config) {
    super(KEY, NAME);
    this.config = config;
  }

  @Override
  public String[] getFileSuffixes() { return config.getStringArray(HaskellLanguageProperties.FILE_SUFFIXES_KEY); }
}
