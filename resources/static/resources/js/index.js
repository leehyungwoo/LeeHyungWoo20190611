var app = (function(){
      let init = function(){
        login_form()
      }
      let login_form =function(){
            var wrapper = document.querySelector("#wrapper");
            var loginFormTxt = '<form>' 
            +'  First name:<br>'
            +'  <input type="text" name="firstname" >'
            +'  <br>'
            +'  Last name:<br>'
            +'  <input type="text" name="lastname" >'
            +'  <br><br>'
            +'  <button id="login" value="로그인">로그인</button>'
            +'  <button id="signUp" value="회원가입">회원가입</button>'
            +'</form> '
            ;
            
            wrapper.innerHTML=loginFormTxt;

            var loginBtn = document.querySelector("#login");
            var signUp = document.querySelector("#signUp");
            loginBtn.addEventListener("click",function(){
                alert("로그인 Y/N");
            })
    
            signUp.addEventListener("click",function(){

                wrapper.innerHTML='<form>'
                +'  id:<br>'
                +'  <input type="text" name="u_id" >'
                +'  <br>'
                +'  password:<br>'
                +'  <input type="password" name="password" >'
                +'  <br>'
                +'  name:<br>'
                +'  <input type="text" name="name" >'
                +'  <br>'
                +'  email:<br>'
                +'  <input type="text" name="email" >'
                +'  <br>'
                +'  phone:<br>'
                +'  <input type="text" name="phone" >'
                +'  <br>'
                +'  <br><br>'
                +'  <button id="confirm" value="회원가입">확인</button>'
                +'  <button id="cancel" value="취소">취소</button>'
                +'</form> '
                ;
                var confirm = document.querySelector('#confirm');
                var cancel =document.querySelector('#cancel');

                confirm.addEventListener('click',function(){
                    wrapper.innerHTML=loginFormTxt;
                })
                cancel.addEventListener('click',function(){
                    wrapper.innerHTML=loginFormTxt;
                })
            })
    }
    return {init:init}; 
})();


 