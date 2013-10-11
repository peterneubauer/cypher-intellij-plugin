package org.neo4j.cypher.lang.psi;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.neo4j.cypher.lang.CypherLanguage;

import javax.swing.*;

public class CypherFileType extends LanguageFileType {
    public static CypherFileType CYPHER_FILE_TYPE = new CypherFileType();

    /**
     * Creates a language file type for the specified language.
     *
     */
    protected CypherFileType() {
        super(CypherLanguage.CYPHER_LANGUAGE);
    }

    @NotNull
    @Override
    public String getName() {
        return "cypher";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Cypher";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cypher";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return null;
    }
}
