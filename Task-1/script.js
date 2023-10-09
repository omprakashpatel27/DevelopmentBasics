var cnt = 0;
var messageDec = "Unable to Decrement !!!";
var messageInc = "Unable to Increment !!!";
function Increase(){
	if(cnt == 100){
		document.getElementById("num").innerHTML = messageInc;
	}
	else{
		cnt++;
		document.getElementById("num").innerHTML = cnt; 
	}
}

function Decrease(){
	if(cnt == 0){
		document.getElementById("num").innerHTML = messageDec;
	}
	else{
		cnt--;
		document.getElementById("num").innerHTML = cnt; 
	}
}