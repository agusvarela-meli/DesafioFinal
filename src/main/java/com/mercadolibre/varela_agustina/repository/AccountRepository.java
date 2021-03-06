package com.mercadolibre.varela_agustina.repository;

import com.mercadolibre.varela_agustina.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    // TODO la query se puede borrar
    @Query("FROM Account a where a.username=:username and a.password=:password ")
    Account findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    //Account findByUsernameAndCountryHouseId(String username, Long countryHouseId);

    Optional<Account> findByUsername(String username);
}