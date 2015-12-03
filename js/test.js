
//キャラクター誕生
var ortega = {name:"オルテガ", hp:120, strength:12}
var shidoh = {name:"シドー", hp:300, strength:18}

//ステータスの表示
var nameElement = document.getElementById("name");
nameElement.innerHTML  = ortega.name

var hpElement = document.getElementById("hp");
hpElement.innerHTML = ortega.hp

var strengthElement = document.getElementById("strength");
strengthElement.innerHTML = ortega.strength

//オルテガの攻撃パターン
function attack1(){
  var takeDamagePoint = (1+Math.floor(Math.random()*10)) + ortega.strength
  shidoh.hp -= takeDamagePoint
  document.write("<p>オルテガの攻撃！</p>"+shidoh.name+"に"+takeDamagePoint+"ポイントのダメージを与えた！");
};

function attack2(){
  var takeDamagePoint = ((1+Math.floor(Math.random()*10)) + ortega.strength)*2
  shidoh.hp -= takeDamagePoint
  document.write("<p>オルテガの攻撃！</p>会心の一撃！"+shidoh.name+"に"+takeDamagePoint+"ポイントのダメージを与えた！");
};



//実行クラス

attack1();
attack2();




console.log(shidoh.hp);







//console.info(nameElement.tagName);
//console.info(nameElement.innerText);


//console.info(name)

// document.write("<p>"+ortega.name+"</p>")

// attack = 25
// [35]
// systm.out.println("["+attack+"]")

// [attack]
