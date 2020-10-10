package com.sky.Diary.controller

import com.sky.Diary.bean.Greet
import com.sky.Diary.mapper.DepartmentMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/")
    public fun Greeting():Greet{
        return Greet(1,"hello world")
    }

    @GetMapping("/user")
    public fun Greeting(@RequestParam(value = "name", defaultValue = "World") name:String):Greet{
        return Greet(1,"hello world $name")
    }

    @Autowired
    lateinit var mapper: DepartmentMapper

    @GetMapping("/depart/{id}")
    public fun Greeting(@PathVariable id:Int):Greet{
        return mapper.getGreet(id)
    }

}