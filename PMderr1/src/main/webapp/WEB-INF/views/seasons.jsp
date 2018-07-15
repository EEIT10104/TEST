<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html lang="en-US">
    <head>
        <title>Boxus - Html Responsive One Page Template</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="description" content="Template by Colorlib" />
        <meta name="keywords" content="HTML, CSS, JavaScript, PHP" />
        <meta name="author" content="Colorlib" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <link rel="shortcut icon" href="images/favicon.png" />
        <link href='http://fonts.googleapis.com/css?family=Roboto:300,400,400i,700,700i,900|Montserrat:400,700|PT+Serif' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" type="text/css"  href='css/clear.css' />
        <link rel="stylesheet" type="text/css"  href='css/common.css' />
        <link rel="stylesheet" type="text/css"  href='css/font-awesome.min.css' />
        <link rel="stylesheet" type="text/css"  href='css/carouFredSel.css' />
        <link rel="stylesheet" type="text/css"  href='css/prettyPhoto.css' />
        <link rel="stylesheet" type="text/css"  href='css/sm-clean.css' />
        <link rel="stylesheet" type="text/css"  href='css/style.css' />

        <!--[if lt IE 9]>
                <script src="js/html5.js"></script>
        <![endif]-->
<style> 
.season{ 
   
   display: inline-block;
    color: #e54b76;
    border: 2px solid #e54b76;
    background-color:white;
    text-align: center;
    line-height:10px;
    
    height:10px;
    padding-bottom: 15px;
    padding-top: 15px;
    padding-left: 50px;
    padding-right:50px;
    cursor: pointer;
    margin-top: 25px;
    vertical-align: middle;
    text-decoration: none;
    font-size: 12px;
    font-weight: 1000;
    
    transition: all .2s linear;
    }
    .season:active
{
    position: relative;
    top: 1px;	
}
.season:hover
{
    color: white;
    background-color: #e54b76;
}</style>
    </head>
    <body class="single-portfolio">

        <!-- Preloader Gif -->
        <table class="doc-loader">
            <tr>
                <td>
                    <img src="images/ajax-document-loader.gif" alt="Loading..." />
                </td>
            </tr>
        </table>

        <!-- Menu -->
        <div class="menu-wrapper center-relative">
            <nav id="header-main-menu">
                <div class="mob-menu">MENU</div>
                <ul class="main-menu sm sm-clean">
                    <li><a href="#home">Home</a></li>
                    <li><a href="#services">Services</a></li>
                    <li><a href="#portfolio">Portfolio</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#news">News</a></li>
                    <li><a href="#video">Video</a></li>
                    <li><a href="#skills">Skills</a></li>
                    <li><a href="#contact">Contact</a></li>
                </ul>
            </nav>
        </div>



        <article id="portfolio-2" class="section portfolio">
            <div class="center-relative content-1170">
                <div class="entry-content">
                    <div class="content-wrap relative">
                        <a class="absolute x-close" href="javascript:history.back(-1);">
                            <img src="images/icon_x.svg" alt="Close">
                        </a>

                        <script>
                            var aboutImage_speed = "500";
                            var aboutImage_auto = "false";
                            var aboutImage_hover = "true";
                        </script>
                        <div class="image-slider-wrapper relative img aboutImage">
                            <a id="aboutImage_next" class="image_slider_next" href="#"></a>
                            <div class="caroufredsel_wrapper">
                                <ul id="aboutImage" class="image-slider slides">
                                    <li><img src="demo-images/about_img_04.jpg" alt=""></li>
                                    <li><img src="demo-images/about_img_05.jpg" alt=""></li>
                                    <li><img src="demo-images/about_img_06.jpg" alt=""></li>
                                </ul>
                            </div>
                            <div class="clear"></div>
                        </div>

                        <div class="clear"></div>
                        <br>
                        <br>
                        <br>
                        <div class="one_half text-right">
                            <p>
                                <span style="color: #adadad;">Project Name:</span> Handmade<br>
                                <span style="color: #adadad;">Client:</span> Est Lorem<br>
                                <span style="color: #adadad;">Year:</span> 2017
                            </p>
                            <br>
                            <br>
                            <div class="text-right">
                                <a href="#" target="_self" class="button ">Download</a>
                            </div>
                        </div>
                        <div class="one_half last ">
                           
                            
                            
                   	<section>
		<div>
			<div class="container" style="text-align: center">
				<h1>賽季表</h1>
			</div>
		</div>
	</section>
	<hr
		style="height: 1px; border: none; color: #333; background-color: #333;">
	<section class="container">
		<div class="row">

			<c:forEach var='seasons' items='${seasons}'>
			
				<div class="col-sm-6 col-md-3" style="width: 360px; height: 360px">

					<div class="caption">

						<p>賽季ID: ${seasons.seasonId}</p>
						<p>賽季名稱:${seasons.seasonName}</p>
						<p>比賽地點:${seasons.location}</p>
						<p>賽季開始時間:${seasons.seasonStartDate}</p>
						<p>報名開始時間:${seasons.seasonRegisterStart}</p>
						<p>報名金額:${seasons.payment}</p>
						<p>隊伍報名數量:${seasons.teamSum}</p>
						<p>
							<a href="<spring:url value='season?id=${seasons.seasonId}' />"
								class="season"> <span
								class="glyphicon-info-sigh glyphicon"></span>INFO
							</a>
							<a href="<spring:url value='/delete?id=${seasons.seasonId}' />"
								class="season"> <span
								class="glyphicon-info-sigh glyphicon"></span>DELETE
							</a>
						</p>
					</div>
				</div>
			</c:forEach>
			<p>
					<a href="<spring:url value='/' />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span>回首頁</a>
				</p>
		</div>
	</section>
						
                            
                        </div>
                        <div class="clear"></div>
                    </div>
                </div>
                <div class="clear"></div>
            </div>



            <!-- Footer -->
            <footer>
                <div class="footer content-1170 center-relative">
                    <ul>
                        <li class="copyright-footer">
                            © 2018 All rights reserved. | Boxus Template by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                        </li>
                        <li class="social-footer">
                            <a href="#"><span class="fa fa-twitter"></span></a>
                            <a href="#"><span class="fa fa-behance"></span></a>
                            <a href="#"><span class="fa fa-dribbble"></span></a>
                            <a href="#"><span class="fa fa-facebook"></span></a>
                            <a href="#"><span class="fa fa-rss"></span></a>
                        </li>
                    </ul>
                </div>
            </footer>
        </article>




        <!--Load JavaScript-->
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type='text/javascript' src='js/jquery.sticky-kit.min.js'></script>
        <script type='text/javascript' src='js/jquery.smartmenus.min.js'></script>
        <script type='text/javascript' src='js/jquery.sticky.js'></script>
        <script type='text/javascript' src='js/jquery.dryMenu.js'></script>
        <script type='text/javascript' src='js/isotope.pkgd.js'></script>
        <script type='text/javascript' src='js/jquery.carouFredSel-6.2.0-packed.js'></script>
        <script type='text/javascript' src='js/jquery.mousewheel.min.js'></script>
        <script type='text/javascript' src='js/jquery.touchSwipe.min.js'></script>
        <script type='text/javascript' src='js/jquery.easing.1.3.js'></script>
        <script type='text/javascript' src='js/imagesloaded.pkgd.js'></script>
        <script type='text/javascript' src='js/jquery.prettyPhoto.js'></script>
        <script type='text/javascript' src='js/main.js'></script>
    </body>
</html>
