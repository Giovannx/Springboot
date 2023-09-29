package com.parchecuritaa.parchecuritaa.Services;

import java.util.List;

import com.parchecuritaa.parchecuritaa.models.CentroMedico;

public interface CentrosMedicosServices {
    List<CentroMedico> listaCentrosMedicos();

    CentroMedico buscarCentroMedicoPorId(Long id);
    CentroMedico guardarCentroMedico(CentroMedico CentroMedicoNuevo);
    CentroMedico editarCentroMedicoporiD(Long id, CentroMedico CentroMedicoActualizado);
    void eliminarCentroMedicoPorId(Long id);
}
