package com.cn.boot.sample.webflux.controller;

import com.cn.boot.sample.webflux.model.Student;
import com.cn.boot.sample.webflux.repository.StudentRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

/**
 * @author Chen Nan
 */
@Slf4j
@RestController
@RequestMapping("/student")
@Api(tags = "学生管理", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class StudentController {

    @Autowired
    private StudentRepository userRepository;

    @ApiOperation("添加")
    @PostMapping
    public Mono<Student> save(@RequestBody @Valid Student student) {
        return userRepository.save(student);
    }

    @ApiOperation("列表")
    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Student> list() {
        return userRepository.findAll();
    }

    @ApiOperation("删除")
    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return userRepository.deleteById(id);
    }

    @ApiOperation("删除")
    @DeleteMapping("/exist/{id}")
    public Mono<ResponseEntity<Void>> deleteExist(@PathVariable String id) {
        return userRepository.findById(id)
                .flatMap(student -> userRepository.delete(student).then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK))))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @ApiOperation("修改")
    @PutMapping("/{id}")
    public Mono<ResponseEntity<Student>> update(@PathVariable String id, @RequestBody Student student) {
        return userRepository.findById(id)
                .flatMap(stu -> {
                    stu.setName(student.getName());
                    stu.setAge(student.getAge());
                    return userRepository.save(stu);
                })
                .map(stu -> new ResponseEntity<>(stu, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @ApiOperation("查询")
    @GetMapping("/{id}")
    public Mono<ResponseEntity<Student>> findById(@PathVariable String id) {
        return userRepository.findById(id)
                .map(stu -> new ResponseEntity<>(stu, HttpStatus.OK))
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @ApiOperation("根据年龄查询")
    @GetMapping("/age/{below}/{top}")
    public Flux<Student> findByAge(@PathVariable Integer below, @PathVariable Integer top) {
        return userRepository.findByAgeBetween(below, top);
    }

    @ApiOperation("根据年龄查询")
    @GetMapping("/query/age/{below}/{top}")
    public Flux<Student> query(@PathVariable Integer below, @PathVariable Integer top) {
        return userRepository.queryByAge(below, top);
    }
}
