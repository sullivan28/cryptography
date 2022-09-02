package com.api.cryptographyapp.controller;

import com.api.cryptographyapp.bo.CryptographyBO;
import com.api.cryptographyapp.vo.EncryptedDataVO;
import com.fasterxml.jackson.core.io.JsonStringEncoder;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EncryptDataController {

    @PostMapping
    @RequestMapping("/encrypt")
    public ResponseEntity<Object> encryptData(@RequestBody String customerData)
    {
        var cryptographyBO = new CryptographyBO();
        var encryptedDataVO = new EncryptedDataVO();

        encryptedDataVO.setData(cryptographyBO.encryptData( 5, customerData));

        return ResponseEntity.status(HttpStatus.OK).body(encryptedDataVO);
    }

    @PostMapping
    @RequestMapping("/decrypt")
    public ResponseEntity<Object> decryptData(@RequestBody EncryptedDataVO encryptedData)
    {
        var cryptographyBO = new CryptographyBO();
        var decryptData = cryptographyBO.decryptData(5, encryptedData.getData());

        return ResponseEntity.status(HttpStatus.OK).body(decryptData);
    }


}
