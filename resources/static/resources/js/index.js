var app = (function(){
      let init = function(){
        login_form()
      }
      let login_form =function(){
            let wrapper = document.querySelector("#wrapper");
            wrapper.innerHTML='<form>'
            +'  First name:<br>'
            +'  <input type="text" name="firstname" >'
            +'  <br>'
            +'  Last name:<br>'
            +'  <input type="text" name="lastname" >'
            +'  <br><br>'
            +'  <button id="login" value="로그인">로그인</button>'
            +'  <button id="join" value="회원가입">회원가입</button>'
            +'</form> '
            ;

            let join_btn = document.getElementById('join')
            join_btn.addEventListener('click',function(){
                 join_form();
             })
        }

    let join_form = function(){
        let wrapper = document.querySelector("#wrapper");
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

    }

    return {init:init}; 
})();


 