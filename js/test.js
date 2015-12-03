

var ortega = {name:"オルテガ", hp:120, strength:12}
var shidoh = {name:"シドー", hp:300, strength:18}

var nameElement = document.getElementById("name");
nameElement.innerHTML  = ortega.name

var hpElement = document.getElementById("hp");
hpElement.innerHTML = ortega.hp

var strengthElement = document.getElementById("strength");
strengthElement.innerHTML = ortega.strength

function attack(a){
  shidoh.hp -= a*2
};

attack(50);




console.log(shidoh.hp);







//console.info(nameElement.tagName);
//console.info(nameElement.innerText);


//console.info(name)

// document.write("<p>"+ortega.name+"</p>")

// attack = 25
// [35]
// systm.out.println("["+attack+"]")

// [attack]
