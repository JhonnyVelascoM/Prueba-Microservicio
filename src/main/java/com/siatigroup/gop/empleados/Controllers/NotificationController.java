package com.siatigroup.gop.empleados.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.siatigroup.gop.empleados.Models.ClaseEntity;
import com.siatigroup.gop.empleados.Repositories.ClaseRepository;

@RestController
@RequestMapping("/api/notification")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,
RequestMethod.POST,RequestMethod.PUT})


public class NotificationController {
    @Autowired
    private ClaseRepository claseRepository;

    @GetMapping("/buscatracking/{tracking}")
    public ResponseEntity<ClaseEntity>
buscarProyectoNumero(@PathVariable("tracking")String tracking){
    ClaseEntity proyecto = claseRepository.findByTracking(tracking);
    if(tracking != null){
        return new ResponseEntity<>(proyecto, HttpStatus.OK);

    }else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

}

