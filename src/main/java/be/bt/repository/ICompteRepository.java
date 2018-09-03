package be.bt.repository;

import be.bt.domain.Compte;

public interface ICompteRepository {
	void create(Compte c);
	Compte finById(String id);
}
