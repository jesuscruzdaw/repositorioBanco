package controlador;

import metodo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		Cuenta cuentaFernando=new Cuenta("Fernando Ortiz",1,2000F);
		Cuenta cuentaJesus=new Cuenta("Jesús de la Cruz",2,200F);
		System.out.println("Su saldo Inicial Sr. Ortiz es de : " + cuentaFernando.getSaldo());
		cuentaFernando.reintegro(100F);
		System.out.println("Su saldo Sr. Ortiz: " + cuentaFernando.getSaldo());
		cuentaFernando.transferencia(cuentaJesus,200F);
		System.out.println("Su saldo Sr. Ortiz: " + cuentaFernando.getSaldo());
		System.out.println("Su saldo Sr. de la Cruz: " + cuentaJesus.getSaldo());

	}

}
