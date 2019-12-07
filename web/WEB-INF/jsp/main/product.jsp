<%--
  Created by IntelliJ IDEA.
  User: Zjy66i
  Date: 2019/11/26
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<HTML>
<HEAD>
    <TITLE>图书</TITLE>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/book.list.js"></script>

</HEAD>
<body>
<!-- 头部开始 -->
<%@include file="/common/head.jsp"%>
<!-- 头部结束 -->
<hr>
<DIV id=tag_box style="DISPLAY: none; Z-INDEX: 10; POSITION: absolute"></DIV>
<DIV id=div_shield></DIV>
<DIV id=main>
    <DIV class=mainsearch></DIV>
    <DIV class=wrap>
        <!--left start-->
        <!--left end-->
        <DIV class=right>
            <DIV class=right_wai>
                <DIV class=shuming>
                    <DIV class=shuming_left>

								<SPAN class=black000><A name=top_bk></A>${book.book_name
                                        }</SPAN>
                    </DIV>
                    <DIV class=book_case>
                        <SPAN class=seriesname>丛书名： ${book.book_name }</SPAN>
                    </DIV>
                    <DIV class=empty_box></DIV>
                </DIV>
                <DIV class=book_left>
                    <DIV class=book_pic>
                        <IMG id=img_show_prd
                             src="${pageContext.request.contextPath}/productImages/${book.book_pic }">
                        </A>
                    </DIV>
                    <INPUT id=hid_largepictureurl type=hidden>
                </DIV>
                <DIV class=book_right>
                    <DIV id=author_>
                        作 者： ${book.author }
                    </DIV>
                    <DIV id=publisher_>
                        出 版 社： ${book.publishing }
                    </DIV>
                    <UL>
                        <LI>
                            出版时间： ${book.publish_dt }
                        </LI>
                        <LI>
                            字 数： ${book.word_number }
                        </LI>
                        <LI>
                            版 次： ${book.which_edtion }
                        </LI>
                        <LI>
                            页 数： ${book.total_page }
                        </LI>
                        <LI>
                            印刷时间： ${book.print_dt }
                        </LI>
                        <LI>
                            开 本： 16开
                        </LI>

                        <LI>
                            纸 张： 胶版纸
                        </LI>
                        <LI>
                            I S B N ： ${book.isbn }
                        </LI>
                        <LI>
                            包 装： 平装
                        </LI>
                    </UL>

                    <DIV class=jiage>
								<SPAN class=gray87>定价：<SPAN class=del id=originalPriceTag>￥${book.fixed_price
                                        }</SPAN>
								</SPAN>
                        <SPAN class=redc30>|折后价：￥<B>${book.discount_price }</B>
                        <DIV class=pd_buy_num>
                            <DIV class=clear></DIV>
                        </DIV>
                        </SPAN>
                        <DIV class=goumai>
									<span class="list_r_list_button">
							<a href="<%=request.getContextPath() %>/cart/cartBuy?id= ${book.id }">
							<img src='${pageContext.request.contextPath}/images/buttom_goumai.jpg' /> </a></span>
                            <span id="cartinfo" class="mycartinfo"></span>
                        </DIV>


                    </DIV>
                </DIV>
                <DIV id=dvTPUrls></DIV>
                <DIV id=biaozhu>
                    <DIV class=dashed></DIV>
                    <H2 class=black14>
                        <DIV class=dashed></DIV>
                        <H2 class=black14>
                            内容简介
                        </H2>
                        <DIV class=zhengwen>
                            ${book.description }
                        </DIV>
                        <DIV class=dashed></DIV>
                        <H2 class=black14>

                            目录
                        </H2>
                        <DIV class=zhengwen>
                            ${book.catalogue }
                        </DIV>
                    </H2>
                </DIV>
            </DIV>
        </DIV>
    </DIV>
</DIV>
</BODY>
</HTML>