package Absyn;

import java.util.Set;

public class IfStmt extends StmtList {
    public Exp condition;
    public StmtList thenStmt, elseStmt;

    public IfStmt(int p, Exp c, Set t, Set e) {
        super();
        condition = c;
        thenStmt = (StmtList) t;
        elseStmt = (StmtList) e;
    }
}
