<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Feedback</title>
<div align="center">
	<style>
/* Style inputs with type="text", select elements and textareas */
input[type=text], input[type=email], textarea {
	/*   width: 50%; /* Full width */ */
	/*   padding: 6px; /* Some padding */ */
	/*   border: 1px solid #581845; /* Maroon border */ */
	/*   border-radius: 4px; /* Rounded borders */ */
	/*   box-sizing: border-box; /* Make sure that padding and width stays in place */
	*/
	/*   margin-top: 6px; /* Add a top margin */ */
	/*   margin-bottom: 16px; /* Bottom margin */ */
	/*   resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */
	*/
	background-repeat: no-repeat;
	background-position: center;
	color: transparent; /* Hide button text */
	padding: 20px 70px;
	background-color: #e1ddeb;
	color: black;
}

}

/* Style the submit button with a specific background color etc */
input[type=submit] {
	background-color: #4e2f9c;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

/* When moving the mouse over the submit button, add a darker green color */
input[type=submit]:hover {
	background-color: #45a049;
}

/* Add a background color and some padding around the form */
.container {
	border-radius: 5px;
	background-color: #d4cee0;
	padding: 20px;
}

label {
	display: block;
}
</style>
</head>
<body>
	<!-- <div align="center"> -->
	<div class="container">
		<form method="post" action="feedback/submit">
			<label for="name">Name</label> <input type="text" id="name"
				name="name" placeholder="Your name" required> <br> <label
				for="email">Email Id</label> <input type="email" id="email"
				name="email" placeholder="Your Email Address" required> <br>
			<label for="feedback1" TextAlignment="center">Feedback</label>
			<textarea id="feedback1" name="feedback1"
				placeholder="Write your feedback here..." style="height: 200px"
				required></textarea>
			<br> <input type="submit" value="Submit">

		</form>
	</div>
	<!-- </div> -->
	</div>
</body>
</html>