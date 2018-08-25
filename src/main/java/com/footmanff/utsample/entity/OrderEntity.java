/**
 *@Author: zhehan
 *@Date: 2018-1-15
 */
package com.footmanff.utsample.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: Order
 * @Description:
 * @author zhehan
 * @date 2018-1-15
 */
@Data
public class OrderEntity implements Serializable{

    private static final long serialVersionUID = -1;

    /**
     * 订单id
     */
    private Integer id;
    /**
     * 订单类型；1：格格家订单，2：格格团订单，3：格格团全球购订单，4：环球捕手订单，5：燕网订单，6：b2b订单7手q 8云店
     */
    private Integer type;
    /**
     * 同一批订单编号标识
     */
    private Long sameBatchNumber;
    /**
     * 合单批次编号，用于前台显示订单拆合
     */
    private Long batchNumber;
    /**
     * 订单编号，前端展示
     */
    private Long number;
    /**
     * 卖家id
     */
    private Integer sellerId;
    /**
     * 账号id
     */
    private Integer accountId;
    /**
     * 账号使用积分
     */
    private Integer accountPoint;
    /**
     * 账号优惠券id
     */
    private Integer accountCouponId;
    /**
     * N元活动优惠金额
     */
    private Float activitiesOptionalPartPrice;
    /**
     * 优惠券金额
     */
    private Float couponPrice;
    /**
     * 活动满减金额
     */
    private Float activitiesPrice;
    /**
     * 会员卡满减金额
     */
    private Float clubCardManjianPrice;
    /**
     * 实付金额
     */
    private Float realPrice;
    /**
     * 客服调整金额，为正数，代表减少的价格
     */
    private Float adjustPrice;
    /**
     * 收货地址id
     */
    private Integer receiveAddressId;
    /**
     * 订单商家id
     */
    private Integer orderSellerId;
    /**
     * 总价，包含运费
     */
    private Float totalPrice;
    /**
     * 运费，单位元
     */
    private Integer freightMoney;
    /**
     * 实付税费
     */
    private Float totalDutyPrice;
    /**
     * 订单来源渠道id
     */
    private Integer sourceChannelId;
    /**
     * 付款渠道；1：银联，2：支付宝，3：微信
     */
    private Integer payChannel;
    /**
     * app渠道；0[ios及web]、1[其他]、2[360]、3[小米]、4[91]、5[百度]、6[豌豆荚]、7[应用宝]、8[淘宝]、9[vivo]、10[官网]、11[移动网站]、12[搜狗]、13[安智]、14[苏宁易购]、15[华为]、16[广点通-原生]、17[广点通-FEED流]、18[今日头条])、19IOS马甲app
     */
    private Integer appChannel;
    /**
     * app版本
     */
    private String appVersion;
    /**
     * 商家备注
     */
    private String remark;
    /**
     * 客服备注
     */
    private String remark2;
    /**
     * 订单状态；1：未付款，2：待发货，3：已发货，4：交易成功，5：用户取消（待退款团购），6：超时取消（已退款团购），7：团购进行中(团购)
     */
    private Integer status;
    /**
     * 后台导出状态；0：未导出，1：已导出
     */
    private Integer operationStatus;
    /**
     * 客服审单状态；1：待审核，2：审核通过，3：审核不通过
     */
    private Integer checkStatus;
    /**
     * 付款时间
     */
    private Date payTime;
    /**
     * 发货时间
     */
    private Date sendTime;
    /**
     * 发货超时时间
     */
    private Date expireTime;
    /**
     * 发货是否超时，1是，0否
     */
    private Integer isTimeout;
    /**
     * 收货时间
     */
    private Date receiveTime;
    /**
     * 是否用户删除；0：否，1：是
     */
    private Integer isDelete;
    /**
     * 是否需要结算；0：否，1：是
     */
    private Integer isNeedSettlement;
    /**
     * 是否结算；0：否，1：是
     */
    private Integer isSettlement;
    /**
     * 订单结算时间
     */
    private Date settlementTime;
    /**
     * 冻结状态；0：未冻结，1：已冻结，2：已解冻
     */
    private Integer isFreeze;
    /**
     * 是否可用优惠券与积分；0：不可用，1：可用
     */
    private Integer isAvailableCoupon;
    /**
     * 0：普通订单，1：团购订单，2会员订单
     */
    private Integer isGroup;
    /**
     * 是否积分商品订单；0：否，1：是
     */
    private Integer isMemberOrder;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 使用的捕手币金额(单位为分  1捕手币＝100used_coin)
     */
    private Integer usedCoin;
    
}

