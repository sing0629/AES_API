package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/aes/encrypt")
    public String encrypt(@RequestParam(name = "plain_text", defaultValue = "Apple") String plain_text, String aes_key) {
        return AES256.encrypt(plain_text,aes_key);
    }

    @GetMapping("/aes/decrypt")
    public String decrypt(@RequestParam(name = "cipher_text", defaultValue = "McTKAkMng9x9NdOlR8z6Mg==") String cipher_text, String aes_key) {
        return AES256.decrypt(cipher_text,aes_key);
    }

}
