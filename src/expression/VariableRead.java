package expression;
import nodes.Expression;
import nodes.Reference;

public class VariableRead extends Expression {
	private Expression var;
	private Reference type;
	
	public Reference getTypeReference() {
		return type;
	}
	public Expression getVar() {
		return var;
	}
}