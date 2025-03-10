package Absyn;

import java.util.Set;

public class WhileStmt extends StmtList {
    public Exp condition;
    public Set body;

    public WhileStmt(int p, Exp c, Set b) {
        super();
        condition = c;
        body = b;
    }
}
