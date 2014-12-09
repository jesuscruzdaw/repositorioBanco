package metodo;

public class Cuenta {
	private String titular;
	private long ncta;
	private float saldo;

	public Cuenta(String titular, long ncta) {
		this.titular = titular;
		this.ncta = ncta;
		this.saldo = 0.0F;
	}

	public Cuenta(String titular, long ncta, float saldo) {
		this.titular = titular;
		this.ncta = ncta;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public long getNcta() {
		return ncta;
	}

	public void setNcta(long ncta) {
		this.ncta = ncta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void ingreso(float cantidad) {
		saldo = saldo + cantidad;
	}

	public void reintegro(float cantidad) {
		if (saldo >= cantidad)
			saldo = saldo - cantidad;
		else
			System.out.println("No hay saldo suficiente");
	}

	public void transferencia(Cuenta acreedora, float cantidad) {
		if (saldo >= cantidad) {
			saldo = saldo - cantidad;
			acreedora.ingreso(cantidad);
		} else
			System.out.println("No hay saldo suficiente");
	}

}
