package br.com.sunny.day.cadastro.entrega.repository;

import br.com.sunny.day.cadastro.entrega.objects.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByUser(String user);
}
