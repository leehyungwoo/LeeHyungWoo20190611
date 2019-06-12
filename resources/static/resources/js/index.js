var app = (()=>{
      let init =()=>{
        login_form()
      }
      let login_form =()=>{
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
            join_btn.addEventListener('click',()=>{
                 join_form();
             })
        }

    let join_form =()=>{
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

    }

    return {init:init}; 
})();


 