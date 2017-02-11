<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.0.min.js"></script>

</head>
<body>
<div class="main">
    <p>请选择一段文字</p>
    <input type="radio" id="cf"  value="1" checked /><label for="cf">文件上传</label>
    <input type="radio" id="ct"  value="2"/><label for="ct">文本输入</label>
    <br><br><br>

    <div class="textUploadDiv" id="textdiv" style="display: none">
        <!--文本输入统计-->
        <form name="submittext" action=""${pageContext.request.contextPath}/count" method="post"  >
            <textarea class="textarea" name="content" id="text" placeholder="请在此输入文本内容"></textarea>
            <input type="submit" value="统计" class="btn_submit" id="btn_submit_text">
            <input type="reset" value="清空内容" class="btn_reset">
        </form>
    </div>
    <div class="textUploadDiv" id="filediv">
        <!--文件上传统计-->
        <form id="fileform" action=""${pageContext.request.contextPath}/countFile" method="post" enctype="multipart/form-data">
            <input type="file" name="uploadContent">
            <input type="submit" value="统计" class="btn_submit" id="btn_submit_file">
            <input type="reset" value="清空内容" class="btn_reset">
        </form>
    </div>

    <div>
        <p>各统计内容的个数如下：</p>
        <table class="result">
            <tr>
                <td class="one">统计项</td>
                <td>个数</td>
            </tr>
            <tr>
                <td class="one">英文字母</td>
                <td><span id="enCount"></span></td>
            </tr>
            <tr>
                <td class="one">数字</td>
                <td><span id="numCount"></span></td>
            </tr>
            <tr>
                <td class="one">中文汉字</td>
                <td><span id="chCount"></span></td>
            </tr>
            <tr>
                <td class="one">中英文标点符号</td>
                <td><span id="chOtherCount"></span></td>
            </tr>
        </table>

        <p>文中出现频率最高的三个字是：</p>
        <table class="result">
            <tr>
                <td class="one">名称</td>
                <td>个数</td>
            </tr>
            <tr>
                <td class="one"><span id="top1Key"> </span></td>
                <td><span id="top1Value"> </span></td>
            </tr>
            <tr>
                <td class="one"><span id="top2Key"> </span></td>
                <td><span id="top2Value"> </span></td>
            </tr>
            <tr>
                <td class="one"><span id="top3Key"> </span></td>
                <td><span id="top3Value"> </span></td>
            </tr>
        </table>
    </div>

</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
</html>