//DragonQ_JsEdition

//キャラクター誕生
var ortega = {name:"オルテガ", hp:240, maxHp:240, strength:12, maxStrength:12, equipStatus:0}
var shidoh = {name:"シドー", hp:160, strength:18}

//やくそう使用
function useHerb(){
  if((ortega.maxHp-ortega.hp)>=30){
    ortega.hp+=30;
    hpElement.innerHTML=ortega.hp;
    window.alert(ortega.name+"は薬草を食べた！体力が回復した！");
  }else{
    ortega.hp=ortega.maxHp;
    hpElement.innerHTML=ortega.hp;
  }
};



//呪文
function castBaikilt(){
  if(ortega.strength<(ortega.maxStrength*2)){
    ortega.strength=ortega.strength*2;
    strengthElement.innerHTML=ortega.strength;
  window.alert(ortega.name+"はちからが増大した！");
  }else{
    window.alert("なにも起こらなかった・・");
  }
}

function castGigadein(){
  shidoh.hp -= 150+(Math.floor(Math.random()*30));
  window.alert("オルテガは稲妻を呼び寄せた！"+shidoh.name+"に"+(150+(Math.floor(Math.random()*30)))+"ポイントのダメージ！");
  console.log(shidoh.hp);
}


  document.getElementById('btn2').onclick = function(){
    for(var i=0; i<document.magic.contact.length;i++){
      if(document.magic.contact[0].checked){
        castBaikilt();
        break;
      }else if(document.magic.contact[1].checked){
        castGigadein();
        break;
      }
    }
  }

//武器の装備
function equipWeapon(weaponName, weaponPower){
  ortega.strength+=weaponPower;
  strengthElement.innerHTML=ortega.strength;
  window.alert("オルテガは"+weaponName+"を装備した！");
}

document.getElementById('btn3').onclick = function(){
  if (ortega.equipStatus == 0){
    for(var i=0; i<document.magic.contact.length;i++){
      if(document.weapon.contact[0].checked){
        equipWeapon("はがねのつるぎ",7);
        ortega.equipStatus += 1;
        break;
      }else if(document.weapon.contact[1].checked){
        equipWeapon("破壊の鉄球",125);
        ortega.equipStatus += 1;
        break;
      }
    }
  }else{
    window.alert("これ以上装備できない！");
  }
}


//武器の装備解除
document.getElementById('btn4').onclick = function(){
  if(ortega.equipStatus==1){
    ortega.equipStatus=0;
    disarmWeapon();
  }else{
    window.alert("何も装備していない！");
  }
}

function disarmWeapon(){
  ortega.strength=12;
  strengthElement.innerHTML=ortega.strength;
  window.alert("装備を外した！");
}

//ステータスの表示
var nameElement = document.getElementById("name");
nameElement.innerHTML  = ortega.name

var hpElement = document.getElementById("hp");
hpElement.innerHTML = ortega.hp

var strengthElement = document.getElementById("strength");
strengthElement.innerHTML = ortega.strength


//共通化済みアタック関数
var attack = function(attacker,defender){
  var takeDamagePoint = (1+Math.floor(Math.random()*10)) + attacker.strength;
  defender.hp -= takeDamagePoint;
  document.write("<p>"+attacker.name+"の攻撃！</p>"+defender.name+"に"+takeDamagePoint+"ポイントのダメージ！")
};


//戦闘システム
var arr = [ortega, shidoh];

var battle =function()
  {
       turn = 0;
       while (0 < arr[0].hp && 0 < arr[1].hp)
          {
            attack(arr[turn],arr[1-turn]);
            turn = 1 - turn;
            if(ortega.hp<0){ortega.hp=0;};
          };
  };


//実行クラス
//attack(ortega.strength, shidoh.hp, ortega.name, shidoh.name);
//attack(shidoh.strength, ortega.hp, shidoh.name, ortega.name);
battle();
hpElement.innerHTML=ortega.hp;




/*
document.getElementById('form').select.onchange = function(){
  document.write(OK);
};
*/




//ここから下はソースの保管庫




/*
//オルテガの攻撃パターン
var ortega_attack = function(){
  var takeDamagePoint = (1+Math.floor(Math.random()*10)) + ortega.strength
  shidoh.hp -= takeDamagePoint
  document.write("<p>オルテガの攻撃！</p>"+shidoh.name+"に"+takeDamagePoint+"ポイントのダメージを与えた！");
};

attack2 :
function(){
  var takeDamagePoint = ((1+Math.floor(Math.random()*10)) + ortega.strength)*3
  shidoh.hp -= takeDamagePoint
  document.write("<p>オルテガの攻撃！</p>会心の一撃！"+shidoh.name+"に"+takeDamagePoint+"ポイントのダメージを与えた！");
}

//シドーの攻撃パターン
var shidoh_attack = function(){
  var takeDamagePoint = (1+Math.floor(Math.random()*10)) + shidoh.strength
  ortega.hp -= takeDamagePoint
  hpElement.innerHTML = ortega.hp
  document.write("<p>シドーの攻撃！</p>"+ortega.name+"は"+takeDamagePoint+"ポイントのダメージを受けた！");
};

attack2:
function(){
  var takeDamagePoint = (1+Math.floor(Math.random()*10)) + 30
  ortega.hp -= takeDamagePoint
  hpElement.innerHTML = ortega.hp
  document.write("<p>シドーは燃え盛る火炎を吐いた！</p>"+ortega.name+"は"+takeDamagePoint+"ポイントのダメージを受けた！");
}

*/

/*
//戦闘システム
var arr = [ortega, shidoh];

var battle =function()
  {
       var turn = 0;
       while (0 < arr[0].hp && 0 < arr[1].hp)
          {
            arr[turn].attack()
            turn = 1 - turn;
          };

  };
*/
