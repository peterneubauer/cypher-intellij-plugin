package org.neo4j.cypher.lang.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.neo4j.cypher.lang.parser.CypherParserTypes.*;

%%

%{
  public _CypherLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _CypherLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode
%eof{ return;
%eof}

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

IDENTIFIER=[:letter:][a-zA-Z_0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }


  {IDENTIFIER}       { return IDENTIFIER; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
