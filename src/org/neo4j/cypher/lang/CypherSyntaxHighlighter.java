package org.neo4j.cypher.lang;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import gnu.trove.THashMap;
import org.jetbrains.annotations.NotNull;
import org.neo4j.cypher.lang.lexer.CypherLexer;
import org.neo4j.cypher.lang.lexer.CypherTokenTypes;

import java.util.Map;

public class CypherSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final Map<IElementType, TextAttributesKey> keys1;
    private static final Map<IElementType, TextAttributesKey> keys2;
    static {
        keys1 = new THashMap<IElementType, TextAttributesKey>();
        keys2 = new THashMap<IElementType, TextAttributesKey>();

        for (IElementType token : CypherTokenTypes.KEYWORDS.getTypes()) {
            keys1.put(token, DefaultLanguageHighlighterColors.KEYWORD); // foreground color
        }
    }


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CypherLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(keys1.get(tokenType), keys2.get(tokenType));
    }
}
