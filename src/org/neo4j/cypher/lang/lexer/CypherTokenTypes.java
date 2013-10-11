package org.neo4j.cypher.lang.lexer;

import com.intellij.psi.tree.TokenSet;
import org.neo4j.cypher.lang.parser.CypherParserTypes;

public interface CypherTokenTypes {
    TokenSet KEYWORDS = TokenSet.create(
            CypherParserTypes.ASSERT,
            CypherParserTypes.CONSTRAINT,
            CypherParserTypes.CREATE,
            CypherParserTypes.DROP,
            CypherParserTypes.INDEX,
            CypherParserTypes.IS,
            CypherParserTypes.ON,
            CypherParserTypes.UNIQUE
    );

}
