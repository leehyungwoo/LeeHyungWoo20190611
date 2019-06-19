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
    update:update,
    delete:remove
}
function login_form() {
    return '<form action="/action_page.php">' +
        ' First name:<br>' +
        ' <input type="text" id="customerId" name="customerId">' +
        ' <br>' +
        ' Last name:<br>' +
        ' <input type="text" id="password" name="password">' +
        ' <br><br>' +
        ' <input id="login-btn" type="button" value="LOGIN">' +
        ' <input id="join-btn" type="button" value="JOIN">' +
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
        login();
    });
}

function join() {
    let xhr = new XMLHttpRequest()
    let data = {
        customerId: document.getElementById("customerId").value,
        customerName: document.getElementById("customerName").value,
        password: document.getElementById("password").value,
        ssn: document.getElementById("ssn").value,
        phone: document.getElementById("phone").value,
        city: document.getElementById("city").value,
        address: document.getElementById("address").value,
        postalcode: document.getElementById("postalcode").value,
    }


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

function login(){
    id = document.getElementById('customerId').value;
    pass = document.getElementById('password').value;
    let xhr = new XMLHttpRequest();
    xhr.open('GET', 'customers/' + id + '/' + pass, true);
    xhr.onload = () => {
        if (xhr.readyState === 4 && xhr.status === 200) {
            alert('login ajax성공')
            let d = JSON.parse(xhr.responseText);
            if (d) {
                alert('로그인성공')
                $wrapper.innerHTML = customer.mypage(d);
            } else {
                alert('로그인실패')
                $wrapper.innerHTML = customer.login_form();
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
            let wrapper = document.querySelector('#wrapper');
            wrapper.innerHTML = '총 고객수 : <h1>' + xhr.responseText + '</h1>'
        }
    }
    xhr.send();
}



function mypage(x) {
    let customer = x;
    alert('마이페이지로 넘어온 객체명 : '+x.customerName);
    return '<h1>마이페이지</h1> ';
};



function update(){
    let customerId = document.getElementById('customerId').value;
    let xhr = new XMLHttpRequest();
    xhr.open('PUT','customers/'+customerId,true);
    xhr.onload=()=>{
        if (xhr.readyState === 4 && xhr.status === 200) {
            alert('성공');
            let wrapper = document.querySelector('#wrapper');
            wrapper.innerHTML = '총 고객수 : <h1>' + xhr.responseText + '</h1>'
        }
    };
    xhr.send();
}

function remove(){
    let customerId = document.getElementById('customerId').value;
    let xhr = new XMLHttpRequest();
    xhr.open('DELETE','customers/'+customerId,true);
    xhr.onload=()=>{
        if (xhr.readyState === 4 && xhr.status === 200) {
            alert('성공');
            let wrapper = document.querySelector('#wrapper');
            wrapper.innerHTML = '총 고객수 : <h1>' + xhr.responseText + '</h1>'
        }
    };
    xhr.send();
}