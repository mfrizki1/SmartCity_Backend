package com.example.jdbc.controller.jpengaduan;

import com.example.jdbc.model.HttpResponModel;
import com.example.jdbc.model.jpengaduan.JPengaduan;
import com.example.jdbc.service.jpengaduan.JPengaduanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("JP")
public class JPengaduanController {


    @Autowired
    JPengaduanService jPengaduanService;

    @PostMapping("/JenisPengaduan/")
    public ResponseEntity getJID(@RequestBody JPengaduan d)
    {
        HttpResponModel t = jPengaduanService.getJID(d);
        return ResponseEntity.ok(t);
    }
}
