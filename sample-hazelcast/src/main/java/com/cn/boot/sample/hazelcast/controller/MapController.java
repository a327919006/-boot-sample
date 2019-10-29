package com.cn.boot.sample.hazelcast.controller;

import com.cn.boot.sample.api.model.Constants;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @author Chen Nan
 */
@Slf4j
@RestController
@RequestMapping("/map")
@Api(tags = "MAP", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MapController {

    @Autowired
    private HazelcastInstance hazelcastInstance;

    @ApiOperation("保存数据")
    @PostMapping("/{map}")
    public String set(@PathVariable String map, @RequestParam String key, @RequestParam String value, Long ttl) {
        if(ttl == null){
            ttl = 0L;
        }
        IMap<String, String> dataMap = hazelcastInstance.getMap(map);
        dataMap.put(key, value, ttl, TimeUnit.MILLISECONDS);
        return Constants.MSG_SUCCESS;
    }

    @ApiOperation("获取")
    @GetMapping("/{map}")
    public String get(@PathVariable String map, @RequestParam String key) {
        IMap<String, String> dataMap = hazelcastInstance.getMap(map);
        return dataMap.get(key);
    }

    @ApiOperation("所有")
    @GetMapping("/{map}/all")
    public IMap<Object, Object> all(@PathVariable String map) {
        return hazelcastInstance.getMap(map);
    }

}
