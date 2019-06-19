// use
var app = {
    $wrapper: $wrapper = document.querySelector('#wrapper'),
    init:init,
}

var customer = {
    login_form:login_form,
    join_form:join_form,
    join:join,
    login:login,
    mypage:mypage,
    count:count,
    update_form:update_form,
    update:update,
    // delete:remove
}
var employee={
    login:login,
    customer_list:customer_list,
    admin_login:admin_login
};

var session={
    get_value : get_value,
    set_value:set_value
};

function set_value(x){
    return sessionStorage.setItem(x.name,x.value);
}

function get_value(x){
    return sessionStorage.getItem(x.name);
}

function login_form() {
    return '<form>' +
        ' First name:<br>' +
        ' <input type="text" id="customerId" name="customerId">' +
        ' <br>' +
        ' Last name:<br>' +
        ' <input type="text" id="password" name="password">' +
        ' <br><br>' +
        ' <input id="login-btn" type="button" value="LOGIN">' +
        ' <input id="join-btn" type="button" value="JOIN">' +
        ' <input id="admin" type="button" value="관리자"'+
        '</form> ';
};

function join_form() {
    return '<form>'+
        '  아이디<br>' +
        '  <input type="text" id="customerId" name="customerId"><br>' +

        '  이름<br>' +
        '  <input type="text" id="customerName" name="customerName"><br>' +

        '  비밀번호<br>' +
        '  <input type="text" id="password" name="password"><br>' +

        '  주민번호<br>' +
        '  <input type="text" id="ssn" name="ssn"><br>' +

        '  폰번호<br>' +
        '  <input type="text" id="phone" name="phone"><br>' +

        '  지역<br>' +
        '  <input type="text" id="city" name="city"><br>' +

        '  주소<br>' +
        '  <input type="text" id="address" name="address"><br>' +

        '  우편번호<br>' +
        '  <input type="text" id="postalcode" name="postalcode"><br><br>' +

        '  <input id="confirm-btn" type="submit" value="확인">' +
        '  <input id="cancel-btn" type="reset" value="취소">' +
        '</form>';
}

function init() {
    $wrapper.innerHTML = customer.login_form();
    let join_btn = document.querySelector('#join-btn');
    join_btn.addEventListener('click', () => {
        $wrapper.innerHTML = customer.join_form();
        document.getElementById('confirm-btn')
            .addEventListener('click', (e) => {
                e.preventDefault();
                alert('조인버튼 클릭');
                customer.join();
            });
    });
    
    let login_btn = document.querySelector('#login-btn');
    login_btn.addEventListener('click', (e) => {
        e.preventDefault();
        alert('로그인 버튼 클릭');
        customer.login({
            userid:'customerId',
            domain:'customers'
        })
      
    });

    let admin_btn = document.querySelector("#admin");
    admin_btn.addEventListener('click',(e)=>{
        e.preventDefault();
        alert('관리자 버튼 클릭');
        employee.admin_login();
    })
}

function admin_login(){
    let isAdmin = confirm("관리자입니까?");
    if(isAdmin){
        let pass = prompt("관리자");
        if(pass == 1){
            employee.customer_list();
        }else{
            alert('입력한 번호가 일치하지 않습니다.');
        }
    }else{
        alert('관리자만 접속이 가능합니다');
    }

}

function customer_list(){
    let xhr = new XMLHttpRequest();
    xhr.open('GET','customers/all', true);
    xhr.onload = () => {
            if (xhr.readyState === 4 && xhr.status === 200) {
                alert('성공');
               
            }
        };
    xhr.send();
}

function join() {
    let xhr = new XMLHttpRequest()
    let data = inputValue();

    xhr.open('POST', 'customers', true);
    xhr.setRequestHeader('Content-type', 'application/json;charset=UTF-8');
    xhr.onload = () => {
        if (xhr.readyState == 4 && xhr.status == 200) {
            let d = JSON.parse(xhr.responseText);
            if(d.result === 'SUCESS'){
                alert('회원가입 성공 : ' + d.result);
                // 로그인 폼..
            }else{
                alert('회원가입 실패');
            }
        } else {
            alert("ajax 실패");
        }
    }
    xhr.send(JSON.stringify(data));
}



function login(x){
    let id = document.getElementById(x.userid).value;
    let pass = document.getElementById('password').value;
    let xhr = new XMLHttpRequest();
    xhr.open('GET', x.domain+'/' + id + '/' + pass, true);
    xhr.onload = () => {
            if (xhr.readyState === 4 && xhr.status === 200) {
                alert('login ajax성공')
                let d = JSON.parse(xhr.responseText);
                if (d) {
                    alert('로그인성공')

                    if(x.domain==='customers'){
            
                        session.set_value({
                            'name':'user',
                            'value':d
                        });
                        
                        app.$wrapper.innerHTML = customer.mypage(d);
                        document.getElementById("goToUpdateBtn")
                        .addEventListener('click',()=>{
                            app.$wrapper.innerHTML = update_form(d);
                            document.getElementById("update")
                            .addEventListener('click',()=>{   
                                var data = inputValue();
                                alert("업데이트 네임"+document.getElementById("customerName").value)
                                customer.update(data);
                            })
                        });
                        document.getElementById("goToDeleteBtn")
                        .addEventListener('click',()=>{
                            alert("삭제아이디 : "+id)
                            remove(id)
                        })
                        
                    }else{
                        employee.customer_list();

                    }
                 
                    
                } else {
                    alert('로그인실패')
                    app.$wrapper.innerHTML = customer.login_form();
                }
            }else{
                alert('login ajax실패')
            }
        };
        xhr.send();
     
}

function count() {
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'customers/count', true);
    xhr.onload = () => {
        if (xhr.readyState === 4 && xhr.status === 200) {
            alert('성공');
            app.$wrapper.innerHTML = '총 고객수 : <h1>' + xhr.responseText + '</h1>'
        }
    }
    xhr.send();
}

function mypage(x) {
//    alert(sessionStorage.getItem('user'))

    
    alert('마이페이지로 넘어온 객체명 : '+x.customerId);
    return /* '<h1>세션'+sessionInfo+'</h1>'+ */ '<h1>'+x.customerName+'마이페이지</h1>'
    +'<span>Id '+x.customerId+'</span><br/>'
    +'<span>Name: ' +x.customerName+'</span><br/>'
    +'<span>Password: '+x.password+'</span><br/>'
    +'<span>Ssn: '+x.ssn+'</span><br/>'
    +'<span>Phone: '+x.phone+'</span><br/>'
    +'<span>City: '+x.city+'</span><br/>'
    +'<span>Address: '+x.address+'</span><br/>'
    +'<span>Postalcode: '+x.postalcode+'</span><br/>'
    +'<button id="goToUpdateBtn">업데이트하러가기</button>'
    +'<button id="goToDeleteBtn">탈퇴</button>'
};

function update_form(x){ 
    alert(x.customerId)
    var template = '<h1>수정페이지</h1>'
    +'<p>Id :' + '<input type="text" id="customerId" value="'+x.customerId+'"readonly>'+'</p>'
    +'<p>Name' + '<input type="text" id="customerName" value='+ x.customerName + '>'+'</p>'
    +'<p>Password' + '<input type="text" id="password" value='+x.password+'>'+'</p>'
    +'<p>Ssn' + '<input type="text" id="ssn" value="'+x.ssn+'" readonly >'+'</p>'
    +'<p>Phone' + '<input type="text" id="phone" value='+x.phone+'>'+'</p>'
    +'<p>City' + '<input type="text" id="city" value='+x.city+'>'+'</p>'
    +'<p>Address' + '<input type="text" id="address" value='+x.address+'>'+'</p>'
    +'<p>Postalcode' + '<input type="text" id="postalcode" value='+x.postalcode+'>'+'</p>'
    +'<button id="update">수정</button>'
    +'<button id="cancel">취소</button>'
    return template 
}

function inputValue(x){
    return {
        customerId:document.getElementById("customerId").value,
        customerName: document.getElementById("customerName").value,
        password: document.getElementById("password").value,
        ssn: document.getElementById("ssn").value,
        phone: document.getElementById("phone").value,
        city: document.getElementById("city").value,
        address: document.getElementById("address").value,
        postalcode: document.getElementById("postalcode").value,
    }
}

function update(data){
    alert(data)
    let xhr = new XMLHttpRequest();
    xhr.open('PUT','customers/'+data.customerId,true);
    xhr.setRequestHeader('Content-type', 'application/json;charset=UTF-8');
    xhr.onload=()=>{
        if (xhr.readyState === 4 && xhr.status === 200) {
            alert('성공');
            app.$wrapper.innerHTML =login_form();
        }
    };
    xhr.send(JSON.stringify(data));
}

function remove(customerId){
    let xhr = new XMLHttpRequest();
    xhr.open('DELETE','customers/'+customerId,true);
    xhr.onload=()=>{
        if (xhr.readyState === 4 && xhr.status === 200) {
            alert('제거성공');
            let wrapper = document.querySelector('#wrapper');
            wrapper.innerHTML = login_form();
        }
    };
    xhr.send();
}