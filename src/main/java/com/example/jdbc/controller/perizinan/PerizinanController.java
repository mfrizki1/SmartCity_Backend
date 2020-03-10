package com.example.jdbc.controller.perizinan;


import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.perizinan.Perizinan;
import com.example.jdbc.service.pengaduan.PengaduanService;
import com.example.jdbc.service.perizinan.PerizinanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("perizinan")
public class PerizinanController {

    @Autowired
    PerizinanService perizinanService;

    @PostMapping("/perizinans/")
    public ResponseEntity postPerizinan(@RequestBody Perizinan p)
    {
        HttpResponModel t = perizinanService.postPerizinan(p);
        return ResponseEntity.ok(t);
    }


}
