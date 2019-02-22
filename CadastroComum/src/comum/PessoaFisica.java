package comum;

import java.io.Serializable;
import java.rmi.RemoteException;

public class PessoaFisica implements Serializable {

	private static final long serialVersionUID = 1L;

	public PessoaFisica(int cpf) throws RemoteException  {
		super();
		this.cpf = cpf;
	}

	private int cpf;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
