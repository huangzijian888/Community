package cn.huangzijian888.community.mapper;

import cn.huangzijian888.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author huangzijian888
 */
@Mapper
public interface UserMapper {

    /**
     * 插入用户信息
     *
     * @param user
     */
    @Insert("insert into USER  (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    /**
     * 通过token查找用户
     *
     * @param token
     * @return
     */
    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

    /**
     * 根据ID查找用户
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Integer id);
}
