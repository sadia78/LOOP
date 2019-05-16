
<html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
	 <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="css\reset.css"> 
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css\table.css">
	<script src="js\modernizr.js"></script> 
  	 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<title>Role</title>
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	 <script src="js\jquery.menu-aim.js"></script>
   <script src="js\main.js"></script> <!-- Resource jQuery -->
    <script type="TJTYRECOMPANY20-12-18\src\main\webapp\js\Ajax.js"> </script>
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>    
      
	
</head>
<body>
	<header class="cd-main-header">		
		<a href="#0" class="cd-nav-trigger"><span></span></a>

		

		<nav class="cd-nav">
			<ul class="cd-top-nav">
		
		<li >
					 <p><a  href="logout" style=" text-decoration: none;"><i class="fa fa-power-off"></i>Logout</a></p>
</li>
	</header> 
</nav>

	<main class="cd-main-content">
	
		<nav class="cd-side-nav">
			
				<br>
					<ul>
					
					
					
					
					<li><a href="role" style=" text-decoration: none;">Role</a></li>
					<li><a href="Posbyall" style=" text-decoration: none;">POS Registration</a></li>
					<li><a href="userAll"style=" text-decoration: none;">USER Registration</a></li>
					<li><a href="listtyre" style=" text-decoration: none;">Item</a></li>
					<li><a href="posstockquantity" style=" text-decoration: none;">Stock Transfer</a></li>
					<li><a href="Salereport" style=" text-decoration: none;">Reports</a></li>	
					</ul>
				

				</nav>
			
				
				 
				 <div class="content-wrapper">
	 <div id="Posreg">
                </div>
            <br>
            <br>
            <c:choose>
            <c:when test="${POS_REG=='POS_REG' }">
	 <form action="tjtyrePOS" method="POST" name="posreg"  onsubmit="return posvalidate()" >
            <div class="container">

                <div class="card">
                    <div class="card-header" style="background-color:orange">

                        <font size="4px" color="white">
                            POS Registration
                        </font>

                    </div>
                    <div class="card-body">


                        <div class="cardpanel">
                            <font color='red'> <span id="error"> </span> </font>
                            <div class="row">

							<div class="col-md-4">
                                            <div class="form-group">
                                                <b><label for="pos">Pos Id</label></b>
                                                <input type="text" class="form-control" id="pos" placeholder="Enter pos Id" name="pos" v-model="pos">
                                            </div>
                                        </div>
										<div class="col-md-4">
                                            <div class="form-group">
                                                <b><label for="pos">Pos Name</label></b>
                                                <input type="text" class="form-control" id="pos" placeholder="Enter pos Name" name="posName" v-model="Name">
                                            </div>
                                        </div>
                                        
							 <div class="col-md-4">
                                            <div class="form-group">
                                                <b><label for="location">Password</label></b>
                                                <input type="text" class="form-control" id="password" placeholder="Enter password" name="password" v-model="password">
                                            </div>
                                        </div>
							
							
							
                    </div>
							
							
							
							
							<div class="row">
							<div class="col-md-4">
                        <div class="form-group">
                            <b><label for="Address1">Address 1</label></b>
                            <textarea class="form-control" id="address1" rows="1" name="address1" ></textarea>
                          	</div>
							</div>
							    <div class="col-md-4">
                    
                            <div class="form-group">
                            <b><label for="Address2">Address 2</label></b>
                            <textarea class="form-control" id="address2" rows="1" name="address2" ></textarea>
                          	</div>
                     </div> 
                     <div class="col-md-4">
                                  <div class="form-group">
                                                <b><label for="pincode">Pincode</label></b>
                                                <input type="text" class="form-control" id="pincode" placeholder="Enter pincode" name="pincode" v-model="pincode" maxlength="6" onkeypress="return isNumber(event)" >
                                            </div>
                                </div>
                               
                                </div>
								<div class="row">
								 <div class="col-md-4">
                                    <div class="form-group">
                          <b><label for="city">CITY</label></b>
                            <select class="form-control" name="cityname" id="city">
                            <option value="">select city</option>
                                <c:forEach var="city" items="${allCity}">
  					<option value="${city.cityname}">${city.cityname}</option>
 						  </c:forEach>
                            </select>
                         

                        </div>
                                </div>
								</div>
                   
                   
                  
                   <div class="row" >
                   
                    <div id="gstnumber" >Gst Number :</div>
                    <div id="gstNo"></div>
						
							</div>
							
							  <div class="row" >
      						   <p id="gstadd">Gst Address :</p><p id="gstaddress"></p>
                     </div>
                     <div class="row">
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-2"></div>
                <div class="col-md-2"><input type="submit" v-on:click="Save" class="btn btn-primary submit-button" value="insert"> </div>
                <div class="col-md-2">
                   </div>
                   
                   <div class="col-md-2"></div>
            </div>
		</form>
		</c:when>
		<c:when test="${posUpdate=='posUpdate' }">
		<form action="updatePos" method="POST" name="posreg"  onsubmit="return posvalidate()" >
            <div class="container">

                <div class="card">
                    <div class="card-header" style="background-color:orange">

                        <font size="4px" color="white">
                            POS Update
                        </font>

                    </div>
                    <div class="card-body">


                        <div class="cardpanel">
                            <font color='red'> <span id="error"> </span> </font>
                            <div class="row">
							<div class="col-md-3">
                                            <div class="form-group">
                                                <b><label for="pos">Pos Id</label></b>
                                                <input type="text" class="form-control" id="pos" placeholder="Enter pos Id/Name" name="pos" value="${pos_update.pos }" v-model="pos" readonly>
                                           </div>
                                        </div>
										<div class="col-md-3">
                                            <div class="form-group">
                                                <b><label for="pos">Pos Name</label></b>
                                                <input type="text" class="form-control" id="pos" placeholder="Enter pos Name" name="posName" value="${pos_update.posName }"  v-model="Name">
                                            </div>
                                        </div>
                                        
							 <div class="col-md-3">
                                            <div class="form-group">
                                                <b><label for="location">Password</label></b>
                                                <input type="text" class="form-control" id="password" placeholder="Enter password" name="password" v-model="password" value="${pos_update.password } ">
                                            </div>
                                        </div>
							
							
							<div class="col-md-3">
                        <div class="form-group">
                            <b><label for="Address1">Address 1</label></b>
                            <textarea class="form-control" id="address1" rows="1" name="address1"  >${pos_update.address1 }</textarea>
                          	</div>
                    </div>
							
							
							
							</div>
							<div class="row">
							    <div class="col-md-4">
                    
                            <div class="form-group">
                            <b><label for="Address2">Address 2</label></b>
                            <textarea class="form-control" id="address2" rows="1" name="address2" >${pos_update.address2 }</textarea>
                          	</div>
                     </div> 
                     <div class="col-md-4">
                                  <div class="form-group">
                                                <b><label for="pincode">Pincode</label></b>
                               		              <input type="text" class="form-control" id="pincode" placeholder="Enter pincode" name="pincode"    maxlength="6" onkeypress="return isNumber(event)"  value=${pos_update.pincode } >                                            </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="form-group">
                          <b><label for="city">CITY</label></b>
                            <select class="form-control" name="cityname" id="city">
                            <option value="">select city</option>
                                <c:forEach var="city" items="${allCity}">
  					<option value="${city.cityname}">${city.cityname}</option>
 						  </c:forEach>
                            </select>
                         

                        </div>
                                </div>
                                </div>
                   
                   
                  
                   <div class="row" >
                   
                    <div id="gstnumber" >Gst Number :</div>
                    <div id="gstNo"></div>
						
							</div>
							
							  <div class="row" >
      						   <p id="gstadd">Gst Address :</p><p id="gstaddress"></p>
                     </div>
                     
                   
           
                     
                     <div class="row">
                                







                        </div>
                    </div>
                </div>
            </div>
            <!--  &nbsp &nbsp  &nbsp &nbsp &nbsp  &nbsp &nbsp <a href="#" class="previous">&laquo; Previous</a>
             -->

          
            <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-2"></div>
                <div class="col-md-2"><input type="submit" v-on:click="Save" class="btn btn-primary submit-button" value="edit"> </div>
                <div class="col-md-2">
                   </div>
                   
                   <div class="col-md-2"></div>
            </div>
			
			 
		</div> <!-- .content-wrapper -->
		</form>
		</c:when>
		</c:choose>
		
		</div>
				 
				 
				 
				 
				 
		
		
	
	</main> <!-- .cd-main-content -->
		

       <script>
       
     //get tyreprice when tyrepattern and tyreprice is selected 
     $(document).ready(function(){
    	 $('#gstnumber').hide();
    	 $('#gstadd').hide();
     });
   	
  	 $(function(){
  	$('#city').on('click', function(){
  	
  		debugger;
  		var  city = $('#city').val();
  		debugger;
  		 $.ajax({
  			 
  	            type: "GET",
  	            contentType: "application/json; charset=utf-8",
  	         	  datatype: "json",
  	            url: "${pageContext.request.contextPath}/findgstno/"+city+"",
  	            
  	            success: function (result) {
  	            	debugger;
  	             	var gstno=result[0];
  	             	var gstaddress=result[1];
  	                 $('#gstNo').val(gstno);
  	               $('#gstnumber').show();
  	               $('#gstNo').text(gstno);
  	             	
  	            	debugger;    
  	            	/*  $('#gstaddress').val(gstaddress); */
  	            $('#gstadd').show();
  	            $('#gstaddress').text(gstaddress);
  	         
  	            	
  	            },
  	            error: function(e){
  	            	
  	            	debugger;
  	            	console.log("error");
  	            }
  		 });
          

  	})
  	})
  

       
          </script>

     <script type="Text/JavaScript">
   
function  posvalidate(){

	if((document.getElementById('pos').value==""))
	 {
	  document.getElementById('error').innerHTML = "Please Enter POS";
	  posreg.pos.focus();
	  return(false);
	 }
	if((document.getElementById('password').value==""))
	 {
	  document.getElementById('error').innerHTML = "Please Enter Password";
	  posreg.password.focus();
	  return(false);
	 }
	if((document.getElementById('city').value==""))
	 {
	  document.getElementById('error').innerHTML = "Please select city";
	  posreg.password.focus();
	  return(false);
	 }
	if((document.getElementById('address1').value==""))
	 {
	  document.getElementById('error').innerHTML = "Please Enter address";
	  posreg.address1.focus();
	  return(false);
	 }
	if((document.getElementById('pincode').value==""))
	 {
	  document.getElementById('error').innerHTML = "Please Enter pincode";
	  posreg.pincode.focus();
	  return(false);
	 }
	
		else 
	{
		 return(true);
	 }
}
function isNumber(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {
    	document.getElementById('error').innerHTML = "Please Enter digit only";
    	posreg.pincode.focus();
        return false;
    }
    return true;
}

  
</script>






</body>
</html>