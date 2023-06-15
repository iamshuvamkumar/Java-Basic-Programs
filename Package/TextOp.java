import Operators.RelationalOperators;
import Operators.AssignmentOperators;
import Operators.AirthMaticOperators;
class TextOp{
	public static void main(String[]args){
		RelationalOperators rs = new RelationalOperators();
		AssignmentOperators ao = new AssignmentOperators();
		AirthMaticOperators ato = new AirthMaticOperators();
		int sum = ato.sum(5,8);
		int sub = ato.sub(2,8);
		int mul = ato.mul(3,3);
		int div = ato.div(18,2);
		int  mudlo = ato.mud(3,2);
		System.out.print("Sum "+sum+"\nsub "+sub+" \nmul "+mul+"\ndiv "+div+"\nmudlo "+mudlo);
		
		System.out.print("\n Is Equals => "+rs.isEqualto(34,43));
		System.out.print("\n addOperator  => "+ao.addOperator(4,4));
		
	}
}