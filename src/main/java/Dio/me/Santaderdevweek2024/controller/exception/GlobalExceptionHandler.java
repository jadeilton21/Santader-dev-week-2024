package Dio.me.Santaderdevweek2024.controller.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    private final Logger logger  = LoggerFactory.getLogger(GlobalExceptionHandler.class);

}
