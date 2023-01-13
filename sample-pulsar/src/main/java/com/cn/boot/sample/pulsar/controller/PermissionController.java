package com.cn.boot.sample.pulsar.controller;

import com.cn.boot.sample.api.model.dto.RspBase;
import com.cn.boot.sample.pulsar.dto.PermissionDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.pulsar.client.admin.PulsarAdmin;
import org.apache.pulsar.client.admin.PulsarAdminException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chen Nan
 */
@Slf4j
@RestController
@RequestMapping("/permission")
@Api(tags = "6、授权", produces = MediaType.APPLICATION_JSON_VALUE)
public class PermissionController {

    @Autowired
    private PulsarAdmin client;

    @ApiOperation("授权")
    @PostMapping("/grant")
    public RspBase<String> grant(PermissionDTO dto) throws PulsarAdminException {
        client.topics().grantPermission(dto.getTopic(), dto.getRole(), dto.getAction());
        return RspBase.success();
    }

    @ApiOperation("回收")
    @PostMapping("/revoke")
    public RspBase<String> revoke(String topic, String role) throws PulsarAdminException {
        client.topics().revokePermissions(topic, role);
        return RspBase.success();
    }
}
