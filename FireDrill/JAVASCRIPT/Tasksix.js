let number = 10;
let multiple = 1;
let multipleOf = 1;
for(let count = 1; count <= 10; count++){
if(count % 4 == 0 && count != 8){
for(let counter = 1; counter <=5; counter++){
multiple *= count;

console.log(" "+ multiple);
}
}
if(count % 4 == 0 && count != 4){
for(let counter = 1; counter <=5; counter++){
multipleOf *= count;
console.log(" "+ multipleOf);
}
}
}
