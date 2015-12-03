function Hoge(name) {
  // this.name = "おるてが"
  // this.hp = 100
  if(name) this.name = name
  this.name = name || this.name
}
Hoge.prototype = {
  name: "おるてが",
  hp: 100,
  damaged: function(damage) {
    this.hp -= damage;
    console.info(damage + "ポイントのダメージ！")
  }
}

console.info(Hoge)

console.info(new Hoge());

var h = new Hoge("ゾーマ");

console.info(h.name)

h.damaged(45)
console.info(h.hp)
