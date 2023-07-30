package com.rivera.asynchronous;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
public class Controller {

    @Autowired
    private CustomService customService;
    @GetMapping("/hello")
    public String hello() throws InterruptedException, ExecutionException {
        CompletableFuture<Boolean> future = customService.backgroundWork();
        return "Hello Back! with response = " + future.get();
    }
}
