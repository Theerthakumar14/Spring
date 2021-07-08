<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body{

background-image: url('https://freerangestock.com/sample/140720/perfect-blue-sky-background--with-fluffy-clouds.jpg');
background-position: center;
background-attachment: fixed;
background-size: 100%,100%;


}
img{
display:block;
margin-left: auto;
margin-right:auto;
}
h1{
text-align: center;
font-family: cursive;
color: red;
padding:10px;
border
}
div{
text-align:center;
font-size: 15px;
padding:10px;

}
.button{
font-size:15px;
background-color:green;
color: white;
border:5px solid;
padding-top:5px; 
}
h2{
font-size: 30px;
color: Green;
}


</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mobile-app</title>
</head>
<body >

<h1>welcome to spring mvc</h1>
<img alt="" src="https://i.ytimg.com/vi/cJKQdzopuco/maxresdefault.jpg" width="300px" height="250px">
<div>
<form action="mobile.do" method="post">
<pre>
MobileName:<input type="text" name="name"><br>
MobileBrand:<input type="text" name="brand"><br>
MobileRam:<input type="text" name="Ram"><br>
MobilePrice<input type="text" name="price"><br>
<input type="submit" value="submit" class="button">
</pre>
</form>

</div>
</body>
</html>