function validateForm(){
	var flag = true;
	var mamay = document.getElementById("mamay");
	var vitri = document.getElementById("vitri");
	var trangthai = document.getElementById("trangthai");
	var makh = document.getElementById("makh");
	var tenkh = document.getElementById("tenkh");
	var diachi = document.getElementById("diachi");
	var sdt = document.getElementById("sdt");
	var email = document.getElementById("email");
	var madv = document.getElementById("madv");
	var tendv = document.getElementById("tendv");
	var donvitinh = document.getElementById("donvitinh");
	var dongia = document.getElementById("dongia");
	var ngaysd = document.getElementById("ngaysd");
	var giosd = document.getElementById("giosd");
	var soluong = document.getElementById("soluong");
	var thoigiansd = document.getElementById("thoigiansd");
	
	const phoneValid= /([(84)+90|(84)+91|090|091])+([0-9]{7})\b/;
	const emailValid = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	const numberValid = /^[0-9]+$/;
	const makhValid = /^KH+[0-9]{5}$/;
	const madvValid = /^DV+[0-9]{3}$/;
	
	//may
	if(mamay!=null&&mamay.value==""){
	    document.getElementById("mamay1").innerText="Loi";
	    flag= false;
	}else if(mamay!=null){
	    document.getElementById("mamay1").innerText="";
	}
	if(vitri!=null&&vitri.value==""){
	    document.getElementById("vitri1").innerText="Loi";
	    flag= false;
	}else if(vitri!=null){
	    document.getElementById("vitri1").innerText="";
	}
	if(trangthai!=null&&trangthai.value==""){
	    document.getElementById("trangthai1").innerText="Loi";
	    flag= false;
	}else if(trangthai!=null){
	    document.getElementById("trangthai1").innerText="";
	}
	//kh
	if(makh!=null&&(!makhValid.test(makh.value)||makh.value=="")){
	    document.getElementById("makh1").innerText="Loi";
	    flag= false;
	}else if(makh!=null){
	    document.getElementById("makh1").innerText="";
	}
	if(tenkh!=null&&tenkh.value==""){
	    document.getElementById("tenkh1").innerText="Loi";
	    flag= false;
	}else if(tenkh!=null){
	    document.getElementById("tenkh1").innerText="";
	}
	if(diachi!=null&&diachi.value==""){
	    document.getElementById("diachi1").innerText="Loi";
	    flag= false;
	}else if(diachi!=null){
	    document.getElementById("diachi1").innerText="";
	}
	if(sdt!=null&&(sdt.value==""||!phoneValid.test(sdt.value))){
	    document.getElementById("sdt1").innerText="Loi";
	    flag= false;
	}else if(sdt!=null){
	    document.getElementById("sdt1").innerText="";
	}
	if(email!=null&&(email.value==""||!emailValid.test(email.value))){
	    document.getElementById("email1").innerText="Loi";
	    flag= false;
	}else if(email!=null){
	    document.getElementById("email1").innerText="";
	}
	//dv
	if(madv!=null&&(!madvValid.test(madv.value)||madv.value=="")){
	    document.getElementById("madv1").innerText="Loi";
	    flag= false;
	}else if(madv!=null){
	    document.getElementById("madv1").innerText="";
	}
	if(tendv!=null&&tendv.value==""){
	    document.getElementById("tendv1").innerText="Loi";
	    flag= false;
	}else if(tendv!=null){
	    document.getElementById("tendv1").innerText="";
	}
	if(donvitinh!=null&&donvitinh.value==""){
	    document.getElementById("donvitinh1").innerText="Loi";
	    flag= false;
	}else if(donvitinh!=null){
	    document.getElementById("donvitinh1").innerText="";
	}
	if(dongia!=null&&(dongia.value==""||!numberValid.test(dongia.value))){
	    document.getElementById("dongia1").innerText="Loi";
	    flag= false;
	}else if(dongia!=null){
	    document.getElementById("dongia1").innerText="";
	}
	//sd
	if(ngaysd!=null&&ngaysd.value==""){
	    document.getElementById("ngaysd1").innerText="Loi";
	    flag= false;
	}else if(ngaysd!=null){
	    document.getElementById("ngaysd1").innerText="";
	}
	if(giosd!=null&&giosd.value==""){
	    document.getElementById("giosd1").innerText="Loi";
	    flag= false;
	}else if(giosd!=null){
	    document.getElementById("giosd1").innerText="";
	}
	if(thoigiansd!=null&&(thoigiansd.value==""||!numberValid.test(thoigiansd.value))){
	    document.getElementById("thoigiansd1").innerText="Loi";
	    flag= false;
	}else if(thoigiansd!=null){
	    document.getElementById("thoigiansd1").innerText="";
	}
	if(soluong!=null&&(soluong.value==""||!numberValid.test(soluong.value))){
	    document.getElementById("soluong1").innerText="Loi";
	    flag= false;
	}else if(soluong!=null){
	    document.getElementById("soluong1").innerText="";
	}

	return flag;
}