var number = [1, 400, 12, 34, 5];
var i = 0;
var sum = 0;
while (i < number.length) {
    console.log(number[i]);
    sum = sum + number[i];
    i++;
}
console.log(`sum = ${sum}`);