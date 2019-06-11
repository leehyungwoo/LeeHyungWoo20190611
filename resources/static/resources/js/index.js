var myVariable = document.querySelector("#wrapper");

wrapper.innerHTML=
"<h1>SPA 시작</h1>"+
"<div id='target'>삭제할내용</div>"+
"<button id='btn'>지우자</button>"+
"<button id='btn2'>추가하자</button>"
;

var btn = document.querySelector("#btn");
var btn2 = document.querySelector("#btn2");
var target = document.querySelector('#target');

btn.addEventListener("click",function(){
    target.innerHTML="";
})

btn2.addEventListener("click",function(){
    var temp = document.createTextNode("안녕");
    target.appendChild(temp);
})
