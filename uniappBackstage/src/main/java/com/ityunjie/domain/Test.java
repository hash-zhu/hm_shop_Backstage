package com.ityunjie.domain;

import javax.persistence.*;

/**
 * 1	会员验证码短信	usercode	您的验证码为：{code}，{valid}分钟内有效。	1
 * 2	欢迎新用户短信	welcomemsg	欢迎成为{webname}会员，你的用户名为：{username}，注意保管好您的账户信息。	1
 * 3	订单确认通知	order_confirm	尊敬的{username}，您在{webname}的订单已确认，订单号为：{orderno}，共计{amount}元，我们会尽快安排发货。	1
 * 4	订单发货通知	order_express	尊敬的{username}，您在{webname}的订单已发货，订单号为：{orderno}，请注意查收。	1
 * 5	订单完成通知	order_complete	尊敬的{username}，您在{webname}的一笔订单交易完成，订单号为：{orderno}，期待下次光临，祝您购物愉快。	1
 */
@Entity
@Table(name = "dt_sms_template")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String titile;

    @Column(name = "call_index")
    private String callIndex;

    @Column(name = "content")
    private String content;

    @Column(name = "is_sys")
    private Integer isSys;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getCallIndex() {
        return callIndex;
    }

    public void setCallIndex(String callIndex) {
        this.callIndex = callIndex;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIsSys() {
        return isSys;
    }

    public void setIsSys(Integer isSys) {
        this.isSys = isSys;
    }
}
