package br.edu.pattertproject.fireman.part2.chan_responsibility_pattern;

import java.util.HashMap;
import java.util.Map;

import br.edu.pattertproject.fireman.part1.entites.Empresa;
import br.edu.pattertproject.fireman.part1.observer_pattern.Viatura;
import br.edu.pattertproject.fireman.part2.proxy_decorator_pattern.InterfaceDao;;

public class BancoMysql extends RecuperarDado implements InterfaceDao {

	private static BancoMysql bancoMysql;

	private BancoMysql() {
		super();
		listsEmpresas = new HashMap<>();
		listsViaturas = new HashMap<>();
	}

	public BancoMysql(RecuperarDado recuperador) {
		super(recuperador);
		listsEmpresas = new HashMap<>();
		listsViaturas = new HashMap<>();
	}

	public static BancoMysql getInstance() {
		if (bancoMysql == null) {
			bancoMysql = new BancoMysql();
		}
		return bancoMysql;
	}

	@Override
	protected <K, V> Object buscarLista(Map<K, V> map, String nome) {
		if (map.containsKey(nome)) {
			return map.get(nome);
		}
		return null;
	}

	@Override
	protected <K, V> Object recuperarDado(String nome) {
		Object dadoBuscado = null;

		dadoBuscado = buscarLista(listsEmpresas, nome);

		if (dadoBuscado == null) {
			dadoBuscado = buscarLista(listsViaturas, nome);
		}

		return dadoBuscado;
	}

	@Override
	public <K, V> void add(K key, V value) {
		if (value instanceof Empresa) {
			listsEmpresas.put((String) key, (Empresa) value);
		}

		if (value instanceof Viatura) {
			listsViaturas.put((String) key, (Viatura) value);
		}

	}

	@Override
	public <K, V> Object buscar(K key, V value) {

		if (value instanceof Empresa) {
			if (listsEmpresas.containsKey(key)) {
				return listsEmpresas.get(key);
			}
		}

		if (value instanceof Viatura) {
			if (listsViaturas.containsKey(key)) {
				return listsViaturas.get(key);
			}
		}

		return null;
	}

	@Override
	public <K, V> Object remover(K key, V value) {
		if (value instanceof Empresa) {
			if (listsEmpresas.containsKey(key)) {
				return listsEmpresas.remove(key);
			}
		}

		if (value instanceof Viatura) {
			if (listsViaturas.containsKey(key)) {
				return listsViaturas.remove(key);
			}
		}
		return null;

	}

	@Override
	public String toString() {
		return "BancoMysql {ListsEmpresas:" + getListsEmpresas() + "} \n" + "{ListsOcorrências:" + getListsViaturas()
				+ "} \n";
	}

}
