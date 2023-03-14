package com.peking.courseresourse.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author yy
 * @email 3110311633@qq.com
 * @date 2023-03-14 20:49:11
 */
@Data
@TableName("tab_case_table")
public class CaseTableEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 实习社区
	 */
	private String internshipCommunity;
	/**
	 * 实习开始时间
	 */
	private Date internshipBegintime;
	/**
	 * 实习结束时间
	 */
	private Date internshipEndtime;
	/**
	 * 工作地点
	 */
	private String workLocation;
	/**
	 * 参与人员
	 */
	private Integer participants;
	/**
	 * 案例名称
	 */
	private String caseName;
	/**
	 * 关键字
	 */
	private String keywords;
	/**
	 * 服务对象
	 */
	private String serviceTarget;
	/**
	 * 案例类型
	 */
	private String caseType;
	/**
	 * 上传资源日期
	 */
	private Date uploadresourceDate;
	/**
	 * 上传资源文件url
	 */
	private String resourceUrl;
	/**
	 * 1代表典型个案，2代表小组活动案例
	 */
	private Integer type;
	/**
	 * 1代表通过审核，0代表待审核
	 */
	private String status;
	/**
	 * 
	 */
	private Integer createBy;

}
