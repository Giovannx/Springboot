package com.parchecuritaa.parchecuritaa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parchecuritaa.parchecuritaa.Repositories.CentroMedicoRepository;
import com.parchecuritaa.parchecuritaa.models.CentroMedico;

@Service

public class CentrosMedicosServicesimpl implements CentrosMedicosServices  {

    @Autowired
        CentroMedicoRepository centroMedicoRepository;
        
        
    @Override
    public List<CentroMedico> listaCentrosMedicos() {
      return centroMedicoRepository.findAll();
      
    }

    @Override
    public CentroMedico buscarCentroMedicoPorId(Long id) {
        Boolean existe = centroMedicoRepository.existsById(id);
        if (existe){
            CentroMedico centroElegido = centroMedicoRepository.findById(id).get();
            return centroElegido;
        }else{
            System.out.println("Id no es valido");
            return null;
        }
    }

    @Override
    public CentroMedico guardarCentroMedico(CentroMedico CentroMedicoNuevo) {
        return centroMedicoRepository.save(CentroMedicoNuevo);
        
    }

    @Override
    public CentroMedico editarCentroMedicoporiD(Long id, CentroMedico CentroMedicoActualizado) {
        Boolean existe = centroMedicoRepository.existsById(id);
        if (existe){
            CentroMedico centroElegido = centroMedicoRepository.findById(id).get();
            centroElegido.setComuna(CentroMedicoActualizado.getComuna());
            centroElegido.setDireccionCentroMedico(CentroMedicoActualizado.getDireccionCentroMedico());
            centroElegido.setHora(CentroMedicoActualizado.getHora());
            centroElegido.setNombreCentrosMedicos(CentroMedicoActualizado.getNombreCentrosMedicos());
            centroElegido.setCentroMedicoId(CentroMedicoActualizado.getCentroMedicoId());
            centroElegido.setTelefonoCentroMedico(CentroMedicoActualizado.getTelefonoCentroMedico());
            System.out.println("Se actualizo el centro medico");
            return centroMedicoRepository.save(centroElegido);
        }else{
            System.out.println("Id invalido");
            return null;
        }
        
    }

    @Override
    public void eliminarCentroMedicoPorId(Long id) {
        centroMedicoRepository.deleteById(id);
    }
    
} //donde esta el error en este codigo?
