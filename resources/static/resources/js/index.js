var app = (()=>{
      let init =()=>{
        login_form()
      }
      let login_form =()=>{
            let wrapper = document.querySelector("#wrapper");
            wrapper.innerHTML='<form>'
            +'  First name:<br>'
            +'  <input type="text" id="customerId" name="customerId" >'
            +'  <br>'
            +'  Last name:<br>'
            +'  <input type="text" id="password" name="password" >'
            +'  <br><br>'
            +'  <button id="login-btn" value="로그인">로그인</button>'
            +'  <button id="join-btn" value="회원가입">회원가입</button>'
            +'</form> '
            ;

            let join_btn = document.querySelector('#join-btn');
            join_btn.addEventListener('click',()=>{
                 join_form();
            });
            
            let login_btn=document.querySelector('#login-btn');
            login_btn.addEventListener('click',(e)=>{
                e.preventDefault();
                alert('로그인 버튼 클릭');
                id = document.getElementById('customerId').value;
                pass = document.getElementById('password').value;
                
                let xhr = new XMLHttpRequest(),
                    method ='GET',
                    url = 'login/'+id+'/'+pass;
                    xhr.open(method,url,true);
                    xhr.onreadystatechange = ()=>{
                        if(xhr.readyState === 4 && xhr.status === 200){
                            let d = xhr.responseText
                            if(d==='SUCESS'){
                                let wrapper = document.querySelector("#wrapper");
                                wrapper.innerHTML='<h1>마이페이지<h1> '
                                ;
                            }else{
                                let wrapper = document.querySelector("#wrapper");
                                wrapper.innerHTML='<form>'
                                +'  First name:<br>'
                                +'  <input type="text" id="customerId" name="customerId" >'
                                +'  <br>'
                                +'  Last name:<br>'
                                +'  <input type="text" id="password" name="password" >'
                                +'  <br><br>'
                                +'  <button id="login-btn" value="로그인">로그인</button>'
                                +'  <button id="join-btn" value="회원가입">회원가입</button>'
                                +'</form> '
                                ;
                            }
                        }
                    }
                    xhr.send();    
            });
        }
    
    let count =()=>{
        let xhr= new XMLHttpRequest();
        method = 'GET';
        url = 'count';  
        xhr.open(method,url,true);
        xhr.onreadystatechange = () => {
            if(xhr.readyState === 4 && xhr.status === 200){
                alert("성공");
                let wrapper = document.querySelector("#wrapper");
                wrapper.innerHTML = '총 고객수 : <h1>'+ xhr.responseText +'</h1>';
            }
        }   
        xhr.send();
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


 