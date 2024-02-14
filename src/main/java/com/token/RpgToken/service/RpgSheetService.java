package com.token.RpgToken.service;

import com.token.RpgToken.model.RpgSheet;
import com.token.RpgToken.repository.RpgSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RpgSheetService {
    @Autowired
    private RpgSheetRepository sheetRepository;

    public RpgSheet createSheet(RpgSheet sheet){
        return sheetRepository.save(sheet);
    }

    public List<RpgSheet> listSheet(){
        return sheetRepository.findAll();
    }

    public RpgSheet findSheet(Long id ){
        return sheetRepository.findById(id).orElse(null);
    }

    public RpgSheet updateRpgSheet(Long id, RpgSheet sheet){
        sheet.setId(id);
        return sheetRepository.save(sheet);
    }

    public void deleteSheet(Long id){
        sheetRepository.deleteById(id);
    }
}
