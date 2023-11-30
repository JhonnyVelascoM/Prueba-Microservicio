package com.siatigroup.gop.empleados.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.siatigroup.gop.empleados.Models.LogEntity;
import com.siatigroup.gop.empleados.Repositories.LogRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/log")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })

public class LogController {
    @Autowired
    private LogRepository logRepository;

    @GetMapping()
    private ResponseEntity<List<LogEntity>> buscarLogs() {
        return new ResponseEntity<>(logRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{idLogs}")
    private ResponseEntity<LogEntity> buscarLogId(@PathVariable("idLogs") Long idLogs) {
        return new ResponseEntity<>(logRepository.findById(idLogs).get(), HttpStatus.OK);
    }

    @PostMapping()
    private ResponseEntity<LogEntity> crearLog(@RequestBody LogEntity logEntity) {
        return new ResponseEntity<>(logRepository.save(logEntity), HttpStatus.CREATED);
    }
}
