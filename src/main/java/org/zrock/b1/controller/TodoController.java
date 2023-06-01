package org.zrock.b1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("/todo")
public class TodoController {

    // getList
    @GetMapping("/list")
    public void getList() {
        log.info("getList");
    }

    // getCreate
    @GetMapping("/create")
    public String getCreate() {
        log.info("getCreate");
        return "/todo/create";
    }

    // postCreate
    @PostMapping("/create")
    public String postcreate() {
        log.info("postCreate");
        return "redirect:/todo/list";
    }

    // getRead
    @GetMapping("/read/{bno}")
    public String getRead(@PathVariable("bno") Long bno) {
        log.info("getRead");
        return "/todo/read";
    }

    // getUpdate
    @GetMapping("/update/{bno}")
    public String getUpdate(@PathVariable("bno") Long bno) {
        log.info("getUpdate");
        return "/todo/update";
    }
    
    // postUpdate
    @PostMapping("/update/{bno}")
    public String postUpdate(@PathVariable("bno") Long bno) {
        log.info("postUpdate");
        return "redirect:/todo/read/" + bno;
    }

    // PostDelete
    @PostMapping("/delete/{bno}")
    public String postDelete(@PathVariable("bno") Long bno) {
        log.info("postDelete");
        return "redirect:/todo/list";
    }
}
