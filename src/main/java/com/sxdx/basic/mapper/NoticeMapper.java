package com.sxdx.basic.mapper;

import com.sxdx.basic.bean.Notice;
import com.sxdx.basic.bean.NoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @Program: crm
 * @since: JDK 1.8
 * @Description:
 * @author: Likyeong
 * @date: 2020/2/22 11:32
 **/
public interface NoticeMapper {
    long countByExample(NoticeExample example);

    int deleteByExample(NoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByExample(NoticeExample example);

    Notice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}