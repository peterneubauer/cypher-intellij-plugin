package org.neo4j.cypher.lang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.neo4j.cypher.lang.CypherLanguage;

public class CypherFile extends PsiFileBase {
    public CypherFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CypherLanguage.CYPHER_LANGUAGE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CypherFileType.CYPHER_FILE_TYPE;
    }
}
