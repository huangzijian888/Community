package cn.huangzijian888.community.mapper;

import cn.huangzijian888.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author huangzijian888
 */
@Mapper
public interface QuestionMapper {
    /**
     * 保存问题到数据库
     * @param question
     */
    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);

    /**
     * 从数据库查询所有问题
     *
     * @return
     */
    @Select("select * from question")
    List<Question> list();
}
