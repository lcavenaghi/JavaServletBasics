package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banco { 

    private static List<Empresa> lista = new ArrayList<>();
    private static int chaveSequencial = 0;

    
    public static void adiciona(Empresa empresa) {
    	empresa.setId(Banco.chaveSequencial);
    	Banco.chaveSequencial++;
        lista.add(empresa);
    }

    public static Empresa getEmpresa(String id) {
    	for (Empresa empresa : lista) {
			if(empresa.getId().toString().equals(id)) {
				return empresa;
			}
		}
    	return null;
    }
    
    public static List<Empresa> getEmpresas(){ 
        return Banco.lista;
    }
    
    public static void excluirEmpresa(int idEmpresa) {
    	for (int i = 0; i < lista.size(); i++) {
    		if(lista.get(i).getId()==idEmpresa){
    			lista.remove(i);
    			break;
    		}
		}
    }
    
    public static void alteraEmpresa(int idEmpresa, String nomeEmpresa, Date dataAbertura) {
    	for (int i = 0; i < lista.size(); i++) {
    		if(lista.get(i).getId()==idEmpresa){
    			lista.get(i).setNome(nomeEmpresa);
    			lista.get(i).setDataAbertura(dataAbertura);
    			break;
    		}
		}
    }
}