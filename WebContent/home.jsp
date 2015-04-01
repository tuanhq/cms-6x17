<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Trang chủ</title>
  <link rel="stylesheet" href="plugin/css/bootstrap.css">
  <link rel="stylesheet" href="plugin/css/main.css">
  
  </head>
<body>
  <!--navbar start-->
  <nav class="navbar navbar-inverse" style="margin-bottom: 0px" >
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="/listCharge.do">Trang chủ</a>
      </div>
      <div>
        <ul class="nav navbar-nav">          
          <li>
            <a href="/listContent.do">Danh sách nội dung</a>
          </li>
          <li>
            <a href="/editContent.do?action=add">Thêm mới nội dung</a>
          </li>
          <li>
            <a href="giaithuong.html">Giải thưởng</a>
          </li>
          <li>
            <a href="FAQs.html">FAQs</a>
          </li>
          <li>
            <a href="lienhe.html">Liên hệ</a>
          </li>
          
          
        </ul>
        <form role="search" class="navbar-form navbar-right">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="từ khóa"></div>
          <button class="btn btn-default" type="button">Tìm kiếm</button>
        </form>
      </div>
    </div>
  </nav>
  <!--navbar end-->

  <!--practice here-->
  <div class="col-md-2" style="padding-left: 0px ">
  <ul class="nav nav-pills nav-stacked">
         <li class="active">
            <a href="/listCharge.do">Danh sách charging</a>
          </li>
          <li class="active">
            <a href="/listContent.do">Danh sách nội dung</a>
          </li>
          <li class="active">
            <a href="/editContent.do?action=add">Thêm mới nội dung</a>
          </li>
          <li class="active">
            <a href="FAQs.html">FAQs</a>
          </li>
          <li class="active">
            <a href="lienhe.html">Liên hệ</a>
          </li>
          <li class="active">
            <a href="dstrungthuong.html">Danh sách trúng thưởng</a>
          </li>
  </ul>
  </div>

  <div class="col-md-10">
  <div class="gioi-thieu">
            <h1 class="title">Rinh bộ ba - tết phát tài</h1>
            <p>03 giải phát lộc trị giá <span>80.000.000</span> đồng/giải</p>
            <p>03 giải phát tài trị giá <span>20.000.000</span> đồng/giải</p>
            <p>12 giải lộc xuân trị giá <span>5.000.000</span> đồng/giải</p>
            <p>90 giải may mắn trị giá <span>500.000</span> đồng/giải</p>
            <p class="soan-tn">Soạn <span>DK</span> gửi <span>9170</span></p>
        </div>
  </div>

  <script src="plugin/js/jquery-2.1.1.min.js" type="text/javascript" charset="utf-8"></script>
  <script src="plugin/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>