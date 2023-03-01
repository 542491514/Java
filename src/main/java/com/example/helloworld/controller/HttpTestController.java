package com.example.helloworld.controller;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;


@RestController
@CrossOrigin
public class HttpTestController
{
    @RequestMapping("/httpByteTest")
    public String httpByteTest(HttpServletRequest request) throws IOException
    {
        String result = "";
        ServletInputStream inputStream= request.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            StringBuilder buffer = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                buffer.append(line);
            }
            result=buffer.toString();
            System.out.println("server returned what you said: "+result);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
        }

        return result;
    }

}
