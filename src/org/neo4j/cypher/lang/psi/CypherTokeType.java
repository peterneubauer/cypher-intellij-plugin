package org.neo4j.cypher.lang.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.neo4j.cypher.lang.CypherLanguage;


public class CypherTokeType extends IElementType {

    public CypherTokeType(@NotNull @NonNls String debugName) {
        this(debugName, CypherLanguage.CYPHER_LANGUAGE);
    }

    public CypherTokeType(@NotNull @NonNls String debugName, @Nullable Language language) {
        super(debugName, language);
    }
}
