package org.neo4j.cypher.lang.lexer;

import com.intellij.psi.tree.IFileElementType;
import org.neo4j.cypher.lang.CypherLanguage;

public class CypherFileElementType extends IFileElementType{
    public static CypherFileElementType CYPHER_FILE_ELEMENT_TYPE = new CypherFileElementType();
    public CypherFileElementType() {
        super(CypherLanguage.CYPHER_LANGUAGE);
    }
}
