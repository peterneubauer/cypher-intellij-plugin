package org.neo4j.cypher.lang;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CypherSyntaxHighlighterFactory extends SyntaxHighlighterFactory {
    private CypherSyntaxHighlighter cypherSyntaxHighlighter;

    public CypherSyntaxHighlighterFactory() {
        cypherSyntaxHighlighter = new CypherSyntaxHighlighter();
    }

    @NotNull
    @Override
    public SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
        return cypherSyntaxHighlighter;
    }
}
