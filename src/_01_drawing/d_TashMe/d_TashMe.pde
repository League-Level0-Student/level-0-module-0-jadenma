PImage face;
PImage mustache;
void setup() {
  face = loadImage("face.jpg");
size(500, 500);
face.resize(500, 500);
mustache = loadImage("mustache.png");
mustache.resize(200, 100);

  }

void draw() {
  
background(face);
if (mousePressed){
image (mustache, mouseX-100,mouseY-50);
}
}
