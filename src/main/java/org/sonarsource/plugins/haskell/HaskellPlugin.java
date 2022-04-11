package org.sonarsource.plugins.haskell;

import org.sonar.api.Plugin;
import org.sonarsource.plugins.haskell.languages.HaskellLanguage;
import org.sonarsource.plugins.haskell.languages.HaskellQualityProfile;
import org.sonarsource.plugins.haskell.languages.HaskellLanguageProperties;

/**
 * This class is the entry point for all extensions. It is referenced in pom.xml.
 */
public class HaskellPlugin implements Plugin {

  @Override
  public void define(Context context) {

    context.addExtensions(HaskellLanguage.class, HaskellQualityProfile.class);
    context.addExtensions(HaskellLanguageProperties.getProperties());
 }
}
