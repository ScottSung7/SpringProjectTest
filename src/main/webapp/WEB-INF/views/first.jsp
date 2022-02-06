<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>퍼스트</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i'" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
    <link href="css/firststyle.css" rel="stylesheet">
    
</head>
<body>
    <nav id="nav">
        <h1><a href="">다미</a></h1>
   		<h2><a href="loginForm">로그인</a></h2>
        
    </nav>

    <div id="contents">
        <div id="section1"><h2>4조 다미 프로젝트</h2></div>
        <div id="section2"><h2>팀장 이신영</h2></div>
        <div id="section3"><h2>조원 황인찬</h2></div>
        <div id="section4"><h2>조원 성현규</h2></div>
        <div id="section5"><h2>조원 황성현</h2></div>
        <div id="section6"><h2>조원 신승현</h2></div>
    </div>
     <div id="dot">
        <ul>
            <li class="active"><a href="#"><em>menu1</em></a></li>
            <li><a href="#"><em>menu2</em></a></li>
            <li><a href="#"><em>menu3</em></a></li>
            <li><a href="#"><em>menu4</em></a></li>
            <li><a href="#"><em>menu5</em></a></li>
            <li><a href="#"><em>menu6</em></a></li>
        </ul>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    <script>	
        var dot = $("#dot ul li");
        var cont = $("#contents > div");

        dot.click(function(e){
            e.preventDefault();
            var target = $(this);
            var index = target.index();
            //alert(index);
            var section = cont.eq(index);
            var offset = section.offset().top;
            $("html,body").animate({ scrollTop:offset },600,"easeInOutExpo");
        });
        $(window).scroll(function(){
            var wScroll = $(this).scrollTop();
            
            if(wScroll >= cont.eq(0).offset().top){
                dot.removeClass("active");
                dot.eq(0).addClass("active");
            }
            if(wScroll >= cont.eq(1).offset().top){
                dot.removeClass("active");
                dot.eq(1).addClass("active");
            }
            if(wScroll >= cont.eq(2).offset().top){
                dot.removeClass("active");
                dot.eq(2).addClass("active");
            }
            if(wScroll >= cont.eq(3).offset().top){
                dot.removeClass("active");
                dot.eq(3).addClass("active");
            }
            if(wScroll >= cont.eq(4).offset().top){
                dot.removeClass("active");
                dot.eq(4).addClass("active");
            }
            if(wScroll >= cont.eq(5).offset().top){
                dot.removeClass("active");
                dot.eq(5).addClass("active");
            }
        });
    </script>
    <footer>하단</footer>
</body>
</html>