<?php
session_start(); // Starting Session
$error=''; // Variable To Store Error Message\


	if($_SERVER["REQUEST_METHOD"]=="POST"){

	$enroll ="";
	
if (empty(test_input($_POST['userName'])) || empty(test_input($_POST['Password']))) {
$error = "Username or Password is invalid";
echo "in fetching data in empty";
}
else
{
	echo "in fetching data";
	$enroll="".test_input($_POST['enroll']);

	$servername = "localhost";
$username = "root";
$password = "root";
$dbname = "leave_management";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "update student set confirm=yes where enroll=".$enroll.";


$result = $conn->query($sql);

if ($result->num_rows >0) {
	 if($row = $result->fetch_assoc()) {
			$_SESSION['set']="yes" // Initializing Session 
       
    }

	echo "login sucessful";
	header("location:hello.php"); // Redirecting To Other Page
} else {
$error = "Username or Password is invalid";
}
$conn->close();
}}

function test_input($data) {
  $data = trim($data);
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}
?>
