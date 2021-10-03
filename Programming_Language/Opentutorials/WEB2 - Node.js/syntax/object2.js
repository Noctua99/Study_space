var f = function () {
    console.log(1 + 1);
    console.log(1 + 2);
}
// function은 처리방법들을 담고 있는 구문이면서 그 자체로 값이 될 수 있다
// var i = if(true){console.log(1)}; 조건문은 값이 될 수 없다
// var w =while (true) { console.log(1) }; 반복문은 값이 될 수 없다

var a = [f];
a[0]();
// 배열의 원소로서 함수가 존재할 수 있다

var o = {
    func: f
}
o.func();
// 객체의 원소로서 함수가 존재할 수 있다