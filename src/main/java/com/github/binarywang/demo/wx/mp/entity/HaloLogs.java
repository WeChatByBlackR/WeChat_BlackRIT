package com.github.binarywang.demo.wx.mp.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("halo_logs")
@Data
public class HaloLogs {
    @TableId
    private long logId;

    @TableField("log_content")
    private String logContent;

    @TableField("log_ip")
    private String logIp;

    @TableField("log_title")
    private String logTitle;
}
