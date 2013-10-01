package org.neo4j.cypher.lang.injector;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.InjectedLanguagePlaces;
import com.intellij.psi.LanguageInjector;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.intellij.psi.PsiLiteralExpression;
import org.jetbrains.annotations.NotNull;
import org.neo4j.cypher.lang.CypherLanguage;

public class CypherLanguageInjector implements LanguageInjector {
    @Override
    public void getLanguagesToInject(@NotNull PsiLanguageInjectionHost host, @NotNull InjectedLanguagePlaces injectionPlacesRegistrar) {
        if(host instanceof PsiLiteralExpression) {
            injectionPlacesRegistrar.addPlace(
                    CypherLanguage.CYPHER_LANGUAGE,
                    new TextRange(1, host.getText().length()-1),
                    "", "");
        }

    }
}
