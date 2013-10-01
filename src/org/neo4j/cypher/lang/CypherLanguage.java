package org.neo4j.cypher.lang;

import com.intellij.lang.InjectableLanguage;
import com.intellij.lang.Language;

public class CypherLanguage extends Language implements InjectableLanguage{
    public static String CYPHER_LANGUAGE_ID = "CYPHER_LANGUAGE_ID";
    public static CypherLanguage CYPHER_LANGUAGE = new CypherLanguage();

    public CypherLanguage() {
        super(CYPHER_LANGUAGE_ID);
    }
}
