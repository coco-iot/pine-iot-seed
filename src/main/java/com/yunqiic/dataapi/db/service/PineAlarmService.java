package com.yunqiic.dataapi.db.service;

import com.github.pagehelper.PageHelper;
import com.yunqiic.dataapi.dao.PineAlarmMapper;
import com.yunqiic.dataapi.db.domain.PineAlarm;
import com.yunqiic.dataapi.db.domain.PineAlarmExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class PineAlarmService extends PineBaseService {

    private final PineAlarm.Column[] result = new PineAlarm.Column[]{PineAlarm.Column.alarmName};
    @Resource
    private PineAlarmMapper pineAlarmMapper;

    public PineAlarm findOneAlarmByName(String alarmName) {
        PineAlarmExample example = new PineAlarmExample();
        example.or().andAlarmNameEqualTo(alarmName).andStatusGreaterThanOrEqualTo(PineAlarmService.STATUS_OK);
        return pineAlarmMapper.selectOneByExample(example);
    }

    public List<PineAlarm> findAlarmByName(String alarmName) {
        PineAlarmExample example = new PineAlarmExample();
        example.or().andAlarmNameEqualTo(alarmName).andStatusGreaterThanOrEqualTo(PineAlarmService.STATUS_OK);
        return pineAlarmMapper.selectByExample(example);
    }

    public PineAlarm findAlarm(Long id) {
        return pineAlarmMapper.selectByPrimaryKey(id);
    }

    public List<PineAlarm> queryByPineAlarmIds(List<Long> pineAlarmIds) {
        PineAlarmExample example = new PineAlarmExample();
        PineAlarmExample.Criteria criteria = example.createCriteria();

        criteria.andPineAlarmIdIn(pineAlarmIds);
        criteria.andStatusGreaterThanOrEqualTo(PineAlarmService.STATUS_OK);

        return pineAlarmMapper.selectByExampleSelective(example);
    }

    public List<PineAlarm> querySelective(List<Long> pineAlarmIds) {
        PineAlarmExample example = new PineAlarmExample();
        PineAlarmExample.Criteria criteria = example.createCriteria();

        criteria.andPineAlarmIdIn(pineAlarmIds);
        criteria.andStatusGreaterThanOrEqualTo(PineAlarmService.STATUS_OK);

        return pineAlarmMapper.selectByExample(example);
    }

    public List<PineAlarm> querySelective(String alarmName, Integer operatorId, Long pineAlarmId,Integer page, Integer limit, String sort, String order) {
        PineAlarmExample example = new PineAlarmExample();
        PineAlarmExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(alarmName)) {
            criteria.andAlarmNameLike("%" + alarmName + "%");
        }
        if(!StringUtils.isEmpty(pineAlarmId)){
            criteria.andPineAlarmIdEqualTo(pineAlarmId);
        }
        if (!StringUtils.isEmpty(operatorId)) {
            criteria.andOperatorIdEqualTo(operatorId);
        }
        criteria.andStatusGreaterThanOrEqualTo(PineAlarmService.STATUS_OK);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return pineAlarmMapper.selectByExample(example);
    }

    public int update(PineAlarm pineAlarm, Long pineAlarmId) {
        PineAlarmExample example = new PineAlarmExample();
        example.or().andPineAlarmIdEqualTo(pineAlarmId);

        long time = PineBaseService.getSecondTimestamp(new Date());
        pineAlarm.setUpdateTime(time);
        return pineAlarmMapper.updateByExampleSelective(pineAlarm, example);
    }

    public int update(PineAlarm pineAlarm, Long clientId, String userCode) {
        PineAlarmExample example = new PineAlarmExample();
        PineAlarmExample.Criteria criteria = example.createCriteria();
        criteria.andClientIdEqualTo(clientId);
        criteria.andUserCodeEqualTo(userCode);

        long time = PineBaseService.getSecondTimestamp(new Date());
        pineAlarm.setUpdateTime(time);
        return pineAlarmMapper.updateByExampleSelective(pineAlarm, example);
    }

    public int updateById(PineAlarm pineAlarm) {
        long time = PineBaseService.getSecondTimestamp(new Date());
        pineAlarm.setUpdateTime(time);
        return pineAlarmMapper.updateByPrimaryKeySelective(pineAlarm);
    }

    public void deleteById(Long id) {
        PineAlarmExample example = new PineAlarmExample();
        example.or().andPineAlarmIdEqualTo(id);
        PineAlarm pineAlarm = new PineAlarm();
        pineAlarm.setStatus(STATUS_DEL);
        pineAlarmMapper.updateByExampleSelective(pineAlarm, example);
    }

    public void add(PineAlarm pineAlarm) {
        long time = PineBaseService.getSecondTimestamp(new Date());
        pineAlarm.setCreateTime(time);
        pineAlarm.setUpdateTime(time);
        if(pineAlarm.getStatus() == null) {
            pineAlarm.setStatus(STATUS_OK);
        }
        pineAlarmMapper.insertSelective(pineAlarm);
    }

    public PineAlarm findById(Long id) {
        return pineAlarmMapper.selectByPrimaryKeySelective(id, result);
    }

    public List<PineAlarm> all() {
        PineAlarmExample example = new PineAlarmExample();
        example.or().andStatusGreaterThanOrEqualTo(PineAlarmService.STATUS_OK);
        return pineAlarmMapper.selectByExample(example);
    }
}
