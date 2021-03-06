package org.neo4j.cypher.lang.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.neo4j.cypher.lang.CypherLanguage;
import org.neo4j.cypher.lang.lexer.CypherLexer;
import org.neo4j.cypher.lang.psi.CypherFile;

public class CypherParserDefinition implements ParserDefinition {
    public static IFileElementType CYPHER_FILE_ELEMENT_TYPE = new IFileElementType(CypherLanguage.CYPHER_LANGUAGE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new CypherLexer();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new CypherParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return CYPHER_FILE_ELEMENT_TYPE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return TokenSet.create(TokenType.WHITE_SPACE);
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.create(
                JavaTokenType.C_STYLE_COMMENT,
                JavaTokenType.END_OF_LINE_COMMENT
                );
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.create(TokenType.WHITE_SPACE);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return CypherParserTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new CypherFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
