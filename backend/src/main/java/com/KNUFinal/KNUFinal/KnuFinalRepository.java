package com.KNUFinal.KNUFinal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface KnuFinalRepository extends JpaRepository<UserDTO,Long> {}
