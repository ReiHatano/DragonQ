function Chara() {
  this.name = ""
  this.hp = 100
  this.damaged = function(damage) {
    this.hp -= damage;
    console.info(damage + "ポイントのダメージ！")
  }
}

var ortega = new Chara()
ortega.name = "オルテガ"
ortega.hp = 200

var zoma = new Chara()
zoma.name = "ゾーマ"
zoma.hp = 1000
