package io.dfjinxin.modules.tag.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 数据表
 *
 * @author z.h.c
 * @email z.h.c@126.com
 * @date 2019-06-16 15:18:37
 */
@Data
@TableName("data_tbl")
public class TagDataTblEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 数据表ID
     */
    @TableId
    private Integer dataTblid;
    /**
     * 数据库ID
     */
    private Integer dbid;
    /**
     * 数据表物理名称
     */
    private String dataTblPhysNm;
    /**
     * 数据表中文名称
     */
    private String dataTblCnNm;
    /**
     * 数据表描述
     */
    private String dataTblDesc;
    /**
     * 创建日期
     */
    private Date createDt;
    /**
     * 更新日期
     */
    private Date updDt;
    /**
     * 删除日期
     */
    private Date delDt;

    /**
     * 数据库名称
     */
    @TableField(exist = false)
    private String dbPhysNm;

}
