
PImage baby;
void setup() {
  size(500, 500);

  baby = loadImage("fistPump.png");
  baby.resize(500, 500);
  textSize(27);
}
void draw() {
  background(baby);
  fill(255);
  text("TESTED MY PROGRAM", 75, 75);

  if (mousePressed) {
    fill(250, 0, 0);
    text("IT WORKED FIRST TIME", 75, 425);
  }
}
