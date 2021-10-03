var M = {
    v: 'v',
    f: function () {
        console.log(this.v);
    }
}

module.exports = M;
// 모듈이 담겨있는 mpart.js에 있는 여러 기능 중에서 M이 가리키는 객체를 이 모듈 바깥에서 사용할 수 있또록 export하겠다