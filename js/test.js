//DragonQ_JsEdition

//キャラクター誕生
var ortega = {name:"オルテガ", hp:240, strength:12}
var shidoh = {name:"シドー", hp:160, strength:18}

//やくそう使用
function useHerb(){
  ortega.hp+=30;
  hpElement.innerHTML=ortega.hp;
};

function useStrongHerb(){
  ortega.hp+=100;
  hpElement.innerHTML=ortega.hp;
};


  document.getElementById('btn').onclick = function(){
    window.alert(document.item.select.value);
  }


//呪文
function castBaikilt(){
  ortega.strength=ortega.strength*2;
  strengthElement.innerHTML=ortega.strength;
}

function castGigadein(){
  shidoh.hp -= 180;
  hpElement.innerHTML=shidoh.hp;
  document.write("<p>オルテガは稲妻を呼び寄せた！</p>"+shidoh.name+"に180のダメージ！");
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



//ステータスの表示
var nameElement = document.getElementById("name");
nameElement.innerHTML  = ortega.name

var hpElement = document.getElementById("hp");
hpElement.innerHTML = ortega.hp

var strengthElement = document.getElementById("strength");
strengthElement.innerHTML = ortega.strength


//共通化済みアタック関数
var attack = function(attackerStrength,defenderHp,attackerName,defenderName){
  var takeDamagePoint = (1+Math.floor(Math.random()*10)) + attackerStrength;
  defenderHp -= takeDamagePoint;
  arr[1-turn].hp = defenderHp;
  document.write("<p>"+attackerName+"の攻撃！</p>"+defenderName+"に"+takeDamagePoint+"ポイントのダメージ！")
};


//戦闘システム
var arr = [ortega, shidoh];

var battle =function()
  {
       turn = 0;
       while (0 < arr[0].hp && 0 < arr[1].hp)
          {
            attack(arr[turn].strength,arr[1-turn].hp,arr[turn].name,arr[1-turn].name);
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
var arr = [ortega, shidoh];

attack1();
attack2();
Sattack1();
Sattack2();




console.log(shidoh.hp);
console.log(ortega.hp);
*/


/*
function charactor(name,hp,strength){
  this.name = name;
  this.hp = hp;
  this.strength = strength;
}

var ortega = new charactor('オルテガ',120,12);

console.log(ortega);
*/
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
