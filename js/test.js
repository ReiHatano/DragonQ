
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
function ortega_attack(){
  var takeDamagePoint = (1+Math.floor(Math.random()*10)) + ortega.strength
  shidoh.hp -= takeDamagePoint
  document.write("<p>オルテガの攻撃！</p>"+shidoh.name+"に"+takeDamagePoint+"ポイントのダメージを与えた！");
};
/*
function attack2(){
  var takeDamagePoint = ((1+Math.floor(Math.random()*10)) + ortega.strength)*2
  shidoh.hp -= takeDamagePoint
  document.write("<p>オルテガの攻撃！</p>会心の一撃！"+shidoh.name+"に"+takeDamagePoint+"ポイントのダメージを与えた！");
};
*/

//シドーの攻撃パターン
function shidoh_attack(){
  var takeDamagePoint = (1+Math.floor(Math.random()*10)) + shidoh.strength
  ortega.hp -= takeDamagePoint
  hpElement.innerHTML = ortega.hp
  document.write("<p>シドーの攻撃！</p>"+ortega.name+"は"+takeDamagePoint+"ポイントのダメージを受けた！");
};
/*
function Sattack2(){
  var takeDamagePoint = (1+Math.floor(Math.random()*10)) + 30
  ortega.hp -= takeDamagePoint
  hpElement.innerHTML = ortega.hp
  document.write("<p>シドーは燃え盛る火炎を吐いた！</p>"+ortega.name+"は"+takeDamagePoint+"ポイントのダメージを受けた！");
};
*/
//戦闘システム
var arr = [ortega, shidoh];
function battle() {
       var turn = 0;
       while (0 < arr[0].hp && 0 < arr[1].hp) {

           arr[turn]_attack();

           }
           turn = 1 - turn;
       }


//実行クラス
battle();
/*
var arr = [ortega, shidoh];

attack1();
attack2();
Sattack1();
Sattack2();




console.log(shidoh.hp);
console.log(ortega.hp);
*/
