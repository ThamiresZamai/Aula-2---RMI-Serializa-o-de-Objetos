package comum;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IServicoRemoto extends Remote{
	void inserir (Pessoa p) throws RemoteException;
	List<Pessoa> Impressao() throws RemoteException;
	void GerarAumento(Pessoa p ) throws RemoteException;
	
}
