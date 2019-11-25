<%--
  Created by IntelliJ IDEA.
  User: Zjy66i
  Date: 2019/11/25
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<h2>
    所有图书
</h2>
<hr>
<div id= book >
    <div class=second_c_02>

        <s:iterator value="books">
            <div class=second_c_02_b1>
                <div class=second_c_02_b1_1>
                    <a href="http://localhost:8080/dangdang/main/book_view?id=${id }" ><img src="${pageContext.request.contextPath}/productImages/${book_pic }" width=70 border=0 /> </a>
                </div>
                <div class=second_c_02_b1_2>
                    <h3>
                        <a href="http://localhost:8080/dangdang/main/book_view?id=${id }" title='${book_name }'>书名:${book_name }</a>
                    </h3>
                    <h4>
                        作者：${author } 著
                        <br />
                        出版社：${publishing }&nbsp;&nbsp;&nbsp;&nbsp;出版时间：${publish_dt }
                    </h4>
                    <h5>
                        简介:${description }
                    </h5>
                    <h6>
                        定价：￥${fixed_price }&nbsp;&nbsp;折后价：￥${discount_price }
                    </h6>
                    <hr>
                    <div class=line_xx></div>
                </div>
            </div>
        </s:iterator>

    </div>
</div>

