package cn.huangzijian888.community.service;

import cn.huangzijian888.community.dto.QuestionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangzijian888
 */
public interface QuestionService {
    /**
     * 查询所有问题信息
     * @return
     */
    List<QuestionDTO> list();
}
