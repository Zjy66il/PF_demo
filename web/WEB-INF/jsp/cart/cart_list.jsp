<%--
  Created by IntelliJ IDEA.
  User: Zjy66i
  Date: 2019/12/7
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="utf-8" %>
<%@page import="main.action.cart.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>优质好书供您选择</title>
    <link href="${pageContext.request.contextPath}/css/shopping_vehicle.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/cart.list.js"></script>
</head>
    <body>
    <br />
    <br />
    <div class="my_shopping">
        <img class="pic_shop" src="../images/pic_myshopping.jpg" />
    </div>

    <div id="div_choice" class="choice_merch">
        <h2 id="cart_tips">
            您已选购以下商品：
            &nbsp;<span style="color:red"><a href="cart!clear">清空购物车</a></span>
        </h2>

        <div class="choice_bord">
            <table class="tabl_buy" id="tbCartItemsNormal">
                <tr class="tabl_buy_title">
                    <td class="buy_td_6">
                        <span>&nbsp;</span>
                    </td>
                    <td>
                        <span >商品名</span>
                    </td>
                    <td>
                        <span >封面</span>
                    </td>
                    <td class="buy_td_5">
                        <span class="span_w2">市场价</span>
                    </td>
                    <td class="buy_td_4">
                        <span class="span_w3">折后价</span>
                    </td>
                    <td class="buy_td_1">
                        <span class="span_w2">数量</span>
                    </td>
                    <td class="buy_td_2">
                        <span>变更数量</span>
                    </td>
                    <td class="buy_td_1">
                        <span>删除</span>
                    </td>
                </tr>
                <tr class='objhide' over="no">
                    <td colspan="8">&nbsp;</td>
                </tr>

                <!-- 购物列表开始 -->
                <s:iterator value="ciBuy" var="ci">
                    <tr class='td_no_bord'>

                        <td style='display: none'></td>

                        <td class="buy_td_6">
                            <span class="objhide"><img /> </span>
                        </td>
                        <td>
                            <a href="http://localhost:8880/PF_demo/main/book_view?id=${ci.pro.id }">${ci.pro.book_name }</a>
                        </td>
                        <td>
                            <a href="http://localhost:8880/PF_demo/main/book_view?id=${ci.pro.id }">
                                <IMG id=img_show_prd src="../productImages/${ci.pro.book_pic }" width="75px"></a>
                        </td>
                        <td class="buy_td_5">
                            <span class="c_gray">${ci.pro.fixed_price}</span>
                        </td>
                        <td class="buy_td_4">
                            &nbsp;&nbsp;
                            <span>￥${ci.pro.discount_price}</span>
                        </td>
                        <td class="buy_td_1">
                            &nbsp;&nbsp;${ci.num }
                        </td>
                        <td >
                            <input class="del_num" type="text" size="3" maxlength="4"/>
                            <a href="cart!modify?id=${ci.pro.id }&num=">变更</a>
                        </td>
                        <td>
                            <a href="cart!delete?id=${ci.pro.id }">删除</a>
                        </td>
                    </tr>
                </s:iterator>
            </table>
                <!-- 购物列表结束 -->

            <div class="choice_balance">
                <div class="select_merch">
                    <a href="${pageContext.request.contextPath}/main/mainAction"> 继续挑选商品>></a>
                </div>

                <div class="total_balance">
                    <div class="save_total">
                        <span class="t_add">商品金额总计:</span>
                        <span class="c_red_b">
                            ￥<span id='total_account'>${totalPrice}</span>&nbsp;&nbsp;&nbsp;
                        </span>
                    </div>
                    <div id="balance" class="balance">
                        <a name='checkout' href='../order/confirm' >
                            <img src="${pageContext.request.contextPath}/images/butt_balance.jpg" alt="结算" border="0" title="结算" />
                        </a>
                    </div>
                </div>

            </div>
        </div>
    </div>
    </body>
</html>
