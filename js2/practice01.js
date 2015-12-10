
var ortega = {name:"オルテガ", hp:120, mp:50, strength:12}
var longSword = {name:"ロングソード",power:7}
var scaleShield = {name:"うろこの盾",power:6}
//ステータスの表示
var nameElement = document.getElementById("name");
nameElement.innerHTML  = ortega.name

var hpElement = document.getElementById("hp");
hpElement.innerHTML = ortega.hp

var mpElement = document.getElementById("mp");
mpElement.innerHTML = ortega.mp

var strengthElement = document.getElementById("strength");
strengthElement.innerHTML = ortega.strength

var weaponElement = document.getElementById("weapon");
weaponElement.innerHTML = longSword.name

var shieldElement = document.getElementById("shield");
shieldElement.innerHTML = scaleShield.name


var equipWeapon = function(){
  
}
