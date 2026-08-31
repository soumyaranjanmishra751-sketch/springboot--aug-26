package com.jt.intro_to_web;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/home")
    public void sayHello(PrintWriter writer){

        System.out.println("Hello web");
        writer.println("<h1>Hello Spring Web</h1> <p>Welcome home");
    }

    @RequestMapping("/")
    public void landingPage(PrintWriter printWriter){
        System.out.println("landing page");
        printWriter.println("our First Landing Page");
    }


     @RequestMapping("/contact")
    public String contact(PrintWriter printWriter){
       return "contact-page";
    }
    // @RequestMapping("/submit-details")
    // public String submitDetails(HttpServletRequest request,Model model){
    //     System.out.println("submit details hahdled");
    //     String name = request.getParameter("name");
    //     String phone = request.getParameter("phone");

    //     // System.out.println("name is " + name);
    //     //  System.out.println("phone is " + phone);

    //      model.addAttribute("name",name);
    //      model.addAttribute("phone",phone);
    //      return "details-page";
    //}

    // @RequestMapping( value ="/submit-details", method =RequestMethod.POST)
    //  public String submitDetails(@RequestParam(value ="name1" , required = false, defaultValue = "SpringBoot") String name1, @RequestParam String phone, Model model){
        
    //      model.addAttribute("name1",name1);
    //       model.addAttribute("phone",phone);
    //       return "details-page";
    //  }


     @RequestMapping( value ="/submit-details", method =RequestMethod.POST)
     public String submitDetaill(@ModelAttribute person person, Model model ){
        
         model.addAttribute("name1",person.getname());
          model.addAttribute("phone",person.getPhone());

          return "details-page";
     }
}
