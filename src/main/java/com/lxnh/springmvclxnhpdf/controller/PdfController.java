package com.lxnh.springmvclxnhpdf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PdfController {
    @GetMapping(value = "/api")
    public String api() {
        return "api";
    }
}
