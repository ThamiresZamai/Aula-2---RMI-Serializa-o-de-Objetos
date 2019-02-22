package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import comum.IServicoRemoto;
import comum.Pessoa;
import comum.PessoaFisica;
import comum.PessoaJuridica;

public class AppPrincipal {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		IServicoRemoto objPessoa = (IServicoRemoto) Naming.lookup("rmi://localhost:8282/pessoa");

		try {

			Pessoa p = new Pessoa();

			p.setId(1);
			p.setNome("Thamires");
			p.setPf(new PessoaFisica(23456));
			p.setIdade(27);
			p.setCidade("Araraquara");
			p.setEstado("SP");
			p.setEndereco("Rua varanda");
			p.setNomeMae("Luciana");
			p.setNomePai("Reinaldo");
			p.setSalario(200);

			Pessoa p1 = new Pessoa();
			p1.setId(2);
			p1.setNome("Jones");
			p1.setPj(new PessoaJuridica(4321));
			p1.setIdade(31);
			p1.setCidade("Araraquara");
			p1.setEstado("SP");
			p1.setEndereco("Rua varanda");
			p1.setNomeMae("Olinda");
			p1.setNomePai("Edivaldo");
			p1.setSalario(300);

			objPessoa.inserir(p);
			objPessoa.inserir(p1);

			objPessoa.GerarAumento(p);
			
			System.out.println("----Listagem de pessoa-----");
			for (Pessoa pessoa : objPessoa.Impressao()) {

				System.out.println("ID: " + pessoa.getId());
				System.out.println("Nome: " + pessoa.getNome());
				if (pessoa.getPf() != null)
					System.out.println("CPF: " + pessoa.getPf().getCpf());
				if (pessoa.getPj() != null)
					System.out.println("CNPJ: " + pessoa.getPj().getCnpj());
				System.out.println("Cidade" + pessoa.getCidade() + " - " + pessoa.getEstado());
				System.out.println("Endereço: " + pessoa.getEndereco());
				System.out.println("Nome da mãe: " + pessoa.getNomeMae());
				System.out.println("Nome do pai: " + pessoa.getNomePai());
				System.out.println("Salario: " + pessoa.getSalario());
			}
			System.out.println("-----------------");

			 

		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
