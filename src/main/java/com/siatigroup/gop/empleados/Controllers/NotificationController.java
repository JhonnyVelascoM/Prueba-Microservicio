package com.siatigroup.gop.empleados.Controllers;

import com.siatigroup.gop.empleados.Models.CedulaEntity;
import com.siatigroup.gop.empleados.Models.ClaseEntity;
import com.siatigroup.gop.empleados.Models.NumberppbEntity;
import com.siatigroup.gop.empleados.Models.WhEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siatigroup.gop.empleados.Repositories.CedulaRepository;
import com.siatigroup.gop.empleados.Repositories.ClaseRepository;
import com.siatigroup.gop.empleados.Repositories.NumberppbRepository;
import com.siatigroup.gop.empleados.Repositories.WhRepository;
import java.util.List;

@RestController
@RequestMapping("/api/notification")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})

public class NotificationController {
 
    @Autowired
    private ClaseRepository claseRepository;
    @Autowired
    private CedulaRepository cedulaRepository;
    @Autowired
    private NumberppbRepository numberppbRepository;
    @Autowired
    private WhRepository whRepository;

    @GetMapping("/buscatracking/{tracking}")
    public ResponseEntity<ClaseEntity>  buscarProyectoNumero(@PathVariable("tracking") String tracking){
    ClaseEntity proyecto = claseRepository.findByTracking(tracking);
        if (tracking != null){
            return new ResponseEntity<>(proyecto, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/buscacedula/{dni}")
    public ResponseEntity<List<CedulaEntity>> buscarCedula(@PathVariable("dni") String dni) {
        List<CedulaEntity> proyectocedula = cedulaRepository.listaDni(dni);
        if (proyectocedula != null) {
            return new ResponseEntity<>(proyectocedula, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/buscappbnumber/{ppbnumber}")
    public ResponseEntity<NumberppbEntity> buscarProyectoNumeroppbNumber(@PathVariable("ppbnumber") String ppbnumber) {
        NumberppbEntity proyectoppb = numberppbRepository.findByPpbnumber(ppbnumber);
        if (ppbnumber != null) {
            return new ResponseEntity<>(proyectoppb, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/buscawhnumber/{whnumber}")
    public ResponseEntity<WhEntity> buscarProyectoWh(@PathVariable("whnumber") String whnumber) {
        WhEntity proyectowh = whRepository.findByWhnumber(whnumber);
        if (whnumber != null) {
            return new ResponseEntity<>(proyectowh, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }       
}

