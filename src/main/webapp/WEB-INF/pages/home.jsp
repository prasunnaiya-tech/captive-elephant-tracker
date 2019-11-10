<html>
<head>
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/global.css">
<script src="js/jquery_min.js"></script>
<script>
function checkSearchInput (elementId, formId, defaultValue) {
		var $elem = $('#'+formId).find('#'+elementId);
			if($elem.val() == defaultValue) {
				return false;
			}
			if($elem.val().trim() == "") {
				return false;
			}
			return true;
	}

function getSugestion( userData ) {
		var region = getParameterByName("region");		
		$.ajax({
		  type: "GET",
		  url: window.basePath + "suggestions.view",
		  data: { search: userData, region: region }
		}).done(function( msg ) {
			var hasSuggestion = false;
			var innerData = "<div><h2>Try these Suggestions</h2></div><ul>";
			myData = JSON.parse(msg, function (key, value) {				
				if(key && value) {
					if(key != "suggestions") {							
							innerData = innerData + "<li>" + value + "</li>";
							hasSuggestion = true;
					}					
				}
			});			
			innerData = innerData + "</ul>";
			innerData = innerData + "<div><p><a href='javascript:submitForm(\"masthead_search\");'>See all search results</a></p></div>";
		    if(hasSuggestion) {
				$("#suggestion").html(innerData);
				$("#suggestion").removeClass("hidesuggestion");
				$("#suggestion").addClass("diplaysuggestion");
			}
		});
	}	

$(document).ready(function(){
	$(".active").click(function(){
		$("#divsearch").css('display', 'block');
		$("#divuplaod").css('display', 'none');
		$("#divlogin").css('display', 'none');
	});
    $("#btnlogin").click(function(){        
        
		var flag = true;		
		var username = $('#uname').val();
		var password = $('#psw').val();
		
		//Blank field validation of username, The function will generate an alert message if "username" field is blank  
		if(username == '')
		{
			alert('Please enter your User Name');
			$('#uname').focus(); //The focus function will move the cursor to "fullname" field
			flag = false;
		}
		else if(password == '')
		{
			alert('Please enter your Password');
			$('#psw').focus();
			flag = false;
		}

		if(flag){
			$(".vertical-menu").css('display', 'block');
			$("#divuplaod").css('display', 'block');
			$("#divlogin").css('display', 'none');
		}
    });
});
</script>
</head>
<html>
<body class="bg">
<div class = "main">
	<table>
		<tr>
			<td align="left" width="5%"><img src="img/elephant-icon.jpg"></td>
			<td align="left"><div class="geek1">Real Time Captive Elephant Tracking System</div></td>
			<td width="20%">
				<div class="vertical-menu" style="display: none;">
					<a href="#" class="active"><img src="img/search.png"></a>	
				</div>
			</td>
		</tr>
	</table>
		<br />
		<table>
		<tr>
			<td width="35%"></td>
			<td width="60%" align="center">
				<div id="divlogin" style="display: block;">
					<form id="frmlogin" action="" method="post">
						<div class="container">
							<div class="lbltxt"><b>Username</b></div>
							<input type="text" placeholder="Enter Username" name="uname" id="uname">

							<div class="lbltxt"><b>Password</b></div>
							<input type="password" placeholder="Enter Password" name="psw" id="psw">

							<button id="btnlogin" type="button">Login</button>
						</div> 	  			  
					</form>
				</div>
				<div id="divuplaod" style="display: none;">					
						<form id="frmupload" action="" method="post">
							<div class="container">
								 <div class="lbltxt"><b>Elephant Name</b></div>
								 <input type="text" placeholder="Enter Elephant Name" name="ename" required>
								 <div class="lbltxt"><b>Owner's Name</b></div>
								 <input type="text" placeholder="Enter Owner's Name" name="owname" required>
								 <div class="lbltxt"><b>Current Location</b></div>
								 <input type="text" placeholder="Enter Current Location" name="clname" required>								 
								 <input type="file" name="name" multiple><br><br></b>
								 <div class="lbltxt"><b>After uploading multiple files, click Submit.<br><br></div>
								 <button id="btnupload" type="button">Submit</button>
							</div>
						</form>
				</div>
				<div id="divsearch" style="display: none;">
					<div id="left_column"></div>
					<div id="right_column">
					   
					   <form action="" id="masthead_search" method="get">
						   <label for="search_input">Search&nbsp;</label>
							  <input id="search_input" name="search_input" onclick="switchUNField('search_input', 'masthead_search', 'Search');" type="text" value="Search" autocomplete="off">		      
					
							  <input id="search_button" type="submit" value="Go " onclick="return checkSearchInput('search_input', 'masthead_search', 'Search');"> 
							  
							  </div>	      
					   </form> 
					</div>
					<div class="clearer"></div>
				</div>
			</td>
			<td width="5%"></td>
		</tr>
	</table>     
</div>
</body>