package br.com.giulianabezerra.virtualthreadsspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
  @GetMapping
  public String getDemoBlocking() throws InterruptedException {
    Thread.sleep(3000);
    return "Hi, I'm a demo!";
  }

}
