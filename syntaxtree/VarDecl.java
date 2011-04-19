package syntaxtree;
import syntaxtree.visitor.*;

public class VarDecl {
  public Type type;
  public Identifier name;
  
  public VarDecl(Type at, Identifier ai) {
    type=at; name=ai;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public Type accept(TypeVisitor v) {
    return v.visit(this);
  }
}
