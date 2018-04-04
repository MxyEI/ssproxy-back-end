package com.company.project.service.impl;

import com.company.project.dao.SsinfoMapper;
import com.company.project.model.Ssinfo;
import com.company.project.service.SsinfoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/04.
 */
@Service
@Transactional
public class SsinfoServiceImpl extends AbstractService<Ssinfo> implements SsinfoService {
    @Resource
    private SsinfoMapper ssinfoMapper;

}
