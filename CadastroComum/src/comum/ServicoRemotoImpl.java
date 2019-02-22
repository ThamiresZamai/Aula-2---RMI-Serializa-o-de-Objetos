package comum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto{

	private static final long serialVersionUID = 1L;
	private static List<Pessoa> lstPessoa = new ArrayList<>();
	
	public ServicoRemotoImpl() throws RemoteException {
	}

	@Override
	public void inserir(Pessoa p) throws RemoteException {
		lstPessoa.add(p);
	}

	public List<Pessoa> Impressao() throws RemoteException {
		return lstPessoa;
	}
	
	public void GerarAumento(Pessoa p ) throws RemoteException{
		
		if(p.getIdade() <=20) {
			p.setSalario(((p.getSalario()/100)*10) + p.getSalario());
		}else if((p.getIdade() > 20) && (p.getIdade() <= 30)) {
			p.setSalario(((p.getSalario()/100)*15) + p.getSalario());
		}else if(p.getIdade() > 30) {
			p.setSalario(((p.getSalario()/100)*20) + p.getSalario());
		}
		
		System.out.println("valor do salario com aumento " + p.getSalario() + " para " + p.getNome());
	}

}