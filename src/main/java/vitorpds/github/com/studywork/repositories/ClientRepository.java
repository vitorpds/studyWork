package vitorpds.github.com.studywork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vitorpds.github.com.studywork.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
