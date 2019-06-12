var app = (function(){
      let init = function(){
        login_form()
      }
      let login_form =function(){
         
            let tag =
            '  First name:<br>'
            +'  <input type="text" name="firstname" >'
            +'  <br>'
            +'  Last name:<br>'
            +'  <input type="text" name="lastname" >'
            +'  <br><br>'
            +'  <button id="login" value="로그인">로그인</button>'
            +'  <button id="join" value="회원가입">회원가입</button>'
           
            ;
            template(tag)
            let login_btn = document.getElementById('login');
            let join_btn = document.getElementById('join');

            login_btn.addEventListener('click',function(e){
                e.preventDefault();
               alert("로그인 여부");
             })
            join_btn.addEventListener('click',function(e){
                e.preventDefault();
                join_form();
             })
        }

    let join_form = function(){
    
            let tag=
            '  id:<br>'
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
            +'  <button id="confirm_btn" value="회원가입">확인</button>'
            +'  <button id="cancel_btn" value="취소">취소</button>'
            template(tag)
            let confirm_btn =document.getElementById('confirm_btn');
            let cancel_btn =document.getElementById('cancel_btn');

            confirm_btn.addEventListener('click',function(e){
                e.preventDefault();
               alert("로그인 여부");
             })
            cancel_btn.addEventListener('click',function(e){
                e.preventDefault();
                login_form();
            })
           
    }

    let template = function(tag){
        let wrapper = document.querySelector("#wrapper");
        wrapper.innerHTML='<form>'+tag+'</form>';
    }


    return {init:init}; 
})();


 