
public class Calculadora {
private int op1;
private int op2;
public Calculadora(int o1,int o2) {
	op1=o1;
	op2=o2;
}
public void setOp1(int nuevo) {
	op1=nuevo;
}
public void setOp2(int nuevo) {
	op2=nuevo;
}
public void setOp1Op2(int nuevo1, int nuevo2) {
	op1=nuevo1;
	op2=nuevo2;
}
public int getOp1() {
	return op1;
}
public int getOp2() {
	return op2;
}
public int suma() {
	return op1+op2;
}
public int resta() {
	return op1-op2;
}
public int multiplicacion() {
	return op1*op2;
}
public int division() {
	return op1/op2;
}
public String toString() {
	return "Clase Calculadora ["+op1+" "+op2+"]";
}
}
