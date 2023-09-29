package com.parchecuritaa.parchecuritaa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parchecuritaa.parchecuritaa.Services.CentrosMedicosServicesimpl;
import com.parchecuritaa.parchecuritaa.models.CentroMedico;

@RestController
@RequestMapping("/centromedico")
public class CentroMedicoRestController {
    @Autowired
    CentrosMedicosServicesimpl centrosMedicosServices;
    
    @GetMapping("/lista")
    public List<CentroMedico> listaCentrosMedicos (){
        List <CentroMedico> listaMostrar = centrosMedicosServices.listaCentrosMedicos();
        return listaMostrar;
    }
    
    @GetMapping("/{id}")
    public CentroMedico buscarCentroMedicoPorId(@PathVariable Long id){
        CentroMedico mostrarCentro = centrosMedicosServices.buscarCentroMedicoPorId(id);
        return mostrarCentro;
    }




    
@PostMapping("/nuevo")
    public CentroMedico guardarCentroMedico(@RequestBody CentroMedico centroMedicoNuevo) {
        CentroMedico guardarCentroMedico = centrosMedicosServices.guardarCentroMedico(centroMedicoNuevo);
        return guardarCentroMedico;
    }
@PutMapping("/editar/{id}")
    public CentroMedico editarCentroMedicoporiD (@PathVariable Long id, @RequestBody CentroMedico centroMedicoActualizado){
        CentroMedico centroMedicoEditado = centrosMedicosServices.editarCentroMedicoporiD(id,centroMedicoActualizado);
        return centroMedicoEditado;
    }
@DeleteMapping("/borrar/{id}")
    public String eliminarCentroMedicoPorId (@PathVariable Long id){
        centrosMedicosServices.eliminarCentroMedicoPorId(id);
        return "El Centro Medico a sido borrado exitosamente";
    }
}