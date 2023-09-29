package com.parchecuritaa.parchecuritaa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parchecuritaa.parchecuritaa.models.CentroMedico;

@Repository

public interface CentroMedicoRepository extends JpaRepository<CentroMedico,Long>{
}
