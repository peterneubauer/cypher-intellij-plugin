package org.neo4j.cypher.lang.filetypes;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;
import org.neo4j.cypher.lang.psi.CypherFileType;

public class CypherFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(CypherFileType.CYPHER_FILE_TYPE, "cypher");
    }
}
