package com.example.jdbc.controller.demografi;


import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.demografi.Demografi;
import com.example.jdbc.service.demografi.DemografiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class DemografiController {

    @Autowired
    DemografiService demografiService;

    @PostMapping("/demografi/")
    public ResponseEntity postDemo(@RequestBody Demografi d)
    {
        HttpResponModel dem = demografiService.postDemo(d);
        return ResponseEntity.ok(dem);
    }

}
