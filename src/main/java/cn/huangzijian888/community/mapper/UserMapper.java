package cn.huangzijian888.community.mapper;

import cn.huangzijian888.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author huangzijian888
 */
@Mapper
public interface UserMapper {

    /**
     * @param user
     * 插入用户信息
     */
    @Insert("insert into USER  (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
