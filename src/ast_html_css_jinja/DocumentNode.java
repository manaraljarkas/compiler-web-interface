package ast_html_css_jinja;

import java.util.ArrayList;
import java.util.List;

public class DocumentNode extends ASTNode {

    public DocumentNode(int line) {
        super(line);
    }

    @Override
    protected String nodeName() {
        return "Document";
    }
}
