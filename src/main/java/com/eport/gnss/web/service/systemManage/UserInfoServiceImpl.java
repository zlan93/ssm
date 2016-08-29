package com.eport.gnss.web.service.systemManage;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eport.gnss.web.model.db.dao.GbUserInfoMapper;
import com.eport.gnss.web.model.db.po.GbUserInfo;
import com.eport.gnss.web.model.db.po.GbUserInfoExample;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 * 
 * @author lan
 *
 */

@Service("userInfoService")
@Transactional(rollbackFor = Exception.class)
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private GbUserInfoMapper dbMapper;

    public int countByExample(GbUserInfoExample example) {
        return this.dbMapper.countByExample(example);
    }

    public void loadByPk(GbUserInfo record) {
        record = this.loadByPk(record.getId());
        if (record != null && !"1".equals(record.getStatus())) {
            record = null;
        }
    }

    public GbUserInfo loadByPk(int id) {
        GbUserInfo record = this.dbMapper.selectByPrimaryKey(id);
        if (record != null && "1".equals(record.getStatus())) {
            return record;
        } else {
            return null;
        }
    }

    public GbUserInfo loadByUserName(String username) {
        GbUserInfoExample example = new GbUserInfoExample();
        example.or().andUserNameEqualTo(username).andStatusEqualTo("1");
        List<GbUserInfo> list = dbMapper.selectByExample(example);
        if (list != null && !list.isEmpty())
            return list.get(0);
        else
            return null;
    }

    //正常的update
    public int saveByPk(GbUserInfo record) {
        int result = 0;
        if (null == record.getId() || 0 == record.getId() || null == record.getCreateTime()) {
            result = this.dbMapper.insert(record);
        } else {
            result = this.dbMapper.updateByPrimaryKeySelective(record);
        }
        return result;
    }

    //测试事物回滚的update
    public int saveByPk1(GbUserInfo record) {
        int result = 0;
        if (null == record.getId() || 0 == record.getId() || null == record.getCreateTime()) {
            result = this.dbMapper.insert(record);
            int i=4/0;  //测试事物回滚的
        } else {
            result = this.dbMapper.updateByPrimaryKeySelective(record);
        }
        return result;
    }

    public int deleteByPk(GbUserInfo record) {
        return deleteByPk(record.getId());
    }

    public int deleteByPk(int id) {
        return this.dbMapper.deleteByPrimaryKey(id);
    }

    public List<GbUserInfo> queryList(GbUserInfoExample example) {
        return this.dbMapper.selectByExample(example);
    }

    public int updateSelectiveByPk(GbUserInfo record) {

            return this.dbMapper.updateByPrimaryKeySelective(record);

    }

    public int updateSelectiveByExample(GbUserInfo record, GbUserInfoExample example) {

            return this.dbMapper.updateByExampleSelective(record, example);
    }

}
