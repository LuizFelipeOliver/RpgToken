package com.token.RpgToken.controller;

import com.token.RpgToken.model.RpgSheet;
import com.token.RpgToken.service.RpgSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sheet")
public class RpgSheetController {
    @Autowired
    private RpgSheetService sheetService;

    @GetMapping
    public List<RpgSheet> listSheet(){
        return sheetService.listSheet();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RpgSheet> findSheet(@PathVariable Long id){
        RpgSheet sheet = sheetService.findSheet(id);
        if (sheet != null){
            return ResponseEntity.ok(sheet);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<RpgSheet> createSheet(@RequestBody RpgSheet sheet){
        RpgSheet newSheet = sheetService.createSheet(sheet);
        return ResponseEntity.status(HttpStatus.CREATED).body(newSheet);
    }

    @PostMapping("/{id}")
    public ResponseEntity<RpgSheet> updateSheet(@PathVariable Long id, @RequestBody RpgSheet sheet){
        RpgSheet updateSheet = sheetService.updateRpgSheet(id, sheet);
        return ResponseEntity.ok(updateSheet);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Void> deleteSheet(@PathVariable Long id){
        sheetService.deleteSheet(id);
        return ResponseEntity.noContent().build();
    }
}
