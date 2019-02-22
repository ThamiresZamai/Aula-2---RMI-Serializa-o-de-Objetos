package comum;

import java.io.Serializable;
import java.rmi.RemoteException;

public class PessoaJuridica implements Serializable {

	public PessoaJuridica(int cnpj) throws RemoteException{
		super();
		this.cnpj = cnpj;
	}
	
	private static final long serialVersionUID = 1L;
	
	private int cnpj;

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
