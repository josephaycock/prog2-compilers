package Absyn;
import java.lang.ProcessBuilder.Redirect.Type;

import Symbol.Symbol;

public class VarDecl extends Absyn {
    public Type type;
    public Symbol name;

    public VarDecl(int p, Type t, Symbol n) {
        super();
        type = t;
        name = n;
    }
}
