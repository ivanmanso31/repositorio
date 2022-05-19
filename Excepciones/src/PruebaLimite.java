import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaLimite {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int temp, horas;
		try {
			System.out.println("¿Cuánto has dormido?");
			horas = sc.nextInt();
			if (horas < 8) {
				throw new DemasiadoCansado("Has dormido poco, estas cansado");
			}
			System.out.println("¿Qué temperatura hace?");
			temp = sc.nextInt();
			if (temp > 40) {
				throw new DemasiadoCalor("Date un bañito");
			}
			System.out.println("has dormido "+horas+" horas y hace "+temp+" grados");
		} catch (DemasiadoCalor cl) {
			System.out.println(cl.getMessage());
		} catch (DemasiadoCansado cc) {
			System.out.println(cc.getMessage());
		} catch (InputMismatchException ime) {
			System.out.println("Entrada incorrecta");
		}finally {
			
			sc.close();
		}
		System.out.println("FIN");
	}

}
