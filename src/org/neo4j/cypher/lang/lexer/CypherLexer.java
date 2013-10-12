package org.neo4j.cypher.lang.lexer;

import com.intellij.lexer.FlexAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: denys
 * Date: 9/29/13
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class CypherLexer extends FlexAdapter {
    public CypherLexer() {
        super(new _Cypher());
    }
}
