function comprobacionRango(){
	var value;
	x=document.getElementById("try").value();
	if(x>10 && x<1){
		alert("El numero debe estar entre 1 y 10");
		return false;
	}
}