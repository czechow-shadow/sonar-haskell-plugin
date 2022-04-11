package org.sonarsource.plugins.haskell.languages;

import org.sonar.api.server.profile.BuiltInQualityProfilesDefinition;

/**
 * Empty BuiltIn Quality Profile for the projects having files of the language "haskell"
 */
public final class HaskellQualityProfile implements BuiltInQualityProfilesDefinition {

  @Override
  public void define(Context context) {
    NewBuiltInQualityProfile profile = context.createBuiltInQualityProfile("Haskell Rules", HaskellLanguage.KEY);
    profile.setDefault(true);
    profile.done();
  }
}
